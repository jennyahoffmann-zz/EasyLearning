package com.easylearning.easylearning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class LessonTextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_text);

        Content content = new Content();
        ArrayList<String> contentList = content.getTextContent();

        TextView tv = (TextView) findViewById(R.id.textview_lesson_text);
        tv.setText(contentList.get(0));
    }

    public void sendMessageLessonText(View view) {
        Intent intent = new Intent(this, LessonQuizActivity.class);
        startActivity(intent);
    }
}
