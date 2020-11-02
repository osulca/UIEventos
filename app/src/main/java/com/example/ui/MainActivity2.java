package com.example.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle bundle = getIntent().getExtras();
        Toast.makeText(this, bundle.getString("Nombre"), Toast.LENGTH_LONG).show();

    }

    public void Cerrar(View view) {
        finish();
    }
}