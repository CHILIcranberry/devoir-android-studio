package com.example.romai.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ProfilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);
    }
    public void MainActivity (View View) {
        startActivity(new Intent(this, MainActivity.class));
    }

    public void ProfileActivity(View view) {
    }
}


