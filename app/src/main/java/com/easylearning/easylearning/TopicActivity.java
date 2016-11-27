package com.easylearning.easylearning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Date: 25.11.16
 * Author: Jenny Berger
 * E-mail: jenny.a.berger@gmail.com
 * Company: Robotics and Biology Laboratory (RBO)
 */

public class TopicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //---- get extras submitted by intent
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            return;
        }
        //String output = extras.getString("topic");
        //String output = Integer.toString(R.string.electrical_network)

       //int[] main = structure.getStructure();
        int extraTopic = extras.getInt("topic");

        //---- get list content for selected topic
        Structure structure = new Structure();
        ArrayList<String> topic = structure.getTopic(extraTopic);

        setContentView(R.layout.activity_topic);

        setTitle(extraTopic);

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, topic);
        ListView listView = (ListView) findViewById(R.id.activity_topic);
        assert listView != null;
        listView.setAdapter(itemsAdapter);

        //TextView tv = (TextView) findViewById(R.id.textview);
        //tv.setText(output[2]);
    }

}
