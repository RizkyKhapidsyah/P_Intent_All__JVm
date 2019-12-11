package com.rizkykhapidsyah.p_intent_all__jvm;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class A_BukaActivityBaru extends AppCompatActivity {
    TextView TV_Info_IDJAVA;
    Button B_Kembali_IDJAVA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a_bukaactivitybaru);

        TV_Info_IDJAVA = findViewById(R.id.TV_Info_IDXML);
        B_Kembali_IDJAVA = findViewById(R.id.B_Kembali_IDXML);

        B_Kembali_IDJAVA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(A_BukaActivityBaru.this, MainActivity.class));
                finish();
            }
        });

    }
}
