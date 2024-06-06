package com.example.grandmarket;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.grandmarket.data.model.Isbran;
import com.example.grandmarket.data.model.Order;
import com.example.grandmarket.data.model.Product;
import com.example.grandmarket.data.model.Product2;
import com.example.grandmarket.data.model.SravnenieSpisok;
import com.example.grandmarket.data.model.UserLoginned;

public class Stranicatel1 extends AppCompatActivity {

    private AppCompatImageView im1;
    private AppCompatImageView im2;
    private AppCompatImageView im3;
    private AppCompatImageView im4;
    private AppCompatButton CV1;
    private AppCompatButton CV2;
    private AppCompatButton Kupit;
    private TextView textglav;
    private TextView textcena;
    private TextView texthar;
    private AppCompatButton Isb;
    private Drawable ON;
    private Drawable OFF;
    public int cvet=1;
    private CheckBox srav;
    private int id;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stranicatel1);
        im1 = (AppCompatImageView) findViewById(R.id.imageView1);
        im2 = (AppCompatImageView) findViewById(R.id.imageView2);
        im3 = (AppCompatImageView) findViewById(R.id.imageView3);
        im4 = (AppCompatImageView) findViewById(R.id.imageView4);
        CV1 = (AppCompatButton) findViewById(R.id.cvet);
        CV2 = (AppCompatButton) findViewById(R.id.cvet1);
        Kupit = (AppCompatButton) findViewById(R.id.button2);
        textglav = (TextView) findViewById(R.id.glavtxt1);
        textcena = (TextView) findViewById(R.id.cena1);
        texthar = (TextView) findViewById(R.id.har1);
        Isb = (AppCompatButton) findViewById(R.id.cardstrisb1);
        ON = getResources().getDrawable(R.drawable.heartppp);
        OFF = getResources().getDrawable(R.drawable.heartgreen);



        srav = (CheckBox) findViewById(R.id.checkBox);
        Intent intent = new Intent(this, Sravnenietovarov.class);
        int id = getIntent().getIntExtra("Id",0);
        int image = getIntent().getIntExtra("image",0);
        String Nasvanie = getIntent().getStringExtra("Glav1");
        String Cena = getIntent().getStringExtra("Cena1");
        srav.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    SravnenieSpisok.Items_id_Sravnenie2=SravnenieSpisok.Items_id_Sravnenie1;
                    SravnenieSpisok.Items_id_Sravnenie1= id;
                }
                else {

                }
            }
        });

        Intent intent2 = new Intent(this, Pokypka.class);
        Kupit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent2.putExtra("image", image);
                intent2.putExtra("Nasvanie", Nasvanie);
                intent2.putExtra("Cena", Cena);
                startActivity(intent2);
            }
        });



        textglav.setText(getIntent().getStringExtra("Glav1"));
        textcena.setText(getIntent().getStringExtra("Cena1"));
        texthar.setText(getIntent().getStringExtra("Haract"));
        im1.setImageResource(getIntent().getIntExtra("imagebig1", 0));
        im2.setImageResource(getIntent().getIntExtra("imagebig2", 0));
        im3.setImageResource(getIntent().getIntExtra("imagebig3", 0));
        im4.setImageResource(getIntent().getIntExtra("imagebig4", 0));
        CV1.setBackgroundResource(getIntent().getIntExtra("buttoncvet1_on", 0));
        CV2.setBackgroundResource(getIntent().getIntExtra("buttoncvet2_off", 0));


    }

    public void addTocart(View view){
        if(cvet==1){
        int item_id = getIntent().getIntExtra("Id",0);
        Order.items_id.add(item_id);
        Toast.makeText(Stranicatel1.this, "Товар добавлен в Корзину",Toast.LENGTH_LONG).show();
        }
        if(cvet==2){
            int item_id = getIntent().getIntExtra("Id",0);
            Order.items_id.add(item_id+10000);
            Toast.makeText(Stranicatel1.this, "Товар добавлен в Корзину",Toast.LENGTH_LONG).show();
        }

    }


    public void onoff(View view) {
        cvet=1;
        textglav.setText(getIntent().getStringExtra("Glav1"));
        textcena.setText(getIntent().getStringExtra("Cena1"));
        texthar.setText(getIntent().getStringExtra("Haract"));
        im1.setImageResource(getIntent().getIntExtra("imagebig1", 0));
        im2.setImageResource(getIntent().getIntExtra("imagebig2", 0));
        im3.setImageResource(getIntent().getIntExtra("imagebig3", 0));
        im4.setImageResource(getIntent().getIntExtra("imagebig4", 0));
        CV1.setBackgroundResource(getIntent().getIntExtra("buttoncvet1_on", 0));
        CV2.setBackgroundResource(getIntent().getIntExtra("buttoncvet2_off", 0));

    }

    public void onoff2(View view) {
        cvet=2;
        textglav.setText(getIntent().getStringExtra("Glav2"));
        textcena.setText(getIntent().getStringExtra("Cena2"));
        texthar.setText(getIntent().getStringExtra("Haract"));
        im1.setImageResource(getIntent().getIntExtra("imagebig5", 0));
        im2.setImageResource(getIntent().getIntExtra("imagebig6", 0));
        im3.setImageResource(getIntent().getIntExtra("imagebig7", 0));
        im4.setImageResource(getIntent().getIntExtra("imagebig8", 0));
        CV1.setBackgroundResource(getIntent().getIntExtra("buttoncvet1_off", 0));
        CV2.setBackgroundResource(getIntent().getIntExtra("buttoncvet2_on", 0));

    }


    private boolean isButtonClicked = false;
    public void Isb(View view) {


        if (view.getId() == R.id.cardstrisb1) {
            isButtonClicked = !isButtonClicked; // toggle the boolean flag
            if(isButtonClicked){
                Isb.setBackgroundResource(R.drawable.strokeisb);
                Toast.makeText(Stranicatel1.this, "Товар добавлен в Избранное!",Toast.LENGTH_LONG).show();
                Isb.setCompoundDrawablesWithIntrinsicBounds(null, ON, null, null);
                int item_id_isbrannoe = getIntent().getIntExtra("Id",0);
                Isbran.Items_id_Ibrannoe.add(item_id_isbrannoe);
            }
            else {
                Isb.setBackgroundResource(R.drawable.stroke1);
                Toast.makeText(Stranicatel1.this, "Товар убран из Избранного!",Toast.LENGTH_LONG).show();
                Isb.setCompoundDrawablesWithIntrinsicBounds(null, OFF, null, null);
            }
        }
    }
}