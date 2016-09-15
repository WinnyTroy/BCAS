package com.troy.bcas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class display extends AppCompatActivity {
    private TextView LocationTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        LocationTextView = (TextView) findViewById(R.id.base);


//        Receiving the information from the main activity
        Intent intent = getIntent();
        String location = intent.getStringExtra("location");
        LocationTextView.setText(location);
    }
}
