package com.easylearning.easylearning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TopicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic);
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            return;
        }
        String output = extras.getString("topic");
        TextView tv = (TextView) findViewById(R.id.textview);
        tv.setText(output);
    }
}
