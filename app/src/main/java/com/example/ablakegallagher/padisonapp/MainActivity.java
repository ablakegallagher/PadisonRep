package com.example.ablakegallagher.padisonapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.content.Intent;


public class MainActivity extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button continueButton = (Button) findViewById(R.id.continue_button);
        continueButton.setOnClickListener(new View.OnClickListener(){
        //View.OnClickListener listener = new View.OnClickListener(){

            public void onClick(View v) {
                // open home page
                Intent i = new Intent(MainActivity.this, HomePage.class);
                MainActivity.this.startActivity(i);
            }
        });

    }




}

