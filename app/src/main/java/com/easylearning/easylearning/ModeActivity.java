package com.easylearning.easylearning;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.easylearning.easylearning.model.Quiz;

import java.util.ArrayList;

public class ModeActivity extends AppCompatActivity {

    ArrayList<Quiz> quizList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mode);
    }

    public void sendMessageTeaching(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void sendMessageShuffleQuiz(View view) {
        Intent intent = new Intent(this, ShuffleQuizActivity.class);
        startActivity(intent);
    }
}
