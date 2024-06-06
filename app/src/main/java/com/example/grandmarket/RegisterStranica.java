package com.example.grandmarket;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

import com.google.android.material.snackbar.Snackbar;

public class RegisterStranica extends AppCompatActivity {

    AppCompatButton Registerbut;
    EditText Name;
    EditText Town;
    EditText Login;
    EditText Password;
    EditText Password2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_stranica);
        Name = findViewById(R.id.NameReg);
        Town = findViewById(R.id.TownReg);
        Login = findViewById(R.id.LoginReg);
        Password = findViewById(R.id.Pas1Reg);
        Password2 = findViewById(R.id.Pas2Reg);
        Registerbut = findViewById(R.id.buttonRegister);


        Registerbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(Name.getText().toString())) {
                    Snackbar.make(Name, "Введите ваше имя", Snackbar.LENGTH_SHORT).show();
                }
                if (TextUtils.isEmpty(Town.getText().toString())) {
                    Snackbar.make(Town, "Введите ваш город", Snackbar.LENGTH_SHORT).show();
                }
                if (TextUtils.isEmpty(Login.getText().toString())) {
                    Snackbar.make(Login, "Введите вашу почту", Snackbar.LENGTH_SHORT).show();
                }
                if (TextUtils.isEmpty(Password.getText().toString())) {
                    Snackbar.make(Password, "Введите ваш пароль", Snackbar.LENGTH_SHORT).show();
                }
                if (TextUtils.isEmpty(Password2.getText().toString())) {
                    Snackbar.make(Password2, "Введите ваш пароль повторно", Snackbar.LENGTH_SHORT).show();
                }
                if (!(Password.getText().toString().equals(Password2.getText().toString()))){
                    Snackbar.make(Password2, "Пароли не совпадают", Snackbar.LENGTH_SHORT).show();
                }
                if(!(TextUtils.isEmpty(Name.getText().toString()))&&(!(TextUtils.isEmpty(Town.getText().toString())))&&!(TextUtils.isEmpty(Login.getText().toString()))&&!(TextUtils.isEmpty(Password.getText().toString()))&&!(TextUtils.isEmpty(Password2.getText().toString()))&&(Password.getText().toString().equals(Password2.getText().toString()))){
                    Intent intent = new Intent(RegisterStranica.this, LoginStranica.class);
                    intent.putExtra("Name", Name.getText().toString());
                    intent.putExtra("Town", Town.getText().toString());
                    intent.putExtra("Login", Login.getText().toString());
                    intent.putExtra("Password", Password.getText().toString());
                    startActivity(intent);
                }







            }
        });













    }











}