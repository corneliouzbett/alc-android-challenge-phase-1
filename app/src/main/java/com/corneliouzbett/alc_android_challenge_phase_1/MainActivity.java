package com.corneliouzbett.alc_android_challenge_phase_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button aboutButton;
    private Button profileButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        aboutButton = findViewById(R.id.abt_button);
        profileButton = findViewById(R.id.profile_button);

        aboutButton.setOnClickListener( about -> startActivity(new Intent(MainActivity.this, AboutActivity.class)));
    }
}
