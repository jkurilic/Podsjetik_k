package com.example.mm.podsjetik_k;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Lijek extends AppCompatActivity {


        private Button buttonPocetnaK;
        private Button buttonPodsjetnikL;
        private Button buttonPodsjetnikK;
        private ImageButton iBunosLijeka;


        @Override
        protected void onCreate (Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_lijek);

            buttonPocetnaK = findViewById(R.id.buttonPocetnaUp);
            buttonPodsjetnikL = findViewById(R.id.buttonPodsjetnikL);
            buttonPodsjetnikK = findViewById(R.id.buttonKupovinaUp);
            iBunosLijeka = findViewById(R.id.iBunosLijeka);


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
                    openUnosPodsjetnika();
                }
            });
            iBunosLijeka.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openUnosLijeka();
                }
            });
        }
        public void openUnosPodsjetnika () {
            Intent intent1 = new Intent(this, Podsjetnik_lijek.class);
            startActivity(intent1);
        }

        public void openPocetna () {
            Intent intent2 = new Intent(this, MainActivity.class);
            startActivity(intent2);
        }

        public void openPopisKupovina () {
            Intent intent3 = new Intent(this, Podsjetnik_kupovina.class);
            startActivity(intent3);
        }
        public void openUnosLijeka () {
        Intent intent4 = new Intent(this, unos_lijeka.class);
        startActivity(intent4);
    }

    }
