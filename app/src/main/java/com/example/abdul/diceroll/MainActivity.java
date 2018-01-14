package com.example.abdul.diceroll;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //create variable to represent objects on app
        final Button rollButton;
        final ImageView leftDice;
        final ImageView rightDice;

        // set objects on app to  variable
        rollButton = (Button)findViewById(R.id.btn1);
        leftDice = (ImageView)findViewById(R.id.LeftDie);
        rightDice = (ImageView)findViewById(R.id.RightDie);

        //fill array with images from drawable folder
        final int [] DiceArray = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6,
        };
        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randNum = new Random();
                int rand;

                rand = randNum.nextInt(6);
                leftDice.setImageResource(DiceArray[rand]);
                rand = randNum.nextInt(6);
                rightDice.setImageResource(DiceArray[rand]);

            }



        });
    }
}
