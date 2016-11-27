package com.easylearning.easylearning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LessonTextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_text);
    }

    public void sendMessageLessonText(View view) {
        Intent intent = new Intent(this, LessonQuizActivity.class);
        startActivity(intent);
    }
}
