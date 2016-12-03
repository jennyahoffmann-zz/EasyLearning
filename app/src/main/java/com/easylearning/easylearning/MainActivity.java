package com.easylearning.easylearning;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.easylearning.easylearning.model.database.DatabaseAccessor;

/**
 * Date: 25.11.16
 * Author: Jenny Berger
 * E-mail: jenny.a.berger@gmail.com
 * Company: Robotics and Biology Laboratory (RBO)
 */

public class MainActivity extends AppCompatActivity {

    private DatabaseAccessor dbAccessor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        dbAccessor = new DatabaseAccessor(this, "content-db");
        setContentView(R.layout.activity_main);
    }


    public void sendMessage(View view) {
        Intent intent = new Intent(this, TopicActivity.class);
        String topic = view.getTag().toString();
        intent.putExtra("topic", topic);
        //todo add a default view if topic is unknown
        startActivity(intent);
    }

}
