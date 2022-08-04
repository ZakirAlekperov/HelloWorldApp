package com.zakiralekperov.helloworldapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView helloTextView;
    private ImageButton startImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        helloTextView = findViewById(R.id.helloText);
        startImageButton = findViewById(R.id.startButton);
    }


    public void onStartButtonClick(View view) {
        startImageButton.setImageResource(R.drawable.android);
        helloTextView.setVisibility(View.VISIBLE);
        startImageButton.setClickable(false);
    }
}