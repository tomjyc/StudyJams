package com.example.tomjy.endproject1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private LinearLayout map, email, phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        map = (LinearLayout) findViewById(R.id.mapLay);
        email = (LinearLayout) findViewById(R.id.emailLay);
        phone = (LinearLayout) findViewById(R.id.pholeLay);

        map.setOnClickListener(this);
        email.setOnClickListener(this);
        phone.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        Intent intent;

        switch (view.getId()){
            case R.id.mapLay:
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("geo:0,0?q=Espresso+Bar, вулиця+Лазарєва,+4,+Черкаси,+Черкаська+область,+18000"));
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
                break;
            case R.id.emailLay:
                intent = new Intent(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"espressobar@gmail.com"});
                intent.putExtra(Intent.EXTRA_SUBJECT, "Order");
                intent.putExtra(Intent.EXTRA_TEXT, "I want to order:");

                intent.setType("message/rtc822");
                startActivity(Intent.createChooser(intent, "Please choose your favorite service..."));
                break;
            case R.id.pholeLay:
                intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:0672361526"));
                startActivity(intent);
                break;
        }

    }
}
