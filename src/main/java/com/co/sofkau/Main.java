package com.co.sofkau;

import com.co.sofkau.db.DaoPlayer;
import com.co.sofkau.db.DaoQuestion;
import com.co.sofkau.utilities.MyException;
import com.co.sofkau.utilities.MyScanner;
import com.co.sofkau.utilities.Player;
import com.co.sofkau.utilities.Question;
import com.co.sofkau.utilities.message.Message;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static Message messages = Message.getInstance();
    static MyScanner scanner = MyScanner.getInstance();
    static DaoPlayer daoPlayer = new DaoPlayer();

    private static ArrayList<Player> listPlayer = new ArrayList<>();

    private static int flagGeneral = 0;


    public static void main(String[] args) {
        init();
    }

    public static void init() {
        Boolean flag = true;
        Integer option;
        Player player = new Player();
        listPlayer = daoPlayer.getPlayers();

        while (Boolean.TRUE.equals(flag)) {
            try {
                if(flagGeneral == 0) {
                    messages.showWelcome();
                    player.setName(scanner.getString());
                    player.setScore(0);
                }
                messages.showMenu();
                flag = selectOption(scanner.getString(), player);
            } catch (MyException myException) {
                messages.showMessage(myException.getMessage());
                messages.pressAnyKeyToContinue();
            }
        }
    }

    private static Boolean selectOption(String option, Player player) {
        switch (option) {
            case "1":
                play(player);//play()
                break;
            case "2":
                showRanking();
                break;
            case "3":
                restart();
                break;
            case "4":
                return false;

            default:
                messages.pressAnyKeyToContinue();
        }
        return true;
    }

    /**
     * Inicia el juego
     */

    private static void play(Player player) {
        Integer category = 1;
        Integer score = 0;
        DaoQuestion daoQuestion = new DaoQuestion();
        Boolean flag = true;
        while (Boolean.TRUE.equals(flag)) {
            Question question = daoQuestion.selectQuestionRandom(category);

            messages.showQuestion(question);
            Integer answerUser = scanner.getInteger();
            if (question.validateAnswer(answerUser-1)) {
                player.incrementScore();
                messages.showMessageQuestionCorrect(player, player.getScore());
                if(category == 5){
                    messages.showMessageWin(player);
                    saveHistory(player);
                    flag = false;
                    flagGeneral = 1;
                }
                category += 1;
            } else {
                messages.showMessageQuestionInCorrect(player);
                messages.showMessageGameOver(player);
                flag = false;
            }
        }
    }

    private static void showRanking(){

        messages.showHistory(listPlayer);
        flagGeneral = 1;
    }


    private static void saveHistory(Player player){

        listPlayer.add(player);
        daoPlayer.savePlayers(daoPlayer.getTxtPlayers(), listPlayer);

    }
    private static void restart(){
        flagGeneral = 0;
    }
}