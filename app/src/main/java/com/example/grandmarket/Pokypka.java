package com.example.grandmarket;

import static androidx.core.app.NotificationCompat.PRIORITY_DEFAULT;
import static androidx.core.app.NotificationCompat.PRIORITY_HIGH;
import static androidx.core.app.NotificationCompat.PRIORITY_LOW;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.core.app.NotificationCompat;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class Pokypka extends AppCompatActivity {

    private NotificationManager notificationManager;
    private static final int NOTIFY_ID = 1;
    private static final String CHANNEL_ID= "CHANNEL_ID";
    AppCompatButton Samovisov;
    AppCompatButton Dostavka;
    AppCompatButton Sber;
    AppCompatButton Sbp;
    AppCompatButton Karta;
    AppCompatButton Podverdit;
    CardView cardView;
    EditText ED1;
    EditText ED2;
    EditText Phone;
    TextView Nasvanie;
    TextView Cena;
    AppCompatImageView Imagetel;
    boolean d=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pokypka);

        Samovisov = (AppCompatButton) findViewById(R.id.Samovisov);
        Dostavka = (AppCompatButton) findViewById(R.id.Dostavka);
        Podverdit = (AppCompatButton) findViewById(R.id.Podtverdit);
        Sber = (AppCompatButton) findViewById(R.id.Sber);
        Karta = (AppCompatButton) findViewById(R.id.Karta);
        Sbp = (AppCompatButton) findViewById(R.id.Sbp);
        cardView = (CardView) findViewById(R.id.cardview1);
        ED1 = (EditText) findViewById(R.id.editTextTextPersonName2);
        ED2 = (EditText) findViewById(R.id.editTextTextPersonName3);
        Phone = (EditText) findViewById(R.id.editTextPhone);
        Nasvanie = (TextView) findViewById(R.id.Nasvanie);
        Cena = (TextView) findViewById(R.id.Cena);
        Imagetel = (AppCompatImageView) findViewById(R.id.Image);

        Imagetel.setImageResource(getIntent().getIntExtra("image", 0));
        Nasvanie.setText(getIntent().getStringExtra("Nasvanie"));
        Cena.setText(getIntent().getStringExtra("Cena"));


        notificationManager = (NotificationManager) getApplicationContext().getSystemService(Context.NOTIFICATION_SERVICE);











        Samovisov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.setVisibility(View.VISIBLE);
                ED1.setVisibility(View.GONE);
                ED2.setVisibility(View.GONE);
                Intent intent1 = new Intent(getApplicationContext(), Pokypka.class);
                NotificationCompat.Builder notificationBilder =
                        new NotificationCompat.Builder(getApplicationContext(), CHANNEL_ID)
                                .setAutoCancel(false)
                                .setSmallIcon(R.drawable.sber)
                                .setWhen(System.currentTimeMillis())
                                .setContentTitle("ewwwewe")
                                .setContentText("weweweew")
                                .setPriority(PRIORITY_HIGH);
                createChannelIfNeeded(notificationManager);
                notificationManager.notify(NOTIFY_ID,notificationBilder.build());

            }
        });
        Dostavka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.setVisibility(View.GONE);
                ED1.setVisibility(View.VISIBLE);
                ED2.setVisibility(View.VISIBLE);
            }
        });
        Sber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d = true;
                Karta.setBackgroundResource(R.drawable.karta);
                Sbp.setBackgroundResource(R.drawable.sbp);
                Sber.setBackgroundResource(R.drawable.sberok);
            }
        });
        Karta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d = true;
                Karta.setBackgroundResource(R.drawable.kartaok);
                Sbp.setBackgroundResource(R.drawable.sbp);
                Sber.setBackgroundResource(R.drawable.sber);
            }
        });
        Sbp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d = true;
                Karta.setBackgroundResource(R.drawable.karta);
                Sbp.setBackgroundResource(R.drawable.sbpok);
                Sber.setBackgroundResource(R.drawable.sber);
            }
        });
        Intent intent = new Intent(this, MainActivity.class);
        Podverdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (TextUtils.isEmpty(Phone.getText().toString())) {
                    Snackbar.make(Phone, "Введите ваше номер телефона", Snackbar.LENGTH_SHORT).show();

                }
                if(d==false){
                    Snackbar.make(Phone, "Выберите спопсоб оплаты", Snackbar.LENGTH_SHORT).show();
                }

                if ((!TextUtils.isEmpty(Phone.getText().toString()))&&(d==true)) {
                    Toast.makeText(Pokypka.this, "Ваш заказ успешно оформлен",Toast.LENGTH_LONG).show();




                    startActivity(intent);
                }


            }
        });



    }

    public static void createChannelIfNeeded(NotificationManager manager){
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            NotificationChannel notificationChannel = new NotificationChannel(CHANNEL_ID, CHANNEL_ID, NotificationManager.IMPORTANCE_DEFAULT);
            manager.createNotificationChannel(notificationChannel);
        }
    }














}