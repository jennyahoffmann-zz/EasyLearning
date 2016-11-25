package com.easylearning.easylearning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

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
        String [] content = structure.getContent(extraContent);

        setContentView(R.layout.activity_content);

        setTitle(extraContent);

        final int N = content.length;
        LinearLayout ll = (LinearLayout) findViewById(R.id.activity_content);
        for (int i =0; i < N; i++) {
            TextView tv = new TextView(this);
            tv.setText(content[i]);
            tv.setId(i + 5);
            tv.setClickable(true);
            tv.setTextSize(16);
            tv.setPadding(0, 32, 0, 32);
            final String out = content[i];
            tv.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent intent = new Intent(v.getContext(), ContentActivity.class);
                    intent.putExtra("content", out);
                    v.getContext().startActivity(intent);
                }
            });
            ll.addView(tv);
        }
    }
}
