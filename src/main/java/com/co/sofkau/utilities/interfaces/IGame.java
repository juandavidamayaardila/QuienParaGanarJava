package com.co.sofkau.utilities.interfaces;

import com.co.sofkau.utilities.Question;

public interface  IGame {

    public Boolean validateAnswer();

    public Boolean isCorrect();

    public Question nextQestion();

    public Boolean validateWin();

    public Integer addPoints();

}
