package com.easylearning.easylearning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ContentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);

        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            return;
        }
        String content = extras.getString("content");

        setContentView(R.layout.activity_content);
        TextView tv = (TextView) findViewById(R.id.textview);
        tv.setText(content);
    }
}
