package com.example.android.tourguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView istanbul =findViewById(R.id.istanbul);

        istanbul.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent istanbulIntent = new Intent(MainActivity.this, IstanbulRestaurants.class);
                // Start the new activity
                startActivity(istanbulIntent);
            }
        });

        ImageView ankara =findViewById(R.id.ankara);

        ankara.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent ankaraIntent = new Intent(MainActivity.this,AnkaraRestaurant.class);
                // Start the new activity
                startActivity(ankaraIntent);
            }
        });

    }
}
