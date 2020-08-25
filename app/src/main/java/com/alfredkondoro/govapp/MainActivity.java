package com.alfredkondoro.govapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button buttonMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

        buttonMain = (Button)findViewById (R.id.buttonmain);
        buttonMain.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent mainIntent = new Intent (MainActivity.this, WelcomeActivity.class);
                startActivity (mainIntent);
            }
        });
    }
}