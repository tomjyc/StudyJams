package com.example.tomjy.endproject2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NameActivity extends AppCompatActivity implements View.OnClickListener{

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

        btn_name_done.setOnClickListener(this);
        btn_name_cancel.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        Intent intent = new Intent();

        switch (view.getId()){
            case R.id.btn_name_done:
                String name = edit_first_name.getText().toString();
                String secondName = edit_second_name.getText().toString();
                intent.putExtra("name", name);
                intent.putExtra("secondName", secondName);
                setResult(RESULT_OK, intent);
                break;
            case R.id.btn_name_cancel:
                setResult(RESULT_CANCELED, intent);
                break;
        }

        finish();

    }
}
