package com.co.sofkau;

import com.co.sofkau.db.DaoPlayer;
import com.co.sofkau.db.DaoQuestion;
import com.co.sofkau.utilities.MyException;
import com.co.sofkau.utilities.MyScanner;
import com.co.sofkau.utilities.Player;
import com.co.sofkau.utilities.Question;
import com.co.sofkau.utilities.message.Message;
import java.util.ArrayList;


/**
 * Clase que inicializa la aplicacion.
 *
 * @author JD-Amaya
 * @version 01.02.003 03/06/2022
 * @since 01.
 */
public class Main {
    static Message messages = Message.getInstance();
    static MyScanner scanner = MyScanner.getInstance();
    static DaoPlayer daoPlayer = new DaoPlayer();

    private static ArrayList<Player> listPlayer = new ArrayList<>();

    private static int flagGeneral = 0;


    public static void main(String[] args) {
        init();
    }

    /**
     * Metodo iniciador de la aplicación
     * ejecuta un ciclo infinito hasta que el
     * usuario determine salir del juego.
     */
    public static void init() {
        Boolean flag = true;
        Player player = new Player();
        listPlayer = daoPlayer.getPlayers();

        while (Boolean.TRUE.equals(flag)) {
            try {
                if (flagGeneral == 0) {
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

    /**
     * Permite direccionar al metodo seleccionado por el usuario.
     *
     * @param option opcion seleccionda por el usuario.
     * @param player Jugador actual.
     * @return true para o false para seguir ejecutando el menu
     */
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
     * Inicia el juego, ejecuta el ciclo infinito
     * hasta que el usuario elija la opcion de salir.
     */

    private static void play(Player player) {
        int category = 1;
        DaoQuestion daoQuestion = new DaoQuestion();
        boolean flag = true;
        while (Boolean.TRUE.equals(flag)) {
            Question question = daoQuestion.selectQuestionRandom(category);

            messages.showQuestion(question);
            Integer answerUser = scanner.getInteger();
            if (Boolean.TRUE.equals(question.validateAnswer(answerUser - 1))) {
                player.incrementScore();
                messages.showMessageQuestionCorrect(player, player.getScore());
                if (category == 5) {
                    messages.showMessageWin(player);
                    saveHistory(player);
                    flag = false;
                    flagGeneral = 1;
                }
                category += 1;
            } else {
                messages.showMessageQuestionInCorrect();
                messages.showMessageGameOver(player);
                flag = false;
            }
        }
    }

    /**
     * Metodo que muestra el todo el ranking el historial
     * del todos los jugadores.
     */
    private static void showRanking() {

        messages.showHistory(listPlayer);
        flagGeneral = 1;
    }

    /**
     * Permite guardar en el archivo player.txt
     * el historial de los jugadores.
     *
     * @param player Jugador en curso.
     */
    private static void saveHistory(Player player) {

        listPlayer.add(player);
        daoPlayer.savePlayers(daoPlayer.getTxtPlayers(), listPlayer);
    }

    /**
     * Permite reiniciar el juego,
     * igualamos a cero para romper el ciclo.
     */
    private static void restart() {
        flagGeneral = 0;
    }
}