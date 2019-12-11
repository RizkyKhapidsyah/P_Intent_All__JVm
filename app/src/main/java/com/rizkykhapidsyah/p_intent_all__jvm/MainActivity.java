package com.rizkykhapidsyah.p_intent_all__jvm;

/*
    Created by Rizky Khapidsyah
 */

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView TV_PilihBahasa_IDJAVA, TV_Judul_IDJAVA;
    Spinner S_PilihBahasa_IDJAVA;
    Button B_ContohIntent1_IDJAVA, B_ContohIntent2_IDJAVA,
            B_ContohIntent3_IDJAVA, B_ContohIntent4_IDJAVA,
            B_ContohIntent5_IDJAVA, B_ContohIntent6_IDJAVA, B_Keluar_IDJAVA;

    String[] ALAMAT_TUJUAN = {
            "https://play.google.com/store?hl=en",      //Playstore
            "geo:19.076.72.8777",                       //Google Maps
            "com.whatsapp",                             //WhatsApp
            "mailto:",                                  //E-Mail
    };

    String[] PROPERTI_EMAIL = {
            "alamat_email1@gmail.com",
            "alamat_email2@gmail.com",
            "alamat_email3@gmail.com",
            "alamat_email4@gmail.com",
            "alamat_email5@gmail.com",
            "Belajar Android Dasar",
            "Hei, ini adalah email pertama saya untuk kamu!"
    };

    Intent Ngeten = null, Pemilih = null;

    AlertDialog.Builder PembentukDialog;
    AlertDialog PenampilDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TV_PilihBahasa_IDJAVA = findViewById(R.id.TV_PilihBahasa_IDXML);
        TV_Judul_IDJAVA = findViewById(R.id.TV_Judul_IDXML);
        S_PilihBahasa_IDJAVA = findViewById(R.id.S_PilihBahasa_IDXML);
        B_ContohIntent1_IDJAVA = findViewById(R.id.B_ContohIntent1_IDXML);
        B_ContohIntent2_IDJAVA = findViewById(R.id.B_ContohIntent2_IDXML);
        B_ContohIntent3_IDJAVA = findViewById(R.id.B_ContohIntent3_IDXML);
        B_ContohIntent4_IDJAVA = findViewById(R.id.B_ContohIntent4_IDXML);
        B_ContohIntent5_IDJAVA = findViewById(R.id.B_ContohIntent5_IDXML);
        B_ContohIntent6_IDJAVA = findViewById(R.id.B_ContohIntent6_IDXML);
        B_Keluar_IDJAVA = findViewById(R.id.B_Keluar_IDXML);

        B_ContohIntent1_IDJAVA.setOnClickListener(this);
        B_ContohIntent2_IDJAVA.setOnClickListener(this);
        B_ContohIntent3_IDJAVA.setOnClickListener(this);
        B_ContohIntent4_IDJAVA.setOnClickListener(this);
        B_ContohIntent5_IDJAVA.setOnClickListener(this);
        B_ContohIntent6_IDJAVA.setOnClickListener(this);
        B_Keluar_IDJAVA.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.B_ContohIntent1_IDXML:
                Ngeten = new Intent(MainActivity.this, A_BukaActivityBaru.class);
                startActivity(Ngeten);
                finish();
                break;
            case R.id.B_ContohIntent2_IDXML:
                startActivity(new Intent(MainActivity.this, B_CocokkanDataDiantaraActivity.class));
                finish();
                break;
            case R.id.B_ContohIntent3_IDXML:
                Ngeten = new Intent(Intent.ACTION_VIEW);
                Ngeten.setData(Uri.parse(ALAMAT_TUJUAN[0]));
                Pemilih = Intent.createChooser(Ngeten, "Jalankan Playstore");
                startActivity(Pemilih);
                break;
            case R.id.B_ContohIntent4_IDXML:
                Ngeten = new Intent(Intent.ACTION_VIEW);
                Ngeten.setData(Uri.parse(ALAMAT_TUJUAN[1]));
                Pemilih = Intent.createChooser(Ngeten, "Jalankan Google Maps");
                startActivity(Pemilih);
                break;
            case R.id.B_ContohIntent5_IDXML:
                Ngeten = getPackageManager().getLaunchIntentForPackage(ALAMAT_TUJUAN[2]);
                Pemilih = Intent.createChooser(Ngeten, "Jalankan Aplikasi WhatsApp");
                startActivity(Pemilih);
                break;
            case R.id.B_ContohIntent6_IDXML:
                Ngeten = new Intent(Intent.ACTION_SEND);
                Ngeten.setData(Uri.parse(ALAMAT_TUJUAN[3]));
                Ngeten.putExtra(Intent.EXTRA_EMAIL, PROPERTI_EMAIL);
                Ngeten.putExtra(Intent.EXTRA_SUBJECT, PROPERTI_EMAIL[5]);
                Ngeten.putExtra(Intent.EXTRA_TEXT, PROPERTI_EMAIL[6]);
                Ngeten.setType("message/rfc822");
                Pemilih = Intent.createChooser(Ngeten, "Kirim Email");
                startActivity(Ngeten);
                break;
            case R.id.B_Keluar_IDXML:
                PembentukDialog = new AlertDialog.Builder(MainActivity.this);
                PembentukDialog.setTitle("Keluar?");
                PembentukDialog.setIcon(R.drawable.ic_launcher_background);
                PembentukDialog.setMessage("Yakin ingin keluar dari aplikasi?");
                PembentukDialog.setCancelable(false);

                PembentukDialog.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });

                PembentukDialog.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), "Anda Memilik Tidak", Toast.LENGTH_SHORT).show();
                    }
                });

                PenampilDialog = PembentukDialog.create();
                PenampilDialog.show();
                break;
        }
    }
}
