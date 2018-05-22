package com.example.mm.podsjetik_k;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class unos_lijeka extends AppCompatActivity {

    private Button buttonPocetnaUl;
    private Button  buttonLijekoviU;
    private Button buttonKupovinaUl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unos_lijeka);

        buttonPocetnaUl = findViewById(R.id.buttonPocetnaUl);
        buttonLijekoviU = findViewById(R.id.buttonLijekoviU);
        buttonKupovinaUl = findViewById(R.id.buttonKupovinaUl);

        buttonPocetnaUl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPocetnaUl();
            }
        });

        buttonLijekoviU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLijekoviUi();
            }
        });

        buttonKupovinaUl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openKupovinaUi();
            }
        });
    }
    public void openPocetnaUl() {
        Intent intent1 = new Intent(this, MainActivity.class);
        startActivity(intent1);
    }
    public void openLijekoviUi() {
        Intent intent2 = new Intent(this, Lijek.class);
        startActivity(intent2);
    }
    public void openKupovinaUi() {
        Intent intent3 = new Intent(this, Podsjetnik_kupovina.class);
        startActivity(intent3);
    }
}
