package com.example.grandmarket;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.grandmarket.data.model.SakaS;

public class Status extends AppCompatActivity {

    TextView Nasv;
    TextView Cena;
    AppCompatImageView Im;
    AppCompatButton Otmena;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_status);

        Nasv = (TextView) findViewById(R.id.NasvOt);
        Cena = (TextView) findViewById(R.id.CenaOt);
        Im = (AppCompatImageView) findViewById(R.id.ImOt);
        Otmena = (AppCompatButton) findViewById(R.id.Otmena);

        Im.setImageResource(SakaS.ImOT);
        Cena.setText(SakaS.CenaOT);
        Nasv.setText(SakaS.NasvOT);

        Intent intent = new Intent(this, MainActivity.class);
        Otmena.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Status.this, "Ваш заказ успешно отменен",Toast.LENGTH_LONG).show();
                SakaS.CenaOT = "";
                SakaS.NasvOT = "";
                SakaS.ImOT = 1;
                startActivity(intent);
            }
        });











    }
}