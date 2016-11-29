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

    public Quiz(String question, String op1, String op2, String op3, String op4, String answer) {
        mQuestion = question;
        mAnswer = answer;
        mOptions.add(op1);
        mOptions.add(op2);
        mOptions.add(op3);
        mOptions.add(op4);
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