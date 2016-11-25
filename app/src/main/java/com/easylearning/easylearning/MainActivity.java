package com.easylearning.easylearning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessageElectrostaticField(View view) {
        Intent intent = new Intent(this, TopicActivity.class);
        //intent.putExtra("topic", "electrostaticField");
        intent.putExtra("topic", R.string.electrostatic_field);
        startActivity(intent);
    }

    public void sendMessageElectricalFlowField(View view) {
        Intent intent = new Intent(this, TopicActivity.class);
        intent.putExtra("topic", "electricalFlowField");
        startActivity(intent);
    }

    public void sendMessageElectricalNetwork(View view) {
        Intent intent = new Intent(this, TopicActivity.class);
        intent.putExtra("topic", "electricalNetwork");
        startActivity(intent);
    }

    public void sendMessageStationaryMagneticField(View view) {
        Intent intent = new Intent(this, TopicActivity.class);
        intent.putExtra("topic", "stationaryMagneticField");
        startActivity(intent);
    }

    public void sendMessageElectromagneticField(View view) {
        Intent intent = new Intent(this, TopicActivity.class);
        intent.putExtra("topic", "electromagneticField");
        startActivity(intent);
    }
}
