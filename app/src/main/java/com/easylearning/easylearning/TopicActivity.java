package com.easylearning.easylearning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
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
        int extraTopic = extras.getInt("topic");
        final String[] topic = structure.getTopic(extraTopic);

        setContentView(R.layout.activity_topic);

        setTitle(extraTopic);

        final int N = topic.length;
        LinearLayout ll = (LinearLayout) findViewById(R.id.activity_topic);
        for (int i =0; i < N; i++) {
            TextView tv = new TextView(this);
            tv.setText(topic[i]);
            tv.setId(i + 5);
            tv.setClickable(true);
            tv.setTextSize(16);
            tv.setPadding(0, 32, 0, 32);
            final String out = topic[i];
            tv.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent intent = new Intent(v.getContext(), ContentActivity.class);
                    intent.putExtra("content", out);
                    v.getContext().startActivity(intent);
                }
            });
            ll.addView(tv);
        }

        //TextView tv = (TextView) findViewById(R.id.textview);
        //tv.setText(output[2]);
    }

}
