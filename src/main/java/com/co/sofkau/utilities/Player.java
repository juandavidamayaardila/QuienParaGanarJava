package com.co.sofkau.utilities;

/**
 * Clase que represetan un jugador, y sus respectivas
 * puntaje.
 *
 *  @version  01.02.003 03/06/2022
 *  @author JD-Amaya
 *  @since 01.
 *
 */
public class Player {

    private String name;
    private Integer score;

    public Player() {
        //Constructor por defecto
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public void incrementScore(){
        Integer points = 10;
        setScore(getScore() + points);
    }

    /**
     * Retorna los atributos del jugador
     * en una sola cadena.
     *
     * @return cadena con toda la información.
     */
    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
