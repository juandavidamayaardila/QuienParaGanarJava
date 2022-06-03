package com.co.sofkau.utilities;

public class Question {

    private String description;
    private String[] options = new String[4];
    private String correctAnswer;
    private Integer category;


    public Question(String description, String[] options, String correctAnswer, Integer category) {
        this.description = description;
        this.options = options;
        this.correctAnswer = correctAnswer;
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String[] getOptions() {
        return options;
    }

    public void setOptions(String[] options) {
        this.options = options;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }
}
