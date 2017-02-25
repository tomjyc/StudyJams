package com.example.tomjy.endproject2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AboutMeActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_am_done, btn_am_cancel;
    EditText edit_about_me;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);

        edit_about_me = (EditText) findViewById(R.id.edit_about_me);
        btn_am_done = (Button) findViewById(R.id.btn_am_done);
        btn_am_cancel = (Button) findViewById(R.id.btn_am_cancel);

        btn_am_done.setOnClickListener(this);
        btn_am_cancel.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent();

        switch (view.getId()){
            case R.id.btn_am_done:
                String aboutMe = edit_about_me.getText().toString();
                Toast.makeText(AboutMeActivity.this, aboutMe, Toast.LENGTH_SHORT).show();
                intent.putExtra("aboutMe", aboutMe);
                setResult(RESULT_OK, intent);
                break;
            case R.id.btn_am_cancel:
                setResult(RESULT_CANCELED, intent);
                break;
        }

        finish();
    }
}
