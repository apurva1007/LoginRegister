package com.example.ruplaga.loginregister;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Register extends AppCompatActivity implements View.OnClickListener{

    Button register;
    EditText name, username, age, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        register = (Button) findViewById(R.id.registerBtn);
        name = (EditText) findViewById(R.id.name);
        age = (EditText) findViewById(R.id.age);
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);

        register.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch(v.getId()){
            case R.id.registerBtn:
                startActivity(new Intent(this, Login.class));
                break;
        }
    }
}
