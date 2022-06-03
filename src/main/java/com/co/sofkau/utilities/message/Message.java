package com.co.sofkau.utilities.message;

import com.co.sofkau.utilities.Player;
import com.co.sofkau.utilities.Question;
import org.jboss.logging.Logger;

import java.util.ArrayList;
import java.util.List;

public class Message {

    private static final Logger logger = Logger.getLogger(Message.class);

    public static Message getInstance() {
        return new Message();
    }

    public void showWelcome() {
        logger.info("BIENVENIDO A QUIEN QUIERE GANAR " +
                "1 - Jugar" +
                "2 - Ranking de juego " +
                "3 - Reiniciar juego" +
                "4 - Salir");
    }

    public void getUser() {
        logger.info("Por favor digite su nombre completo.");
    }

    public void showQuestion(Question question) {
        logger.info(question.getDescription() +
               "A." + question.getAnswerFalse1()+
               "B." + question.getAnswerTrue() +
               "C." + question.getAnswerFalse2() +
               "D." + question.getAnswerFalse4());
    }

    public void showMessageWin(Player player) {
        logger.info("**************** Felicitaciones \" + player.getName() + \" has ganado ****************");
    }

    public void showMessageGameOver(Player player) {
        logger.info("**************** Game Over \" + player.getName() + \"  ****************");
    }

    public void showMessageQuestionCorrect(Player player) {
        logger.info("**************** Respuesta Correcta!!!  ****************");
    }

    public void showMessageQuestionInCorrect(Player player) {
        logger.info("**************** Respuesta InCorrecta!!!  ****************");
    }

    public void showHistory(ArrayList<Player> listJuagadores){
        logger.info("Rancking de juego :");

        listJuagadores.stream().forEach( player -> {
            logger.info(player.toString());
        });
    }
}
