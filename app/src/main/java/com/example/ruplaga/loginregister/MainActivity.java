package com.example.ruplaga.loginregister;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button logout;
    EditText username, age, name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        logout = (Button) findViewById(R.id.logoutBtn);
        username = (EditText) findViewById(R.id.username);
        age = (EditText) findViewById(R.id.age);
        name = (EditText) findViewById(R.id.name);

        logout.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch(v.getId()){
            case R.id.logoutBtn:
                startActivity(new Intent(this, Login.class));
                break;
        }
    }
}


