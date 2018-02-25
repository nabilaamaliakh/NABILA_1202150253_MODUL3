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
    //deklarasi dan inisiasi variable umum/global
    private ImageView logo, baterai;
    private TextView judul, deskripsi, liter;
    private int count = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //Melakukan inisiasi pada id
        baterai = (ImageView) findViewById(R.id.iv_battery);
        judul = (TextView) findViewById(R.id.tv_judul);
        deskripsi = (TextView) findViewById(R.id.tv_deskripsi);
        logo = (ImageView) findViewById(R.id.iv_logo);
        liter = (TextView) findViewById(R.id.tv_liter);

        //melakukan get data dari menu fitur sebelumnya sudah membawa data yang dikirim
        Intent intent = getIntent();
        String Judul = intent.getStringExtra("judul");
        String Deskripsi = intent.getStringExtra("deskripsi");
        Integer Logo = intent.getIntExtra("logo", 0);

        //melakukan set text maupun setImageResource untuk data yang sudah di bawa dari layout sebelumnya
        judul.setText(Judul);
        deskripsi.setText(Deskripsi);
        logo.setImageResource(Logo);
    }

    //method yang akan di eksekusi pada saat button plus di klik
    public void plus(View view) {
        //air akan di isi 1 tingkat dari yang paling awal sampai yang tertinggi
        if (baterai.getDrawable().getLevel() + 1 <= 5) {
            //air akan ditambah sebanyak 1 liter setiap di klik
            count = count + 1;
            //kemudian setText akan menampilkan hasil berapa liter air yang sudah ditambah
            liter.setText(count + "L");
            //kemudian setImage dengan 1 tingkat sebelum level tertinggi
            baterai.setImageLevel(baterai.getDrawable().getLevel() + 1);
        } else {
            //ketika level air penuh
            baterai.setImageLevel(5);
            //maka akan menapilkan toast jika air sudah penuh
            Toast.makeText(this, "Air sudah penuh!", Toast.LENGTH_SHORT).show();
        }
    }

    //method yang akan di eksekusi pada saat button minus di klik
    public void minus(View view) {
        //air akan berkurang 1 tingkat dari yang sebelumnya sampai yang terendah
        if (baterai.getDrawable().getLevel() - 1 >= 0) {
            //air akan dikurangi sebanyak 1 liter setiap di klik
            count = count - 1;
            //kemudian setText akan menampikan hasil berapa liter air yang sudah dikurangi
            liter.setText(count + "L");
            //kemudian setImage dengan 1 tingkat sebelum level terendah
            baterai.setImageLevel(baterai.getDrawable().getLevel() - 1);
        } else {
            //ketika level air sudah mau habis
            baterai.setImageLevel(0);
            //maka akan menampilkan toast jika air sudah hampir habis
            Toast.makeText(this, "Air hampir habis!", Toast.LENGTH_SHORT).show();
        }
    }

}








