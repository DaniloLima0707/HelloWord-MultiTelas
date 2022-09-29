package com.example.hellowordmultitelas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView viewHello;
    Button btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        setTitle("Segunda Tela");

        viewHello = findViewById(R.id.viewHello);
        btnVoltar=findViewById(R.id.btnVoltar);

        viewHello.setText(String.format("Oi %s meu chapa!", getIntent().getStringExtra("nome")));
        //Ações dos botôes.
        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
}