package com.example.tomjy.endproject2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class BirthdayActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_b_done, btn_b_cancel;
    EditText edit_birthbay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthday);

        edit_birthbay = (EditText) findViewById(R.id.edit_birthbay);
        btn_b_done = (Button) findViewById(R.id.btn_b_done);
        btn_b_cancel = (Button) findViewById(R.id.btn_b_cancel);

        btn_b_done.setOnClickListener(this);
        btn_b_cancel.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        Intent intent = new Intent();

        switch (view.getId()){
            case R.id.btn_b_done:
                String birthday = edit_birthbay.getText().toString();
                intent.putExtra("birthday", birthday);
                setResult(RESULT_OK, intent);
                break;
            case R.id.btn_b_cancel:
                setResult(RESULT_CANCELED, intent);
                break;
        }

        finish();

    }
}
