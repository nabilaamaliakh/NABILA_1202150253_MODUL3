package com.example.nabila.nabila_1202150253_modul3;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {
    private ImageView logo, baterai;
    private TextView judul, deskripsi, liter;
    private int count = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        baterai = (ImageView) findViewById(R.id.iv_battery);
        judul = (TextView) findViewById(R.id.tv_judul);
        deskripsi = (TextView) findViewById(R.id.tv_deskripsi);
        logo = (ImageView) findViewById(R.id.iv_logo);
        liter = (TextView) findViewById(R.id.tv_liter);

        Intent intent = getIntent();
        String Judul = intent.getStringExtra("judul");
        String Deskripsi = intent.getStringExtra("deskripsi");
        Integer Logo = intent.getIntExtra("logo", 0);


        judul.setText(Judul);
        deskripsi.setText(Deskripsi);
        logo.setImageResource(Logo);
    }

    public void plus(View view) {
        if (baterai.getDrawable().getLevel() + 1 <= 5) {
            count = count + 1;
            liter.setText(count + "L");
            baterai.setImageLevel(baterai.getDrawable().getLevel() + 1);
        } else {
            baterai.setImageLevel(5);
            Toast.makeText(this, "Air sudah penuh!", Toast.LENGTH_SHORT).show();
        }
    }

    public void minus(View view) {
        if (baterai.getDrawable().getLevel() - 1 >= 0) {
            count = count - 1;
            liter.setText(count + "L");
            baterai.setImageLevel(baterai.getDrawable().getLevel() - 1);
        } else {
            baterai.setImageLevel(0);
            Toast.makeText(this, "Air hampir habis!", Toast.LENGTH_SHORT).show();
        }
    }

}








