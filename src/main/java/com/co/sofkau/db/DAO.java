package com.co.sofkau.db;

import com.co.sofkau.utilities.Player;
import com.co.sofkau.utilities.Question;

import java.io.File;
import java.util.ArrayList;

public class DAO {
    private void makeArchiveQuestions(){
        /*Player player1 = new Player("Peter", 20);
        Player player2 = new Player("Alejandro", 10);
        ArrayList<Player> playerArrayList = new ArrayList<>();
        playerArrayList.add(player1);
        playerArrayList.add(player2);
        System.out.println("Tamaño: "+playerArrayList.size());*/
        Question[] questions = new Question[25];

        questions[0] = new Question("Mozart era un genio de:", new String[]{"La Literatura", "La Televisión", "El Deporte", "La Música"}, "La Música", "nivelUno");
        questions[1] = new Question("Termina el refrán: Mas vale pajaro en mano...", new String[]{"Que pollo en fotografía", "Que ciento volando", "que cuchara de palo", "Y ríase la gente"}, "Que ciento volando", "nivelUno");
        questions[2] = new Question("A cuantas unidades equivale 10 decenas de millar?", new String[]{"100000 unidades", "10000 unidades", "1000 unidades", "100 unidades"}, "100000 unidades", "nivelUno");
        questions[3] = new Question("Pablo Picasso era...", new String[]{"Un Músico", "Un Pintor", "Un Escritor", "Un Actor"}, "Un Pintor", "nivelUno");
        questions[4] = new Question("Como se llama la escritura utilizada por personas ciegas?",new String[]{"Morse", "Braile", "Ideograma", "Jeroglífico"}, "Braile", "nivelUno");

        questions[5] = new Question("Qué es una orquídea?", new String[]{"La mujer de una orca", "Un Mamífero", "Un Pez", "Una Flor"},"Una Flor","nivelDos");
        questions[6] = new Question("Cuál es el río más largo del mundo?", new String[]{"Amazonas", "Nilo", "Congo", "Sena"},"Nilo","nivelDos");
        questions[7] = new Question("Donde se originaron los juegos olímpicos?",new String[]{"Francia", "Italia", "Grecia", "España"},"Grecia","nivelDos");
        questions[8] = new Question("De qué colores es la bandera de México?", new String[]{"Rojo, Blanco, Verde", "Negro, Amarillo, Rojo", "Azul, Blanco, Verde", "Amarillo, Azul, Rojo"},"Rojo, Blanco, Verde", "nivelDos");
        questions[9] = new Question(,,,);
/*
        questions[10] = new Question(,,,);
        questions[11] = new Question(,,,);
        questions[12] = new Question(,,,);
        questions[13] = new Question(,,,);
        questions[14] = new Question(,,,);

        questions[15] = new Question(,,,);
        questions[16] = new Question(,,,);
        questions[17] = new Question(,,,);
        questions[18] = new Question(,,,);
        questions[19] = new Question(,,,);

        questions[20] = new Question(,,,);
        questions[21] = new Question(,,,);
        questions[22] = new Question(,,,);
        questions[23] = new Question(,,,);
        questions[24] = new Question(,,,);
*/
    }

}
