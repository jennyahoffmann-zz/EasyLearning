package com.easylearning.easylearning;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class LessonQuizActivity extends AppCompatActivity {

    RadioButton r1;
    RadioButton r2;
    RadioButton r3;
    RadioButton r4;

    Quiz quiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_quiz);

        Content content = new Content();
        quiz = content.getQuiz();

        TextView tv = (TextView) findViewById(R.id.textview_lesson_quiz);
        tv.setText(quiz.getQuestion());

        r1 = (RadioButton) findViewById(R.id.radio1);
        r2 = (RadioButton) findViewById(R.id.radio2);
        r3 = (RadioButton) findViewById(R.id.radio3);
        r4 = (RadioButton) findViewById(R.id.radio4);

        r1.setText(quiz.getOptions().get(0));
        r2.setText(quiz.getOptions().get(1));
        r3.setText(quiz.getOptions().get(2));
        r4.setText(quiz.getOptions().get(3));
    }

    public void sendMessageLessonQuizSubmit(View view) {
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radiogroup);
        if(radioGroup.getCheckedRadioButtonId() == -1) {
            return;
        }

        Button buttonSubmit = (Button) findViewById(R.id.button_lesson_quiz_submit);
        buttonSubmit.setVisibility(View.GONE);

//        if (radioGroup.getCheckedRadioButtonId())

        RadioButton clickedRadio = (RadioButton) findViewById(radioGroup.getCheckedRadioButtonId());
        if (clickedRadio.getText() == quiz.getAnswer()) {

            Button buttonTryAgain = (Button) findViewById(R.id.button_lesson_quiz_try_again);
            buttonTryAgain.setVisibility(View.VISIBLE);
            TextView tv = (TextView) findViewById(R.id.textview_answer_feedback);
            tv.setTextColor(Color.GREEN);
            tv.setText(R.string.right);
            tv.setVisibility(View.VISIBLE);
            radioGroup.setEnabled(false);
            r1.setClickable(false);
            r2.setClickable(false);
            r3.setClickable(false);
            r4.setClickable(false);
        } else {
            Button buttonTryAgain = (Button) findViewById(R.id.button_lesson_quiz_try_again);
            buttonTryAgain.setVisibility(View.VISIBLE);
            TextView tv = (TextView) findViewById(R.id.textview_answer_feedback);
            tv.setTextColor(Color.RED);
            tv.setText(R.string.wrong);
            tv.setVisibility(View.VISIBLE);
            r1.setClickable(false);
            r2.setClickable(false);
            r3.setClickable(false);
            r4.setClickable(false);
        }

//        Button buttonNext = (Button) findViewById(R.id.button_lesson_quiz_next);
//        buttonNext.setVisibility(View.VISIBLE);

    }

    public void sendMessageLessonQuizTryAgain(View view) {
    }

    public void sendMessageLessonQuizNext(View view) {
    }
}
