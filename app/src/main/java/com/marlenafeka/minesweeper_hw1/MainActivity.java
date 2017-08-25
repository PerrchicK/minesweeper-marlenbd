package com.marlenafeka.minesweeper_hw1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intro_activity);

        GameActivity.time = 0;

        Button buttonBeginner = (Button)findViewById(R.id.buttonBeginner);
        Button buttonSkilled = (Button)findViewById(R.id.buttonSkilled);
        Button buttonExpert = (Button)findViewById(R.id.buttonExpert);
        //Button buttonAbout = (Button)findViewById(R.id.buttonAbout);

        buttonBeginner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentBeginner = new Intent(MainActivity.this, GameActivity.class);
                intentBeginner.putExtra("level", "beginner");
                startActivity(intentBeginner);
            }
        });

        buttonSkilled.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentSkilled = new Intent(MainActivity.this, GameActivity.class);
                intentSkilled.putExtra("level", "skilled");
                startActivity(intentSkilled);
            }
        });

        buttonExpert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentExpert = new Intent(MainActivity.this, GameActivity.class);
                intentExpert.putExtra("level", "expert");
                startActivity(intentExpert);
            }
        });

        /*buttonAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /// about ///
                Intent intent = new Intent(MainActivity.this, EndGameActivity.class);
                startActivity(intent);
            }
        });*/
    }
}
