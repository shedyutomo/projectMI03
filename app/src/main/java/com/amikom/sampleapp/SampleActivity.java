package com.amikom.sampleapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SampleActivity extends AppCompatActivity {

    EditText etnama;
    Button btnActivity, btnFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);

        etnama = findViewById(R.id.et_nama);
        btnActivity = findViewById(R.id.btnActivity);
        btnFragment = findViewById(R.id.btnFragment);

        btnActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( SampleActivity.this,IntentActivity.class);
                intent.putExtra("nama", etnama.getText().toString());
                startActivity(intent);
            }
        });

        btnFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( SampleActivity.this,FragmentActivity.class);
                startActivity(intent);
            }
        });
    }
}
