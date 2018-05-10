package com.rgaripov.headsortails;

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

        final Button rollButton = findViewById(R.id.roll_button);
        final ImageView coinImage = findViewById(R.id.coin_image);
        final int [] coinsImagesArray = {R.drawable.head, R.drawable.tail};

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomNumberGenerator = new Random();
                int randomNumber = randomNumberGenerator.nextInt(2);
                coinImage.setImageResource(coinsImagesArray[randomNumber]);
            }
        });
    }
}
