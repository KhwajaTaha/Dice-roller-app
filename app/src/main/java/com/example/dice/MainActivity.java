package com.example.dice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView imageViewDIce;
    private Random rng = new Random();
    private Object VIew;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewDIce = findViewById(R.id.image_view_dice);
        imageViewDIce.setOnClickListener(new View.OnClickListener() {
            @Override
                    public void onClick(View v) {
                rollDice();
            }
        });
    }
    private void rollDice(){

        int randomNumber = rng.nextInt(6)+1;

        switch (randomNumber){
            case 1:
                imageViewDIce.setImageResource(R.drawable.dice1);
                break;
            case 2:
                imageViewDIce.setImageResource(R.drawable.dice2);
                break;
            case 3:
                imageViewDIce.setImageResource(R.drawable.dice3);
                break;
            case 4:
                imageViewDIce.setImageResource(R.drawable.dice4);
                break;
            case 5:
                imageViewDIce.setImageResource(R.drawable.dice5);
                break;
            case 6:
                imageViewDIce.setImageResource(R.drawable.dice6);
                break;
        }
    }
}
