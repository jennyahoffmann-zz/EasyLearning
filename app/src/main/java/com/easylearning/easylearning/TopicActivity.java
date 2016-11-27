package com.easylearning.easylearning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
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
        setContentView(R.layout.activity_topic);

        //---- get extras submitted by intent
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            return;
        }
        int extraTopic = extras.getInt("topic");

        //---- get list topic for selected main
        Structure structure = new Structure();
        final ArrayList<String> topic = structure.getTopic(extraTopic);

        setTitle(extraTopic);

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, topic);
        ListView listView = (ListView) findViewById(R.id.activity_topic);
        assert listView != null;
        listView.setAdapter(itemsAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position , long id) {
                Intent intent = new Intent(view.getContext(), ContentActivity.class);
                intent.putExtra("content", topic.get(position));
                startActivity(intent);
            }
        });
    }

}
