package com.amikom.sampleapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class IntentActivity extends AppCompatActivity {

    TextView tvNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);

        tvNama = findViewById(R.id.tv_nama);

        Intent intent = getIntent();
        tvNama.setText(intent.getStringExtra("nama"));
    }
}
