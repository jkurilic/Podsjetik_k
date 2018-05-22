package com.example.mm.podsjetik_k;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class unos_podsjetnika extends AppCompatActivity {

    private Button buttonPocetnaUp;
    private Button buttonLijekoviUp;
    private Button buttonKupovinaUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unos_podsjetnika);
        buttonPocetnaUp = findViewById(R.id.buttonPocetnaUp);
        buttonLijekoviUp = findViewById(R.id.buttonLijekoviUp);
        buttonKupovinaUp = findViewById(R.id.buttonKupovinaUp);

        buttonPocetnaUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPocetnaUp();
            }
        });

        buttonLijekoviUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLijekoviUp();
            }
        });

        buttonKupovinaUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openKupovinaUp();
            }
        });
    }

    public void openPocetnaUp() {
        Intent intent1 = new Intent(this, MainActivity.class);
        startActivity(intent1);
    }

    public void openLijekoviUp() {
        Intent intent2 = new Intent(this, Lijek.class);
        startActivity(intent2);
    }

    public void openKupovinaUp() {
        Intent intent3 = new Intent(this, Podsjetnik_kupovina.class);
        startActivity(intent3);
    }
}