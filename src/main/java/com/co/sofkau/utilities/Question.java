package com.co.sofkau.utilities;

public class Question {

    private String description;
    private String[] answers = new String[4];
    private String correcAnswer;
    private String category;

    public Question(String description, String[] answers, String correcAnswer, String category) {
        this.description = description;
        this.answers = answers;
        this.correcAnswer = correcAnswer;
        this.category = category;
    }

    public Boolean validateAnswer(){
        return true;
    }

    @Override
    public String toString() {
        return "Question{" +
                "description='" + description + '\'' +
                ", answerTrue='" + answerTrue + '\'' +
                ", answerFalse1='" + answerFalse1 + '\'' +
                ", answerFalse2='" + answerFalse2 + '\'' +
                ", answerFalse3='" + answerFalse3 + '\'' +
                ", answerFalse4='" + answerFalse4 + '\'' +
                '}';
    }
}
