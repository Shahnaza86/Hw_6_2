package com.example.hw_6_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView Enter=findViewById(R.id.enter);
        TextView MakeEnter=findViewById(R.id.make_enter);
        TextView Register=findViewById(R.id.register);
        TextView Welcome=findViewById(R.id.welcome);
        EditText Email=findViewById(R.id.email);
        EditText Password=findViewById(R.id.password);
        Button Button=findViewById(R.id.button);
        TextView ForgotPassword=findViewById(R.id.forgot_password);
        TextView Tap=findViewById(R.id.tap_here);

        Email.addTextChangedListener(new TextWatcher() {

            public void afterTextChanged(Editable s) {}

            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {}

            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {
                if (Email.getText().toString().isEmpty()){
                    Button.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.grey));
                }else{
                    Button.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.orange));
                }
            }
        });

        Password.addTextChangedListener(new TextWatcher() {

            public void afterTextChanged(Editable s) {}

            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {}

            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {
                if (Password.getText().toString().isEmpty()){
                    Button.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.grey));
                }else{
                    Button.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.orange));
                }
            }
        });
        Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Email.getText().toString().equals("Admin") && Password.getText().toString().equals("Admin")) {
                    Email.setVisibility(View.GONE);
                    Password.setVisibility(View.GONE);
                    ForgotPassword.setVisibility(View.GONE);
                    Tap.setVisibility(View.GONE);
                    Register.setVisibility(View.GONE);
                    Enter.setVisibility(View.GONE);
                    MakeEnter.setVisibility(View.GONE);
                    Toast.makeText(MainActivity.this, "Вы успешно вошли в аккаунт", Toast.LENGTH_SHORT).show();

                }else{
                        Toast.makeText(MainActivity.this, "Неверно введен логин и пароль", Toast.LENGTH_SHORT).show();
                    }
                }
            });
    }}




