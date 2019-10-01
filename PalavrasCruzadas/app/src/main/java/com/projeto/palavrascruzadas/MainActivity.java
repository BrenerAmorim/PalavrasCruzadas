package com.projeto.palavrascruzadas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button botao_novo_jogo , botao_carregar_nivel, botao_carregar_jogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botao_novo_jogo = (Button) findViewById(R.id.Novo_Jogo);
        botao_carregar_nivel = (Button) findViewById(R.id.Carregar_Jogo);
        botao_carregar_jogo = (Button) findViewById(R.id.Carregar_Jogo);



        botao_novo_jogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , Novo_Jogo.class);
                startActivity(intent);
            }
        });

        botao_carregar_nivel = (Button) findViewById(R.id.Carregar_Jogo);

        botao_carregar_nivel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , Carregar_Jogo.class);
                startActivity(intent);

            }
        });


// testes ###############################################

//Insert
     //   Banco_De_Dados db = new Banco_De_Dados(this);

     //   db.addNomeJogo(new Save("TESTE 1",2));
     //   db.addNomeJogo(new Save("TESTE 2",2));
     //   db.addNomeJogo(new Save("TESTE 3",3));
     //   db.addNomeJogo(new Save("TESTE 4",4));
     //   db.addNomeJogo(new Save("TESTE 5",5));

      //  Toast.makeText(MainActivity.this , "salvo com sucesso", Toast.LENGTH_LONG).show();

        //delete
       // Save save = new Save();
        //save.setCodigo(1);
        //db.apagarJogo(save);
        //  Toast.makeText(MainActivity.this , "Excluido com sucesso", Toast.LENGTH_LONG).show();


        //select
       // Save save = db.selecionarSave(1);
        //Log.d("save selecionado", "codigo: " + save.getCodigo() + " nome: " + save.getNome() + " nivel: " + save.getNivel());

        //update
        //Save save = new Save();
       // save.setCodigo(1);
       // save.setNome("jgjgjgjgj");
       // save.setNivel(21);

       // db.atualizaSave(save);

       // Toast.makeText(MainActivity.this , "atualizado com sucesso", Toast.LENGTH_LONG).show();

    }


}
