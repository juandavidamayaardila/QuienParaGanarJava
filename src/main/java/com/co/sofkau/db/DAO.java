package com.co.sofkau.db;

import com.co.sofkau.utilities.Player;
import com.co.sofkau.utilities.Question;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class DAO {

    private File fileQuestions;
    private File filePlayers;
    private List<Question> questionArrayList;
    private List<Player> playerArrayList;

    public DAO(List<Question> questionArrayList) {
        this.fileQuestions = new File("questions.txt");
        this.filePlayers = new File("players.txt");
        this.questionArrayList = new ArrayList<>();
        this.playerArrayList = new ArrayList<>();
    }

    private void makeQuestions() {

        Question[] questions = new Question[25];

        questions[0] = new Question("Mozart era un genio de:", new String[]{"La Literatura", "La Televisión", "El Deporte", "La Música"}, "La Música", 1);
        questions[1] = new Question("Termina el refrán: Mas vale pajaro en mano...", new String[]{"Que pollo en fotografía", "Que ciento volando", "que cuchara de palo", "Y ríase la gente"}, "Que ciento volando", 1);
        questions[2] = new Question("A cuantas unidades equivale 10 decenas de millar?", new String[]{"100000 unidades", "10000 unidades", "1000 unidades", "100 unidades"}, "100000 unidades", 1);
        questions[3] = new Question("Pablo Picasso era...", new String[]{"Un Músico", "Un Pintor", "Un Escritor", "Un Actor"}, "Un Pintor", 1);
        questions[4] = new Question("Como se llama la escritura utilizada por personas ciegas?",new String[]{"Morse", "Braile", "Ideograma", "Jeroglífico"}, "Braile", 1);

        questions[5] = new Question("Qué es una orquídea?", new String[]{"La mujer de una orca", "Un Mamífero", "Un Pez", "Una Flor"},"Una Flor",2);
        questions[6] = new Question("Cuál es el río más largo del mundo?", new String[]{"Amazonas", "Nilo", "Congo", "Sena"},"Nilo",2);
        questions[7] = new Question("Donde se originaron los juegos olímpicos?",new String[]{"Francia", "Italia", "Grecia", "España"},"Grecia",2);
        questions[8] = new Question("De qué colores es la bandera de México?", new String[]{"Rojo, Blanco, Verde", "Negro, Amarillo, Rojo", "Azul, Blanco, Verde", "Amarillo, Azul, Rojo"},"Rojo, Blanco, Verde", 2);
        questions[9] = new Question("Cuando acabó la II Guerra Mundial?", new String[]{"1956", "1945", "1937", "1944"},"1945",2);

        questions[10] = new Question("Qué rama de la Biología estuda los animales?",new String[]{"Zoología", "Cartografía", "Astronomía", "Neurología"},"Zoología",3);
        questions[11] = new Question("Cuál es la ciudad de los rascacielos?", new String[]{"Los Ángeles", "Nueva York", "San Francisco", "shangai"},"Nueva York",3);
        questions[12] = new Question("Qué instrumento óptico permite ver los astros de cerca?", new String[]{"Catalejo", "Binoculares", "Telescopio", "Microscopio"},"Catalejo", 3);
        questions[13] = new Question("Cuál es la moneda oficial de Estados Unidos?", new String[]{"Dolár", "Peso", "Pound", "Yen"}, "Dolár", 3);
        questions[14] = new Question("Cual es el nombre de a lengua oficial en China?", new String[]{"Frances", "Mandarin", "Ingles", "Español"},"Mandarin",3);

        questions[15] = new Question("Quién pintó La Ultima Cena?", new String[]{"Claude Monet", "Paul Cezanne", "Leonardo da Vinci", "Pablo Picasso"}, "Leonardo da Vinci",4);
        questions[16] = new Question("En qué pais se encuentra la torre de Pisa?",new String[]{"España", "Italia", "Francia", "Alemania"},"Italia",4);
        questions[17] = new Question("En qué año llegó a Cristóbal Colón a América?",new String[]{"1492", "1536", "1458", "1495"},"1492",4);
        questions[18] = new Question("Qué producto cultiva más Guatemala",new String[]{"Té", "Especias", "Café", "Maíz"},"Maíz",4);
        questions[19] = new Question("En qué se especializa la cartografía?",new String[]{"El estudio de el Oceano", "El estudio de los mapas", "El estudio de las estrellas", "El estudio del aire"}, "El estudio de los mapas",4);

        questions[20] = new Question("Cual es el país mas grande del mundo?",new String[]{"Rusia", "China", "India", "Australia"},"Rusia",5);
        questions[21] = new Question("Donde se encuentra la famosa Torre Eiffel?", new String[]{"España", "Italia", "Francia", "Australia"},"Francia",5);
        questions[22] = new Question("Qué deporte practicaba Michael Jordan?",new String[]{"Basquetbol", "Futbol", "Natación", "Rugby"},"Basquetbol",5);
        questions[23] = new Question("Cual es el tercer planeta en el sistema solar?",new String[]{"Saturno", "Tierra", "Neptuno", "Marte"},"Tierra",5);
        questions[24] = new Question("Cual es el país más poblado de la Tierra?",new String[]{"China", "Nueva York", "Rusia", "India"},"China",5);

        questionArrayList = Arrays.asList(questions);

        /*for (Question question : questionArrayList){
            System.out.println(question.getDescription());
            System.out.println(question.getOptions()[0]);
        }*/
        /*try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);
            if (Boolean.FALSE.equals(file.exists())){
                file.createNewFile();
                //Escribir Preguntas
                for (Question question : questionArrayList) {
                    printWriter.write(String.valueOf(questions));
                }
            }
            printWriter.close();
            bufferedWriter.close();
        }catch (Exception e){
            e.printStackTrace();
        }*/
    }

    public Question selectQuestionRandom(Integer category){

        Random random = new Random();
        Integer numberQuestion = random.nextInt(5 + 1) + 1;

        Question[] questionsForCategory = new Question[5];
        Integer i = 0;

        for (Question question : questionArrayList){
            if (question.getCategory() == category && i < 6){
                questionsForCategory[i] = question;
                i++;
            }
        }

        return questionsForCategory[numberQuestion - 1];
    }

    /**
     * Método para obtener la lista de Preguntas
     * @return List<Question> La Lista de Preguntas
     */
    public List<Question> getQuestionArrayList(){
        return this.questionArrayList;
    }

    public List<Player> getPlayerArrayList(){
        return this.playerArrayList;
    }

    public List<Player> getPlayerOrderByScore(){
        playerArrayList.sort((o1, o2) -> o1.getScore().compareTo(o2.getScore()));
        return this.playerArrayList;
    }

    /*
    public static void loadQuestions(){
            List<Question> questionArrayList = new ArrayList<>();

            //Codigo aqui
        try{
            FileReader fileReader = new FileReader(file);//Para leer el archivo
            BufferedReader bufferedReader = new BufferedReader(fileReader);//Para guardar en memoria lo que se va leyendo

            String linea;
            linea = bufferedReader.readLine();
            while (linea != null){
                System.out.println(linea);
            }

            bufferedReader.close();
            fileReader.close();

        }catch (Exception e){
            e.printStackTrace();
        }

        //return questionArrayList;
    }
    */




    public void writeToArchiveQuestions(File file){

    }

    public void writeToArchivePlayers(File file, Player player){
        try {
            if (Boolean.TRUE.equals(file.exists())){
                file.createNewFile();
            }
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);

            //Escribir
            printWriter.write(String.valueOf(player));

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
