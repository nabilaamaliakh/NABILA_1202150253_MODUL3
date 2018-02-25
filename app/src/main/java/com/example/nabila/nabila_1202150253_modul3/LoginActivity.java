package com.example.nabila.nabila_1202150253_modul3;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    //deklarasi dan inisiasi variable umum/global
    EditText username, password;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //sebagai inisiasi id pada activity_login.xml
        username = (EditText)findViewById(R.id.username);
        password = (EditText)findViewById(R.id.password);
        login = (Button)findViewById(R.id.bt_login);

        //mendeklarasikan button untuk pindah ke activity selanjutnya
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String usernameKey = username.getText().toString();
                String passwordKey = password.getText().toString();

                //username dan password yang akan di inputkan pada saat login dan akan menampilkan toast pada saat username dan password benar
                //dan akan menampilkan toast juga pada saat username dan password salah
                if (usernameKey.equals("EAD") && passwordKey.equals("MOBILE")){
                    Toast.makeText(getApplicationContext(), "Login Berhasil!!", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                }else {
                    Toast.makeText(LoginActivity.this, "Username atau Password anda salah!", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
