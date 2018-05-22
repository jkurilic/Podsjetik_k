package com.example.mm.podsjetik_k;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Podsjetnik_lijek extends AppCompatActivity {
    private Button buttonPocetnaK;
    private Button  buttonPodsjetnikL;
    private Button  buttonPodsjetnikK;
    private ImageButton fabNoviPodsjetnik2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_podsjetnik_lijek);

        buttonPocetnaK = findViewById(R.id.buttonPocetnaUp);
        buttonPodsjetnikL =  findViewById(R.id.buttonPodsjetnikL);
        buttonPodsjetnikK =  findViewById(R.id.buttonKupovinaUp);
        fabNoviPodsjetnik2= (ImageButton) findViewById(R.id.fabNoviPodsjetnik2);


        buttonPodsjetnikK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPopisKupovina();
            }
        });
        buttonPocetnaK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPocetna();
            }
        });
        buttonPodsjetnikL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNoviLijek();
            }
        });
        fabNoviPodsjetnik2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUnosPodsjetnikaLijek();
            }
        });
    }
    public void openPocetna() {
        Intent intent1 = new Intent(this, MainActivity.class);
        startActivity(intent1);
    }
    public void openNoviLijek(){
        Intent intent2 = new Intent (this, Lijek.class);
        startActivity(intent2);
    }
    public void openPopisKupovina(){
        Intent intent3 = new Intent(this, Podsjetnik_kupovina.class);
        startActivity(intent3);
    }
    public void openUnosPodsjetnikaLijek(){
        Intent intent4 = new Intent(this, unos_podsjetnika.class);
        startActivity(intent4);
    }
}