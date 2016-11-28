package com.easylearning.easylearning;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Date: 28.11.16
 * Author: Jenny Berger
 * E-mail: jenny.a.berger@gmail.com
 * Company: Robotics and Biology Laboratory (RBO)
 */

public class Quiz {

    private String mQuestion;
    private ArrayList<String> mOptions = new ArrayList<>();
    private String mAnswer;

    public Quiz(String question, String answer) {
        mQuestion = question;
        mAnswer = answer;
    }

    public Quiz() {
    }

    public void addOption(String option) {
        mOptions.add(option);
    }

    public ArrayList<String> getOptions() {
        return mOptions;
    }

    public String getAnswer() {
        return mAnswer;
    }

    public String getQuestion() {
        return mQuestion;
    }
}