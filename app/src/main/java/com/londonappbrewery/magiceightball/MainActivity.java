package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView ballDisplay;
    Button myButton;
    final int[] ballArray = new int[] {
            R.drawable.ball1,
            R.drawable.ball2,
            R.drawable.ball3,
            R.drawable.ball4,
            R.drawable.ball5
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ballDisplay = findViewById(R.id.image_eightBall);



        myButton = findViewById(R.id.askButton);
        myButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Random randomNumberGenerator = new Random();
        int number = randomNumberGenerator.nextInt(4);
        ballDisplay.setImageResource(ballArray[number]);

    }
}
