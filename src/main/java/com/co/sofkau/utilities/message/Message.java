package com.co.sofkau.utilities.message;

import com.co.sofkau.utilities.MyException;
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

    public void showWelcome(){
        logger.info("""
                BIENVENIDO A QUIEN QUIERE GANAR 
                Por favor ingrese su nombre..""");
    }

    public void showMenu() {
        logger.info("""
                BIENVENIDO A QUIEN QUIERE GANAR 
                1 - Jugar
                2 - Ranking de juego 
                3 - Reiniciar juego
                4 - Salir""");
    }



    public void showQuestion(Question question) {
        logger.info(
                question.getDescription() + "\n" +
                " 1. " + question.getOptions()[0] +  "\n" +
                " 2. " + question.getOptions()[1]  +  "\n" +
                " 3. " + question.getOptions()[3]  +  "\n" +
                " 4. " + question.getOptions()[2]);
    }

    public void showMessageWin(Player player) {
        logger.info("**************** Felicitaciones " + player.getName() + " has ganado ****************");
    }

    public void showMessageGameOver(Player player) {
        logger.info("**************** Game Over " + player.getName() + "  ****************");
    }

    public void showMessageQuestionCorrect(Player player, Integer score) {
        logger.info("""
                **************** Respuesta Correcta  !!!  **************** 
                su puntaje es: """+score);
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
    public void showMessage(String message) {
        logger.info(message);
    }

    public void pressAnyKeyToContinue() {
        logger.info("Presione cualquier tecla para continuar");
        try {
            System.in.read();
        } catch (Exception exception) {
            throw new MyException(exception.getMessage(), exception);
        }
    }
}
