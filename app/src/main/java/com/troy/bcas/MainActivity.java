package com.troy.bcas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button FindSalonButton;
    public static final String TAG = MainActivity.class.getSimpleName();
    private EditText LocationEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FindSalonButton = (Button) findViewById(R.id.button);
        LocationEditText = (EditText) findViewById(R.id.text1);

        FindSalonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String location = LocationEditText.getText().toString();
                Log.d(TAG,location);
                Intent intent = new Intent(getBaseContext(), display.class);
                intent.putExtra("location", location);
                startActivity(intent);
            }
        });
    }
}
