package com.example.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView tvCiclo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvCiclo = findViewById(R.id.textCiclo);
        tvCiclo.setText("onCreate\n");
        Button btnM1 = findViewById(R.id.btnMetodo1);
        btnM1.setOnClickListener(this);

        Button btnM2 = findViewById(R.id.btnMetodo2);
        btnM2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvCiclo.setText("Metodo 2");
            }
        });

    }

    @Override
    protected void onPause() {
        super.onPause();
        tvCiclo.append("onPause\n");
    }

    @Override
    protected void onResume() {
        super.onResume();
        tvCiclo.append("onResume\n");
    }

    @Override
    protected void onStart() {
        super.onStart();
        tvCiclo.append("onStart\n");
    }

    @Override
    protected void onStop() {
        super.onStop();
        tvCiclo.append("onStop\n");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        tvCiclo.append("onRestart\n");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Has destruido la app", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View v) {
        tvCiclo.setText("metodo 1");
    }

    public void hazAlgo(View view) {
        Toast.makeText(this, "metodo 3", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }

    public void enviarEmail(View view) {
        String[] addresses = {"omar@gmail.com", "pedro@udh.edu.pe"};
        String subject = "Saludos";

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("*/*");
        intent.putExtra(Intent.EXTRA_EMAIL, addresses);
        intent.putExtra(Intent.EXTRA_SUBJECT, subject);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}