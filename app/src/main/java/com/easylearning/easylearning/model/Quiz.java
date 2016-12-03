package com.easylearning.easylearning.model;

import org.greenrobot.greendao.annotation.Convert;
import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;

import java.util.ArrayList;
import java.util.List;

/**
 * Date: 28.11.16
 * Author: Jenny Berger
 * E-mail: jenny.a.berger@gmail.com
 * Company: Robotics and Biology Laboratory (RBO)
 */
@Entity
public class Quiz {

    public String mQuestion;
    @Convert(converter = StringListConverter.class, columnType = String.class)
    public List<String> mOptions;
    public String mAnswer;
    @Id
    private long id;

    public Quiz(String question, String answer, String... options) {
        mQuestion = question;
        mAnswer = answer;
        mOptions = new ArrayList<>(options.length);
        if (options != null) {
            for (String option : options) {
                mOptions.add(option);
            }
        }
    }

    public Quiz() {
    }

    @Generated(hash = 194491619)
    public Quiz(long id, String mQuestion, List<String> mOptions, String mAnswer) {
        this.id = id;
        this.mQuestion = mQuestion;
        this.mOptions = mOptions;
        this.mAnswer = mAnswer;
    }

    public void addOption(String option) {
        mOptions.add(option);
    }

    public List<String> getOptions() {
        return mOptions;
    }

    public String getAnswer() {
        return mAnswer;
    }

    public String getQuestion() {
        return mQuestion;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMQuestion() {
        return this.mQuestion;
    }

    public void setMQuestion(String mQuestion) {
        this.mQuestion = mQuestion;
    }

    public List<String> getMOptions() {
        return this.mOptions;
    }

    public void setMOptions(List<String> mOptions) {
        this.mOptions = mOptions;
    }

    public String getMAnswer() {
        return this.mAnswer;
    }

    public void setMAnswer(String mAnswer) {
        this.mAnswer = mAnswer;
    }
}