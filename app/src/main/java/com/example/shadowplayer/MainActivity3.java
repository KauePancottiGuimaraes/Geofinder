package com.example.shadowplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
    public void back(View view){
        Intent it = new Intent(this, MainActivity6.class);
        startActivity(it);
    }

    public void next(View view){
        Intent it = new Intent(this, MainActivity4.class);
        startActivity(it);

    }

    public void legal(View view){
        Intent it = new Intent(this, MainActivity2.class);
        startActivity(it);
    }

    public void onClickDica1(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.grupoescolar.com/pesquisa/asia-meridional.html"));
        startActivity(i);
    }
}