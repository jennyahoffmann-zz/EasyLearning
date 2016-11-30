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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_text);

        //---- get Chunk for selected unit
        Content content = new Content();
        chunkList = content.getChunkList();

        //---- init views
        tv = (TextView) findViewById(R.id.textview_lesson_text);

        //---- display first text from Chunk
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
        //---- if still content in Chunk
        if (chunkList.size() > countText) {
            //---- display next text from Chunk
            tv.setText(chunkList.get(countText).getText());
        } else {
            //---- close this activity and go back to ContentActivity
            finish();
        }
    }
}
