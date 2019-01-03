package com.example.romai.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ProfileActivity (View View) {
        startActivity(new Intent(this, ProfilActivity.class));
    }


        @Overrided
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            String[] values = new String[] { "zoom-buggy", "zoom-doof-wagon", " zoom-fdk", " zoom-interceptor",
                    "zoom-mack", "zoom-mad-granma", "zoom-mad-pickup", "zoom-peacemaker", "zoom-people-eater", "zoom-plymouth",
                     "zoom-the-big-foot", "zoom-the-gigahorse", "zoom-the-nux", "zoom-the-war-rip", "zoom-you-shall-not-pass"
            };

            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.rowlayout, values);
            setListAdapter(adapter);
        }
}

