package com.projeto.palavrascruzadas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

public class nivel1 extends AppCompatActivity {
    Banco_De_Dados db = new Banco_De_Dados(this);

    Button proximo_nivel, sair;
    private EditText letra1, letra2, letra3, letra4, letra5, letra6, letra7, letra8, letra9,
                     letra10, letra11, letra12, letra13, letra14, letra15, letra16, letra17,
                     letra18, letra19, letra20, letra21, letra22, letra23;

    private int bola =0 ,bico =0 ,bala =0 ,boca =0 ,buli =0 ,cubo =0 ,botao =0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nivel1);


        proximo_nivel = (Button) findViewById(R.id.proximo_nivel);
        sair = (Button) findViewById(R.id.sair);
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
        letra13 = (EditText) findViewById(R.id.letra13);
        letra14 = (EditText) findViewById(R.id.letra14);
        letra15 = (EditText) findViewById(R.id.letra15);
        letra16 = (EditText) findViewById(R.id.letra16);
        letra17 = (EditText) findViewById(R.id.letra17);
        letra18 = (EditText) findViewById(R.id.letra18);
        letra19 = (EditText) findViewById(R.id.letra19);
        letra20 = (EditText) findViewById(R.id.letra20);
        letra21 = (EditText) findViewById(R.id.letra21);
        letra22 = (EditText) findViewById(R.id.letra22);
        letra23 = (EditText) findViewById(R.id.letra23);

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
        letra13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valida();
            }
        });
        letra14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valida();
            }
        });
        letra15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valida();
            }
        });
        letra16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valida();
            }
        });
        letra17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valida();
            }
        });
        letra18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valida();
            }
        });
        letra19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valida();
            }
        });
        letra20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valida();
            }
        });
        letra21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valida();
            }
        });
        letra22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valida();
            }
        });
        letra23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valida();
            }
        });



        proximo_nivel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(bola == 0 || bala == 0 || bico == 0 || boca == 0 || buli == 0 || cubo == 0 || botao == 0){
                    Toast.makeText(nivel1.this , "complete todas as palavras", Toast.LENGTH_LONG).show();
                }else{
                String name = Novo_Jogo.name;
                List<Save> saves = db.listaTodosSaves();

                for (Save s : saves){
                    if(name.equals(s.getNome())) {
                        Save save = new Save();
                        save.setCodigo(s.getCodigo());
                        save.setNome(s.getNome());
                        save.setNivel(2);
                        db.atualizaSave(save);

                        Intent intent = new Intent(nivel1.this, nivel2.class);
                        startActivity(intent);
                    }
                    }
                }

            }
        });

        sair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(nivel1.this , MainActivity.class);
                startActivity(intent);
            }
        });

    }


    public void valida(){

        if(letra1.getText().toString().equals("b") && letra2.getText().toString().equals("o") && letra3.getText().toString().equals("l") && letra4.getText().toString().equals("a")){
                letra1.setEnabled(false);
                letra2.setEnabled(false);
                letra3.setEnabled(false);
                letra4.setEnabled(false);
                bola = 1;

        }

        if(letra5.getText().toString().equals("b") && letra4.getText().toString().equals("a") && letra6.getText().toString().equals("l") && letra7.getText().toString().equals("a")){
            letra4.setEnabled(false);
            letra5.setEnabled(false);
            letra6.setEnabled(false);
            letra7.setEnabled(false);
            bala = 1;

        }

        if(letra5.getText().toString().equals("b") && letra8.getText().toString().equals("i") && letra9.getText().toString().equals("c") && letra10.getText().toString().equals("o")){
            letra5.setEnabled(false);
            letra8.setEnabled(false);
            letra9.setEnabled(false);
            letra10.setEnabled(false); bico = 1;

        }

        if(letra11.getText().toString().equals("b") && letra10.getText().toString().equals("o") && letra12.getText().toString().equals("c") && letra13.getText().toString().equals("a")){
            letra10.setEnabled(false);
            letra11.setEnabled(false);
            letra12.setEnabled(false);
            letra13.setEnabled(false);
            boca = 1;

        }

        if(letra11.getText().toString().equals("b") && letra14.getText().toString().equals("u") && letra15.getText().toString().equals("l") && letra16.getText().toString().equals("i")){
            letra11.setEnabled(false);
            letra14.setEnabled(false);
            letra15.setEnabled(false);
            letra16.setEnabled(false);
            buli = 1;

        }

        if(letra12.getText().toString().equals("c") && letra17.getText().toString().equals("u") && letra18.getText().toString().equals("b") && letra19.getText().toString().equals("o")){
            letra12.setEnabled(false);
            letra17.setEnabled(false);
            letra18.setEnabled(false);
            letra19.setEnabled(false);
            cubo = 1;

        }

        if(letra18.getText().toString().equals("b") && letra20.getText().toString().equals("o") && letra21.getText().toString().equals("t") && letra22.getText().toString().equals("a")&& letra23.getText().toString().equals("o")){
            letra18.setEnabled(false);
            letra20.setEnabled(false);
            letra21.setEnabled(false);
            letra22.setEnabled(false);
            letra23.setEnabled(false);
            botao = 1;

        }

    }

}
