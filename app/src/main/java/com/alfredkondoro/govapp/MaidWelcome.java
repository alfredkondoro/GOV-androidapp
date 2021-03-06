package com.alfredkondoro.govapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.firebase.auth.FirebaseAuth;

public class MaidWelcome extends AppCompatActivity {
    ImageButton buttonAddUpdate, buttonView, buttonLogout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_maid_welcome);
        buttonAddUpdate = (ImageButton)findViewById (R.id.imgAdd);
        buttonView =(ImageButton)findViewById (R.id.imgView);

        buttonAddUpdate.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent add = new Intent(MaidWelcome.this, AddUpdate.class);
                startActivity (add);
            }
        });

        buttonView.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent pview = new Intent(MaidWelcome.this, ProfileView.class);
                startActivity (pview);
            }
        });
        buttonLogout.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                FirebaseAuth.getInstance ().signOut ();
                Intent btnout = new Intent (MaidWelcome.this, Dashboard.class);
                startActivity (btnout);
            }
        });
    }
}