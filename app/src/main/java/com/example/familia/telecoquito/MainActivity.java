package com.example.familia.telecoquito;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton ivNoticias, ivCursos, ivGlosario, ivConceptos;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivNoticias = (ImageButton) findViewById(R.id.ivNoticias);
        ivCursos = (ImageButton) findViewById(R.id.ivCursos);
        ivGlosario = (ImageButton) findViewById(R.id.ivGlosario);
        ivConceptos = (ImageButton) findViewById(R.id.ivConceptos);

        ivNoticias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NoticiasActivity.class);
                startActivity(intent);
            }
        });

        ivCursos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CursosActivity.class);
                startActivity(intent);
            }
        });

        ivConceptos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ConceptosActivity.class);
                startActivity(intent);
            }
        });

        ivGlosario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, GlosarioActivity.class);
                startActivity(intent);
            }
        });
    }
}
