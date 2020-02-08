package com.example.stomatoloskaordinacija_aplikacija;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class doktor_meni extends AppCompatActivity {

    private Button id_zakazi_pregled, id_pregledi, id_filter, id_logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doktor_meni);
        Bundle extras = getIntent().getExtras();
        final String username = extras.getString("username");




        id_pregledi = findViewById(R.id.id_pregledi);
        id_filter = findViewById(R.id.id_filter);
        id_logout = findViewById(R.id.id_logout);




        id_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inten = new Intent(doktor_meni.this,doktor_login.class);
                doktor_meni.this.startActivity(inten);
            }
        });

        id_filter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(doktor_meni.this,Zaposleni.class);
                doktor_meni.this.startActivity(inte);
            }
        });


        id_pregledi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(doktor_meni.this,doktor_pregledi.class);

                doktor_meni.this.startActivity(inte);
            }
        });








    }
}
