package com.example.nabila.nabila_1202150253_modul3;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> JudulMinuman;
    private ArrayList<String> SubJudul;
    private ArrayList<Integer> gambar;
    private TextView a, b;

    private String[] Judul = {"Aqua",
            "Ades",
            "Amidis",
            "Cleo",
            "Club",
            "Equil",
            "Evian",
            "LeMinerale",
            "Nestle",
            "Pristine",
            "Vit"};

    private String[] Subjudul = {"Ini adalah air minum merk Aqua",
            "Ini adalah air minum merk Ades",
            "Ini adalah air minum merk Amidis",
            "Ini adalah air minum merk Cleo",
            "Ini adalah air minum merk Club",
            "Ini adalah air minum merk Equil",
            "Ini adalah air minum merk Evian",
            "Ini adalah air minum merk LeMinerale",
            "Ini adalah air minum merk Nestle",
            "Ini adalah air minum merk Pristine",
            "Ini adalah air minum merk Vit"};

    private int[] Gambar = {R.drawable.aqua,
            R.drawable.ades,
            R.drawable.amidis,
            R.drawable.cleo,
            R.drawable.club,
            R.drawable.equil,
            R.drawable.evian,
            R.drawable.leminerale,
            R.drawable.nestle,
            R.drawable.pristine,
            R.drawable.vit};

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //mendeklarasikan array list untuk menu harga dan gambar
        JudulMinuman = new ArrayList<>();
        SubJudul = new ArrayList<>();
        gambar = new ArrayList<>();

        rvView = (RecyclerView) findViewById(R.id.rc_list);
        rvView.setHasFixedSize(true);

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            rvView.setLayoutManager(new GridLayoutManager(MainActivity.this, 2));
        } else {
            rvView.setLayoutManager(new GridLayoutManager(MainActivity.this, 1));
        }
        ListItem();

    }
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if(newConfig.orientation== Configuration.ORIENTATION_LANDSCAPE){
            rvView.setLayoutManager(new GridLayoutManager(MainActivity.this, 2));
        }else {
            rvView.setLayoutManager(new GridLayoutManager(MainActivity.this, 1));
        }
    }
    private void ListItem() {
        for (int w = 0; w < Judul.length; w++) {
            JudulMinuman.add(Judul[w]);
            SubJudul.add(Subjudul[w]);
            gambar.add(Gambar[w]);

            adapter = new RecyclerViewAdapter(JudulMinuman, SubJudul, gambar);
            rvView.setAdapter(adapter);
        }
    }
}