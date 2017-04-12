package com.example.familia.telecoquito;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

            public void onClick(View view) {
                Intent intent = new Intent(this, activity_glosario.class);
                Button mibutton=(Button)findViewById(R.id.imagen_glosario);
                mibutton.setOnClickListener(new View.OnClickListener() {
                startActivity(intent);
    }


}
