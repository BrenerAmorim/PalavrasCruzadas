package com.projeto.palavrascruzadas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

public class nivel2 extends AppCompatActivity {

    private EditText letra1, letra2, letra3, letra4, letra5, letra6, letra7, letra8, letra9,
            letra10, letra11, letra12;

    private int faca =0 ,foca =0 ,cafe =0 ,fuba =0;

    Button proximo_nivel2, sair2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nivel2);

        letra1 = (EditText) findViewById(R.id.letra1);
        letra2 = (EditText) findViewById(R.id.letra2);
        letra3 = (EditText) findViewById(R.id.letra3);
        letra4 = (EditText) findViewById(R.id.letra4);
        letra5 = (EditText) findViewById(R.id.letra5);
        letra6 = (EditText) findViewById(R.id.letra6);
        letra7 = (EditText) findViewById(R.id.letra7);
        letra8 = (EditText) findViewById(R.id.letra8);
        letra9 = (EditText) findViewById(R.id.letra9);
        letra10 = (EditText) findViewById(R.id.letra10);
        letra11 = (EditText) findViewById(R.id.letra11);
        letra12 = (EditText) findViewById(R.id.letra12);

        letra1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valida();
            }
        });
        letra2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valida();
            }
        });
        letra3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valida();
            }
        });
        letra4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valida();
            }
        });
        letra5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valida();
            }
        });
        letra6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valida();
            }
        });
        letra7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valida();
            }
        });
        letra8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valida();
            }
        });
        letra9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valida();
            }
        });
        letra10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valida();
            }
        });
        letra11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valida();
            }
        });
        letra12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valida();
            }
        });


        proximo_nivel2 = (Button) findViewById(R.id.proximo_nivel2);
        sair2 = (Button) findViewById(R.id.sair2);

        proximo_nivel2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(faca == 0 || foca == 0 || cafe == 0 || fuba == 0){
                    Toast.makeText(nivel2.this , "complete todas as palavras", Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(nivel2.this , "Parabéns, voçe concluiu todos os níveis", Toast.LENGTH_LONG).show();
                        }
                    }
        });

        sair2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(nivel2.this , MainActivity.class);
                startActivity(intent);
            }
        });

    }

    public void valida() {

        if (letra1.getText().toString().equals("f") && letra2.getText().toString().equals("a") && letra3.getText().toString().equals("c") && letra4.getText().toString().equals("a")) {
            letra1.setEnabled(false);
            letra2.setEnabled(false);
            letra3.setEnabled(false);
            letra4.setEnabled(false);
            faca = 1;

        }

        if (letra1.getText().toString().equals("f") && letra5.getText().toString().equals("o") && letra6.getText().toString().equals("c") && letra7.getText().toString().equals("a")) {
            letra1.setEnabled(false);
            letra5.setEnabled(false);
            letra6.setEnabled(false);
            letra7.setEnabled(false);
            foca = 1;

        }

        if (letra4.getText().toString().equals("a") && letra8.getText().toString().equals("c") && letra9.getText().toString().equals("f") && letra10.getText().toString().equals("e")) {
            letra4.setEnabled(false);
            letra8.setEnabled(false);
            letra9.setEnabled(false);
            letra10.setEnabled(false);
            cafe = 1;

        }

        if (letra9.getText().toString().equals("f") && letra11.getText().toString().equals("u") && letra12.getText().toString().equals("a") ) {
            letra9.setEnabled(false);
            letra11.setEnabled(false);
            letra12.setEnabled(false);
            fuba = 1;

        }
    }
}
