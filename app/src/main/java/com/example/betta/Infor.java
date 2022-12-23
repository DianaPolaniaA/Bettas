package com.example.betta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Infor extends AppCompatActivity {

    private Button buttonInfo;
    private TextView textNombrePezInfo, textDescriptionInfo, textPrecioInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infor);

        buttonInfo=(Button) findViewById(R.id.buttonInfo);
        textNombrePezInfo = (TextView)findViewById(R.id.textNombrePezInfo);
        textDescriptionInfo = (TextView) findViewById(R.id.textDescriptionInfo);
        textPrecioInfo =(TextView) findViewById(R.id.textPrecioInfo);

        Intent intentIn =getIntent();


        textNombrePezInfo.setText(intentIn.getStringExtra("name"));
        textDescriptionInfo.setText(intentIn.getStringExtra("description"));
        textPrecioInfo.setText(intentIn.getStringExtra("price"));

        buttonInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Catalogo.class);
                startActivity(intent);
            }
        });

    }
}