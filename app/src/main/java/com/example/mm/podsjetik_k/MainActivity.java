package com.example.mm.podsjetik_k;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity {

    private Button buttonPodsjetnik;
    private Button  buttonLijekovi;
    private Button  buttonKupovina;
    private ImageButton fabNoviPodsjetnik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonPodsjetnik =  (Button) findViewById(R.id.buttonPodsjetnik);
        buttonLijekovi = (Button) findViewById(R.id.buttonLijekovi);
        buttonKupovina = (Button) findViewById(R.id.buttonKupovina);
        fabNoviPodsjetnik= (ImageButton) findViewById(R.id.fabNoviPodsjetnik);


       buttonPodsjetnik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPodsjetnikLijek();
            }
        });

        buttonLijekovi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUnosLijeka();
            }
        });

        buttonKupovina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPopisKupovina();
            }
        });

        fabNoviPodsjetnik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUnosPodsjetnika();
            }
        });

    }


    public void openPodsjetnikLijek() {
        Intent intent1 = new Intent(this, Podsjetnik_lijek.class);
        startActivity(intent1);
    }

    public void openUnosLijeka(){
        Intent intent2 = new Intent (this, Lijek.class);
        startActivity(intent2);
    }

    public void openPopisKupovina(){
        Intent intent3 = new Intent(this, Podsjetnik_kupovina.class);
        startActivity(intent3);
    }

    public void openUnosPodsjetnika(){
        Intent intent4 = new Intent(this, unos_podsjetnika.class);
        startActivity(intent4);
    }

}
