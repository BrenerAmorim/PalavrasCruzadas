package com.projeto.palavrascruzadas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Novo_Jogo extends AppCompatActivity {

    private Button botao_cancelar, botao_confirmar;
    private EditText Nome_Novo_Jogo;
    public static String name;

    Banco_De_Dados db = new Banco_De_Dados(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novo_jogo);


        botao_cancelar = (Button) findViewById(R.id.botao_cancelar);
        botao_confirmar = (Button) findViewById(R.id.botao_confirmar);
        Nome_Novo_Jogo = (EditText) findViewById(R.id.nome_novo_jogo);


        botao_cancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Novo_Jogo.this , MainActivity.class);
                startActivity(intent);
            }
        });

        botao_confirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String nome = Nome_Novo_Jogo.getText().toString();
                if(nome.isEmpty()){
                    Nome_Novo_Jogo.setError("este campo é obrigatório");
                }else{
                    name = nome;
                    db.addNomeJogo(new Save(nome, 1));

                    Intent intent = new Intent(Novo_Jogo.this , nivel1.class);
                    startActivity(intent);

                   // Toast.makeText(Novo_Jogo.this , "salvo com sucesso", Toast.LENGTH_LONG).show();


                }
            }
        });

    }
}
