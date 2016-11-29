package com.easylearning.easylearning;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class LessonQuizActivity extends AppCompatActivity {

    RadioButton r1;
    RadioButton r2;
    RadioButton r3;
    RadioButton r4;

    ArrayList<Quiz> quiz;

    TextView tvQuestion;

    TextView tvFeedback;

    int count = 0;

    Button buttonSubmit;
    Button buttonTryAgain;
    Button buttonNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_lesson_quiz);

        //---- get extras submitted by intent
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            return;
        }
        int countChunk = extras.getInt("countChunk");

        //---- get Chunk for selected unit
        Content content = new Content();
        ArrayList<Chunk> chunkList = content.getChunkList();
        quiz = chunkList.get(countChunk).getQuiz();

        //---- init layout
        tvQuestion = (TextView) findViewById(R.id.textview_lesson_quiz);

        r1 = (RadioButton) findViewById(R.id.radio1);
        r2 = (RadioButton) findViewById(R.id.radio2);
        r3 = (RadioButton) findViewById(R.id.radio3);
        r4 = (RadioButton) findViewById(R.id.radio4);

        tvFeedback = (TextView) findViewById(R.id.textview_answer_feedback);

        buttonSubmit = (Button) findViewById(R.id.button_lesson_quiz_submit);
        buttonTryAgain = (Button) findViewById(R.id.button_lesson_quiz_try_again);
        buttonNext = (Button) findViewById(R.id.button_lesson_quiz_next);

        //---- display first quiz from Chunk related to text
        displayQuiz();
    }

    public void sendMessageLessonQuizSubmit(View view) {
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radiogroup);
        if (radioGroup.getCheckedRadioButtonId() == -1) {
            return;
        }

        buttonSubmit.setVisibility(View.GONE);

        //---- get clicked button
        RadioButton clickedRadio = (RadioButton) findViewById(radioGroup.getCheckedRadioButtonId());

       if (clickedRadio.getText() == quiz.get(count).getAnswer()) {
           //---- answer is correct
            buttonNext.setVisibility(View.VISIBLE);
            tvFeedback.setTextColor(Color.GREEN);
            tvFeedback.setText(R.string.right);
            tvFeedback.setVisibility(View.VISIBLE);
            radioGroup.setEnabled(false);
            disableRadioButtons();
            count++;
        } else {
           //---- answer is wrong
            buttonTryAgain.setVisibility(View.VISIBLE);
            tvFeedback.setTextColor(Color.RED);
            tvFeedback.setText(R.string.wrong);
            tvFeedback.setVisibility(View.VISIBLE);
            disableRadioButtons();
        }
    }

    public void sendMessageLessonQuizTryAgain(View view) {
        buttonTryAgain.setVisibility(View.GONE);
        enableRadioButtons();
        tvFeedback.setVisibility(View.INVISIBLE);
        buttonSubmit.setVisibility(View.VISIBLE);
    }

    public void sendMessageLessonQuizNext(View view) {
        //--- if more quizzes for this chunk available
        if (quiz.size() > count) {
            //---- display next quiz
            displayQuiz();
            enableRadioButtons();
            tvFeedback.setVisibility(View.INVISIBLE);
            buttonNext.setVisibility(View.INVISIBLE);
            buttonSubmit.setVisibility(View.VISIBLE);
        } else {
            //---- close Activity and go back to previous activity
            Intent returnIntent = new Intent();
            returnIntent.putExtra("result",1);
            setResult(Activity.RESULT_OK,returnIntent);
            finish();
        }
    }

    public void displayQuiz () {
        tvQuestion.setText(quiz.get(count).getQuestion());

        r1.setText(quiz.get(count).getOptions().get(0));
        r2.setText(quiz.get(count).getOptions().get(1));
        r3.setText(quiz.get(count).getOptions().get(2));
        r4.setText(quiz.get(count).getOptions().get(3));
    }

    private void disableRadioButtons() {
        r1.setClickable(false);
        r2.setClickable(false);
        r3.setClickable(false);
        r4.setClickable(false);
    }

    public void enableRadioButtons() {
        r1.setClickable(true);
        r2.setClickable(true);
        r3.setClickable(true);
        r4.setClickable(true);
    }
}
