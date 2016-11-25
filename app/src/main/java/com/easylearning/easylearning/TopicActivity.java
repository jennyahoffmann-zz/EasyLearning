package com.easylearning.easylearning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TopicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Structure structure = new Structure();

        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            return;
        }
        //String output = extras.getString("topic");
        //String output = Integer.toString(R.string.electrical_network)

       //int[] main = structure.getStructure();
        int topic = extras.getInt("topic");
        String[] output = structure.getTopic(topic);

        setContentView(R.layout.activity_topic);
        TextView tv = (TextView) findViewById(R.id.textview);
        tv.setText(output[2]);
    }
}
