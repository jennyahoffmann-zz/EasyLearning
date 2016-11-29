package com.easylearning.easylearning;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class LessonTextActivity extends AppCompatActivity {

    public int countText = 0;

    ArrayList<Chunk> chunkList;

    TextView tv;
    TextView tvCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_lesson_text);

        Content content = new Content();
        chunkList = content.getChunkList();

        tv = (TextView) findViewById(R.id.textview_lesson_text);
        tvCount = (TextView) findViewById(R.id.tv_countText);
        displayText();
    }

    public void sendMessageLessonText(View view) {
        Intent intent = new Intent(this, LessonQuizActivity.class);
        intent.putExtra("countChunk", countText);
        startActivityForResult(intent, 1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 1) {
            if (resultCode == Activity.RESULT_OK) {
                countText++;
                displayText();
            }
        }
    }

    private void displayText() {
        if (chunkList.size() > countText) {
            tv.setText(chunkList.get(countText).getText());
            String count = Integer.toString(countText);
            tvCount.setText(count);
        } else {
            finish();
        }
    }
}
