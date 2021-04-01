package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvCounter;
    private int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        tvCounter = findViewById(R.id.tv_counter);
    }

    public void clickOnCounterUp(View view) {
        tvCounter.setText("" + (++count));
    }

    public void clickOnCounterDown(View view) {
        tvCounter.setText("" + (--count));
    }
}