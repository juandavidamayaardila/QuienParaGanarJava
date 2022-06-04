package com.co.sofkau.utilities.message;


import com.co.sofkau.utilities.MyException;
import com.co.sofkau.utilities.Player;
import com.co.sofkau.utilities.Question;
import org.jboss.logging.Logger;
import java.util.List;


/**
 * Clase que centraliza todos los mensajes que se van a mostrar al usuario
 * por consola
 *
 * @author JD-Amaya
 * @version 01.02.003 03/06/2022
 * @since 01.
 */
public class Message {

    private static final Logger logger = Logger.getLogger(Message.class);

    public static Message getInstance() {
        return new Message();
    }

    public void showWelcome() {
        logger.info("BIENVENIDO A QUIEN QUIERE GANAR\n" +
                    "Por favor ingrese su nombre..");
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
                " 1. " + question.getOptions()[0] + "\n" +
                " 2. " + question.getOptions()[1] + "\n" +
                " 3. " + question.getOptions()[2] + "\n" +
                " 4. " + question.getOptions()[3]);
    }

    public void showMessageWin(Player player) {
        logger.info("**************** Felicitaciones " + player.getName() + " has ganado ****************");
    }

    public void showMessageGameOver(Player player) {
        logger.info("**************** Game Over " + player.getName() + "  ****************");
    }

    public void showMessageQuestionCorrect(Player player, Integer score) {
        logger.info(" **************** Respuesta Correcta  ****************" +
                    " \n " + player.getName() + " su puntaje es: " + score);
    }

    public void showMessageQuestionInCorrect() {
        logger.info(" **************** Respuesta InCorrecta  ****************");
    }

    /**
     * Muestra toda la informacion de la lista, lo usamos
     * para mostrar el ranking.
     *
     * @param listJuagadores listado con el ranking de jugadores ys puntaje
     */
    public void showHistory(List<Player> listJuagadores) {
        logger.info("Rancking de juego :");

        listJuagadores.forEach(player -> logger.info(player.toString()));
    }

    public void showMessage(String message) {
        logger.info(message);
    }

    /**
     * Caputra la excepcion generado y
     * permite continuar con la ejecucion de
     * la aplicacion.
     */
    public void pressAnyKeyToContinue() {
        logger.info("Presione cualquier tecla para continuar");
        try {
            System.in.read();
        } catch (Exception exception) {
            throw new MyException(exception.getMessage(), exception);
        }
    }
}
