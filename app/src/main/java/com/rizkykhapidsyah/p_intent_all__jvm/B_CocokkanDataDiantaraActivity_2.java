package com.rizkykhapidsyah.p_intent_all__jvm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class B_CocokkanDataDiantaraActivity_2 extends AppCompatActivity {
    TextView TV_TextView0_ActivityB2_IDJAVA, TV_TextView1_ActivityB2_IDJAVA, TV_TextView2_ActivityB2_IDJAVA;
    Button B_Kembali_ActivityB2_IDJAVA;

    Bundle Ikat;
    Intent Ngeten;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.b_cocokkandatadiantaraactivity_2);

        TV_TextView0_ActivityB2_IDJAVA = findViewById(R.id.TV_TextView0_ActivityB2_IDXML);
        TV_TextView1_ActivityB2_IDJAVA = findViewById(R.id.TV_TextView1_ActivityB2_IDXML);
        TV_TextView2_ActivityB2_IDJAVA = findViewById(R.id.TV_TextView2_ActivityB2_IDXML);
        B_Kembali_ActivityB2_IDJAVA = findViewById(R.id.B_Kembali_ActivityB2_IDXML);

        Ikat = getIntent().getExtras();
        assert Ikat != null;

        String VND_2 = Ikat.getString("VND");
        String VNB_2 = Ikat.getString("VNB");

        TV_TextView1_ActivityB2_IDJAVA.setText("Nama Depan     : " + VND_2);
        TV_TextView2_ActivityB2_IDJAVA.setText("Nama Belakang  : " + VNB_2);

        B_Kembali_ActivityB2_IDJAVA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ngeten = new Intent(B_CocokkanDataDiantaraActivity_2.this, B_CocokkanDataDiantaraActivity.class);
                startActivity(Ngeten);
                finish();
            }
        });

    }
}
