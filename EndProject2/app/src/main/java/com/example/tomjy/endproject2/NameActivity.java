package com.example.tomjy.endproject2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

public class NameActivity extends AppCompatActivity {

    EditText edit_first_name, edit_second_name;
    Button btn_name_done, btn_name_cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);

        edit_first_name = (EditText) findViewById(R.id.edit_first_name);
        edit_second_name = (EditText) findViewById(R.id.edit_second_name);

        btn_name_done = (Button) findViewById(R.id.btn_name_done);
        btn_name_cancel = (Button) findViewById(R.id.btn_name_cancel);

        In

    }
}
