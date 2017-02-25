package com.example.tomjy.endproject2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener{

    Button close;
    TextView text_first_name, text_second_name, text_birth_day, text_about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        close = (Button) findViewById(R.id.btn_close);
        close.setOnClickListener(this);

        text_first_name = (TextView) findViewById(R.id.text_first_name);
        text_second_name = (TextView) findViewById(R.id.text_second_name);
        text_birth_day = (TextView) findViewById(R.id.text_birth_day);
        text_about = (TextView) findViewById(R.id.text_about);

        Intent intent = getIntent();

        text_first_name.setText(intent.getStringExtra("name"));
        text_second_name.setText(intent.getStringExtra("secondName"));
        text_birth_day.setText(intent.getStringExtra("birthday"));
        text_about.setText(intent.getStringExtra("aboutMe"));

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.btn_close:
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                break;
        }

    }
}
