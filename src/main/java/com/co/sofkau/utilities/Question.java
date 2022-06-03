package com.co.sofkau.utilities;

public class Question {

    private String description;
    private String answerTrue;
    private String answerFalse1;

    private String answerFalse2;
    private String answerFalse3;
    private String answerFalse4;

    public Question(String description, String answerTrue, String answerFalse1, String answerFalse2,
                    String answerFalse3, String answerFalse4)
    {
        this.description = description;
        this.answerTrue = answerTrue;
        this.answerFalse1 = answerFalse1;
        this.answerFalse2 = answerFalse2;
        this.answerFalse3 = answerFalse3;
        this.answerFalse4 = answerFalse4;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAnswerTrue() {
        return answerTrue;
    }

    public void setAnswerTrue(String answerTrue) {
        this.answerTrue = answerTrue;
    }

    public String getAnswerFalse1() {
        return answerFalse1;
    }

    public void setAnswerFalse1(String answerFalse1) {
        this.answerFalse1 = answerFalse1;
    }

    public String getAnswerFalse2() {
        return answerFalse2;
    }

    public void setAnswerFalse2(String answerFalse2) {
        this.answerFalse2 = answerFalse2;
    }

    public String getAnswerFalse3() {
        return answerFalse3;
    }

    public void setAnswerFalse3(String answerFalse3) {
        this.answerFalse3 = answerFalse3;
    }

    public String getAnswerFalse4() {
        return answerFalse4;
    }

    public void setAnswerFalse4(String answerFalse4) {
        this.answerFalse4 = answerFalse4;
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
