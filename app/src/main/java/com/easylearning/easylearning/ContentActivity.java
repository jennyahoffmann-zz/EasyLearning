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

public class ContentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Structure structure = new Structure();

        setContentView(R.layout.activity_content);

        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            return;
        }
        String extraContent = extras.getString("content");
        ArrayList<String> content = structure.getContent(extraContent);

        setContentView(R.layout.activity_content);

        setTitle(extraContent);

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, content);
        ListView listView = (ListView) findViewById(R.id.activity_content);
        assert listView != null;
        listView.setAdapter(itemsAdapter);

    }
}
