package com.example.tomjy.endproject2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    final int REQUEST_NAME = 1;
    final int REQUEST_BIRTHSDAY = 2;
    final int REQUEST_ABOUTME = 3;

    private Person person;

    Button btn_name, btn_birthday, btn_about_me, btn_register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        person = new Person();

        btn_name = (Button) findViewById(R.id.btn_name);
        btn_birthday = (Button) findViewById(R.id.btn_birthday);
        btn_about_me = (Button) findViewById(R.id.btn_about_me);
        btn_register = (Button) findViewById(R.id.btn_register);

        btn_name.setOnClickListener(this);
        btn_birthday.setOnClickListener(this);
        btn_about_me.setOnClickListener(this);
        btn_register.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        Intent intent;

        switch (view.getId()){
            case R.id.btn_name:
                intent = new Intent(this, NameActivity.class);
                intent.putExtra("person", person.getClass());
                startActivityForResult(intent, REQUEST_NAME);
                break;
            case R.id.btn_birthday:
                intent = new Intent(this, BirthdayActivity.class);
                intent.putExtra("person", person.getClass());
                startActivityForResult(intent, REQUEST_BIRTHSDAY);
                break;
            case R.id.btn_about_me:
                intent = new Intent(this, NameActivity.class);
                intent.putExtra("person", person.getClass());
                startActivityForResult(intent, REQUEST_ABOUTME);
                break;
            case R.id.btn_register:
                intent = new Intent(this, RegisterActivity.class);
                intent.putExtra("person", person.getClass());
                startActivity(intent);
                break;
        }

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == RESULT_OK) {
            person = data.getParcelableExtra("person");
        }else Toast.makeText(MainActivity.this, "Wrong result", Toast.LENGTH_SHORT).show();
    }
}
