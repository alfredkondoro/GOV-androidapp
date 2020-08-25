package com.alfredkondoro.govapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Dashboard extends AppCompatActivity{

    TextView first, second, third, fourth, fifth, sixth, seventh, eigth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_dashboard);

        first = (TextView) findViewById (R.id.firstmaid);
        second = (TextView) findViewById (R.id.secondmaid);
        third = (TextView) findViewById (R.id.thirdmaid);
        fourth = (TextView) findViewById (R.id.fourthmaid);
        fifth = (TextView) findViewById (R.id.fifthmaid);
        sixth = (TextView) findViewById (R.id.sixthmaid);
        seventh = (TextView) findViewById (R.id.seventhmaid);
        eigth = (TextView) findViewById (R.id.eigthmaid);

        first.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                    Intent first = new Intent (Dashboard.this, ProfileView.class);
                startActivity (first);
            }

        });

    }

}