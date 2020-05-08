package com.example.vibracija;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Vibration vibration;
    private Button mOn;
    private Button mOff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vibration = new Vibration(getApplicationContext());
        mOn = findViewById(R.id.on);
        mOff = findViewById(R.id.off);

        mOn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibration.TurnOn(0);
            }
        });

        mOff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibration.Stop();
            }
        });
    }
}
