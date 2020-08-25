package com.alfredkondoro.govapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class WelcomeActivity extends AppCompatActivity {

    ImageButton imgSearch, imgLogin, imgRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_welcome);

        imgSearch = (ImageButton)findViewById (R.id.imgSearch);
        imgLogin = (ImageButton)findViewById (R.id.imgLogin);
        imgRegister = (ImageButton)findViewById (R.id.imgRegister);

        imgSearch.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent searchIntent = new Intent (WelcomeActivity.this, Dashboard.class);
                startActivity (searchIntent);
            }
        });

        imgRegister.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent (WelcomeActivity.this, Register.class);
                startActivity (registerIntent);
            }
        });

        imgLogin.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent loginIntent = new Intent (WelcomeActivity.this, Login.class);
                startActivity (loginIntent);
            }
        });
    }
}