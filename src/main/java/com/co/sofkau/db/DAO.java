package com.co.sofkau.db;

import com.co.sofkau.utilities.Question;

import java.io.*;

import java.util.List;

public class DAO {

    private File fileQuestions;
    private File filePlayers;


    public DAO() {
        this.fileQuestions = new File("questions.txt");
        this.filePlayers = new File("players.txt");
    }

    public File getFileQuestions() {

        return fileQuestions;
    }

    public void setFileQuestions(File fileQuestions) {
        this.fileQuestions = fileQuestions;
    }

    public File getFilePlayers() {
        return filePlayers;
    }

    public void setFilePlayers(File filePlayers) {
        this.filePlayers = filePlayers;
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
/*
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
 */
}
