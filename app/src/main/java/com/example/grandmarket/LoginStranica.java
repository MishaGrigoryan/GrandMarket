package com.example.grandmarket;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.grandmarket.data.model.LoggedInUser;
import com.example.grandmarket.data.model.Order;
import com.example.grandmarket.data.model.Product;
import com.example.grandmarket.data.model.Product2;
import com.example.grandmarket.data.model.UserLoginned;
import com.example.grandmarket.data.model.Users;
import com.google.android.material.snackbar.Snackbar;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class LoginStranica extends AppCompatActivity {
    public List<Users> UserList = new ArrayList<>();
    public List<String> UserList2 = new ArrayList<String>();
    AppCompatButton LoginBut;
    AppCompatButton RegBut;
    EditText Login;
    EditText Password;
    public boolean logintf=false;
    public boolean reg = false;
    public int id =2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_stranica);

        Login = findViewById(R.id.editTextTextEmailAddress);
        Password = findViewById(R.id.editTextTextPassword);
        UserList.add(new Users("Misha", "г.Таганрог", "mishagrigoryan3@gmail.com", "20021811", 1));
        UserList.add(new Users("Alisha", "г.Таганрог", "Kisynchik@gmail.com", "Kisyn2005", 2));
        RegBut = findViewById(R.id.RegisterUser);

        RegBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginStranica.this, RegisterStranica.class);
                startActivity(intent);
            }
        });
        Intent intent = getIntent();
        id+=1;
        UserList.add(new Users(intent.getStringExtra("Name"), intent.getStringExtra("Town"), intent.getStringExtra("Login"), intent.getStringExtra("Password"), id));

        LoginBut = findViewById(R.id.LoginUserBut);
        LoginBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(Login.getText().toString())) {
                    Snackbar.make(Login, "Введите вашу почту", Snackbar.LENGTH_SHORT).show();
                }
                if (TextUtils.isEmpty(Password.getText().toString())) {
                    Snackbar.make(Password, "Введите ваш пароль", Snackbar.LENGTH_SHORT).show();
                }
                boolean d = false;

                for(Users u : UserList){
                    if ((Login.getText().toString().equals(u.getUserEmail()))&&(Password.getText().toString().equals(u.getUserPassword()))){
                        Toast.makeText(LoginStranica.this, "Авторизация прошла успешно",Toast.LENGTH_LONG).show();
                        Intent intent2 = new Intent(LoginStranica.this, BlankFragment.class);
                        UserLoginned.Userid.add(u.getUserId());
                        UserLoginned.UserNamelog.add(u.getUserName());
                        UserLoginned.UserCitylog.add(u.getUserCity());
                        UserLoginned.TF.add(3);
                        Intent intent = new Intent(LoginStranica.this, MainActivity.class);
                        startActivity(intent);
                    }
                    else {
                        Toast.makeText(LoginStranica.this, "Неверный логин или пароль",Toast.LENGTH_SHORT).show();
                    }




                }







            }
        });
    }
}