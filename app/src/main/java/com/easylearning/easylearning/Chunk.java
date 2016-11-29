package com.easylearning.easylearning;

import java.util.ArrayList;

/**
 * Date: 29.11.16
 * Author: Jenny Berger
 * E-mail: jenny.a.berger@gmail.com
 * Company: Robotics and Biology Laboratory (RBO)
 */

public class Chunk {

    private String text;
    private ArrayList<Quiz> quiz;

    public Chunk() {
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public ArrayList<Quiz> getQuiz() {
        return quiz;
    }

    public void setQuiz(ArrayList<Quiz> quiz) {
        this.quiz = quiz;
    }

    public void setChunk(String text, ArrayList<Quiz> quiz) {
        this.text = text;
        this.quiz = quiz;
    }
}
