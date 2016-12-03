package com.easylearning.easylearning;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.easylearning.easylearning.model.Content;
import com.easylearning.easylearning.model.Quiz;

import java.util.ArrayList;
import java.util.Random;

public class ShuffleQuizActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton r1;
    RadioButton r2;
    RadioButton r3;
    RadioButton r4;

    ArrayList<Quiz> quiz;

    TextView tvQuestion;

    TextView tvFeedback;

    int index;

    Button buttonSubmit;
    Button buttonTryAgain;
    Button buttonNext;

    Random rnd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_lesson_quiz);

        //---- get all quizzes
        Content content = new Content();
        quiz = content.getAllQuizzes();

        //---- init layout
        tvQuestion = (TextView) findViewById(R.id.textview_lesson_quiz);

        radioGroup = (RadioGroup) findViewById(R.id.radiogroup);
        r1 = (RadioButton) findViewById(R.id.radio1);
        r2 = (RadioButton) findViewById(R.id.radio2);
        r3 = (RadioButton) findViewById(R.id.radio3);
        r4 = (RadioButton) findViewById(R.id.radio4);

        tvFeedback = (TextView) findViewById(R.id.textview_answer_feedback);

        buttonSubmit = (Button) findViewById(R.id.button_lesson_quiz_submit);
        buttonTryAgain = (Button) findViewById(R.id.button_lesson_quiz_try_again);
        buttonNext = (Button) findViewById(R.id.button_lesson_quiz_next);

        //---- pick random quiz
        rnd = new Random();
        index = rnd.nextInt(quiz.size());

        //---- display first quiz from Chunk related to text
        displayQuiz();
    }

    public void sendMessageLessonQuizSubmit(View view) {
        if (radioGroup.getCheckedRadioButtonId() == -1) {
            return;
        }

        buttonSubmit.setVisibility(View.GONE);

        //---- get clicked button
        RadioButton clickedRadio = (RadioButton) findViewById(radioGroup.getCheckedRadioButtonId());

        if (clickedRadio.getText() == quiz.get(index).getAnswer()) {
            //---- answer is correct
            buttonNext.setVisibility(View.VISIBLE);
            tvFeedback.setTextColor(Color.GREEN);
            tvFeedback.setText(R.string.right);
            tvFeedback.setVisibility(View.VISIBLE);
            radioGroup.setEnabled(false);
            disableRadioButtons();
            index++;
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
        //---- display next quiz
        index = rnd.nextInt(quiz.size());
        displayQuiz();
        enableRadioButtons();
        tvFeedback.setVisibility(View.INVISIBLE);
        buttonNext.setVisibility(View.INVISIBLE);
        buttonSubmit.setVisibility(View.VISIBLE);

    }

    public void displayQuiz() {
        tvQuestion.setText(quiz.get(index).getQuestion());

        int[] arr = {0,1,2,3};
        rnd = new Random();
        for (int i = 0; i < arr.length; i++) {
            int index = rnd.nextInt(arr.length );
            int a = arr[index];
            arr[index] = arr[i];
            arr[i] = a;
        }

        r1.setText(quiz.get(index).getOptions().get(arr[0]));
        r2.setText(quiz.get(index).getOptions().get(arr[1]));
        r3.setText(quiz.get(index).getOptions().get(arr[2]));
        r4.setText(quiz.get(index).getOptions().get(arr[3]));
    }

    private void disableRadioButtons() {
        r1.setClickable(false);
        r2.setClickable(false);
        r3.setClickable(false);
        r4.setClickable(false);
    }

    public void enableRadioButtons() {
        radioGroup.clearCheck();
        r1.setClickable(true);
        r2.setClickable(true);
        r3.setClickable(true);
        r4.setClickable(true);
    }
}
