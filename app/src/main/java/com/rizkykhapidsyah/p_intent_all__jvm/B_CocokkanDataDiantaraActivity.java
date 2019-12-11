package com.rizkykhapidsyah.p_intent_all__jvm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class B_CocokkanDataDiantaraActivity extends AppCompatActivity {
    TextView TV_Judul_ActivityB1_IDJAVA;
    EditText ET_EditText1_ActivityB1_IDJAVA, ET_EditText2_ActivityB1_IDJAVA;
    Button B_Kirim_ActivityB1_IDJAVA, B_Kembali_ActivityB1_IDJAVA;

    Intent Ngeten;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.b_cocokkandatadiantaraactivity);

        TV_Judul_ActivityB1_IDJAVA = findViewById(R.id.TV_Judul_ActivityB1_IDXML);
        ET_EditText1_ActivityB1_IDJAVA = findViewById(R.id.ET_EditText1_ActivityB1_IDXML);
        ET_EditText2_ActivityB1_IDJAVA = findViewById(R.id.ET_EditText2_ActivityB1_IDXML);
        B_Kembali_ActivityB1_IDJAVA = findViewById(R.id.B_Kembali_ActivityB1_IDXML);
        B_Kirim_ActivityB1_IDJAVA = findViewById(R.id.B_Kirim_ActivityB1_IDXML);

        ET_EditText1_ActivityB1_IDJAVA.requestFocus();

        B_Kirim_ActivityB1_IDJAVA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String VND, VNB;
                VND = ET_EditText1_ActivityB1_IDJAVA.getText().toString().trim();
                VNB = ET_EditText2_ActivityB1_IDJAVA.getText().toString().trim();

                if (VND.equals("") || VNB.equals("")) {
                    Toast.makeText(getApplicationContext(), "Silahkan Lengkapi Isian.", Toast.LENGTH_LONG).show();
                } else {
                    Ngeten = new Intent(B_CocokkanDataDiantaraActivity.this, B_CocokkanDataDiantaraActivity_2.class);
                    Ngeten.putExtra("VND", VND);
                    Ngeten.putExtra("VNB", VNB);
                    startActivity(Ngeten);
                    finish();
                }
            }
        });

        B_Kembali_ActivityB1_IDJAVA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ngeten = new Intent(B_CocokkanDataDiantaraActivity.this, MainActivity.class);
                startActivity(Ngeten);
                finish();
            }
        });

    }
}
