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

    public void writeToArchiveQuestions(File file){

    }
}
