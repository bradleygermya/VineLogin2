package com.example.germyabradley.vinelogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    private EditText Email;
    private EditText Password;
    private Button Login;
    private Button PasswordReset;

    private int counter=5;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Email=(EditText)findViewById(R.id.etEmail);
        Password=(EditText)findViewById(R.id.etPassword);
        Login=(Button)findViewById(R.id.btLogin);
        PasswordReset=(Button)findViewById(R.id.btForgotPassword);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                validate(Email.getText().toString(),Password.getText().toString());

            }
        });

    }

    private void  validate( String userEmail, String userPassword)
    {
        if((userEmail=="gb99@codepath.com")&& (userPassword=="2021"))
        {
            Intent intent = new Intent(LoginActivity.this, SecondActivity.class);
            startActivity(intent);
        }

    }
}
