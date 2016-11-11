package com.lesson_three.eiko.lesson4_musical_submission;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button info1 = (Button) findViewById(R.id.button1);
        info1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Song_1.class);
                startActivity(i);
            }
        });
        Button info2 = (Button) findViewById(R.id.button2);
        info2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Song_2.class);
                startActivity(i);
            }
        });
        Button info3 = (Button) findViewById(R.id.button3);
        info3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Song_3.class);
                startActivity(i);
            }
        });
        Button info4 = (Button) findViewById(R.id.button4);
        info4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Song_4.class);
                startActivity(i);
            }
        });
    }
}
