package com.projeto.palavrascruzadas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Carregar_Jogo extends AppCompatActivity {

    Banco_De_Dados db = new Banco_De_Dados(this);

    private Button botao_voltar, botao_carregar, botao_excluir;
    TextView nome, nivel;
    int codigo_save;
        ListView listViewSaves;
    ArrayAdapter<String> adapter;
    ArrayList<String> arrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carregar_jogo);

        listViewSaves = (ListView)findViewById(R.id.ListViewSaves);
        nome = (TextView)findViewById(R.id.textViewnome);
        nivel = (TextView)findViewById(R.id.textViewnivel);
        botao_voltar = (Button) findViewById(R.id.voltar);
        botao_excluir = (Button) findViewById(R.id.excluir);
        botao_carregar = (Button) findViewById(R.id.carregar);


        listarSaves();


        listViewSaves.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String conteudo = (String) listViewSaves.getItemAtPosition(i);

                 //Toast.makeText(Carregar_Jogo.this, "selecionado: " + conteudo, Toast.LENGTH_LONG).show();

                String codigo = conteudo.substring(0, conteudo.indexOf("-"));
                Save save = db.selecionarSave(Integer.parseInt(codigo));


                nivel.setText(Integer.toString(save.getNivel()));
                nome.setText(save.getNome());
                codigo_save = save.getCodigo();

            }
        });


        botao_excluir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(nome.getText().toString().isEmpty()){
                    nome.setError("este campo é obrigatório");
                }else{
                    Save save = new Save();
                     save.setCodigo(codigo_save);
                     db.apagarJogo(save);
                     listarSaves();
            }
        }});


        botao_carregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(nome.getText().toString().isEmpty()){
                    nome.setError("este campo é obrigatório");
                }else{
                    Save save = new Save();
                    save.setNivel(save.getNivel());
                    Novo_Jogo.name = nome.getText().toString();


                    if(nivel.getText().toString().equals("1")){
                        Intent intent = new Intent(Carregar_Jogo.this , nivel1.class);
                        startActivity(intent);

                    }else{

                    Intent intent = new Intent(Carregar_Jogo.this , nivel2.class);
                    startActivity(intent);
                    }
                }
            }});




        botao_voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Carregar_Jogo.this , MainActivity.class);
                startActivity(intent);
            }
        });
    }

    public void listarSaves(){

        List<Save> saves = db.listaTodosSaves();

        arrayList = new ArrayList<String>();

        adapter = new ArrayAdapter<String>(Carregar_Jogo.this, android.R.layout.simple_list_item_1, arrayList);

        listViewSaves.setAdapter(adapter);

        for (Save s : saves){
            //Log.d("Lista", "\nID " + s.getCodigo() + " Nome: " + s.getNome());

            arrayList.add(s.getCodigo() + "-" + s.getNome());
            adapter.notifyDataSetChanged();
        }
    }
}
