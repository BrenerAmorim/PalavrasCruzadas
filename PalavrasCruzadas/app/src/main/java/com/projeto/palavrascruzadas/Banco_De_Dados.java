package com.projeto.palavrascruzadas;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class Banco_De_Dados extends SQLiteOpenHelper {

    private static final int VERSAO = 1;
    private static final String BANCO_SAVE = "bd_save";

    private static final String TABELA_SAVE = "tb_save";
    private static final String COLUNA_CODIGO = "codigo";
    public static final String COLUNA_NOME = "nome";
    public static final String COLUNA_NIVEL = "nivel";

    public Banco_De_Dados( Context context) {
        super(context, BANCO_SAVE, null, VERSAO);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String QUERY_COLUNA = "CREATE TABLE " + TABELA_SAVE + "("
            + COLUNA_CODIGO + " INTEGER PRIMARY KEY, " + COLUNA_NOME + " TEXT, " + COLUNA_NIVEL + " INTEGER) ";

        db.execSQL(QUERY_COLUNA);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

    }



    void addNomeJogo(Save save){

        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();

        values.put(COLUNA_NOME , save.getNome());
        values.put(COLUNA_NIVEL , save.getNivel());

        db.insert(TABELA_SAVE , null , values);
        db.close();
    }

    void apagarJogo(Save save){
        SQLiteDatabase db = this.getWritableDatabase();

        db.delete(TABELA_SAVE , COLUNA_CODIGO + " = ?", new String[] { String.valueOf(save.getCodigo())});

        db.close();

    }

    Save selecionarSave(int codigo){
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(TABELA_SAVE, new String[] {COLUNA_CODIGO, COLUNA_NOME, COLUNA_NIVEL},
                COLUNA_CODIGO + " = ?", new String[] {String.valueOf(codigo)},
                null, null, null, null);
        if(cursor != null){
            cursor.moveToFirst();
        }

        Save save = new Save(Integer.parseInt(cursor.getString(0)),
                cursor.getString(1),
                Integer.parseInt(cursor.getString(2)));

        return save;
    }

    void atualizaSave(Save save){

        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(COLUNA_NOME , save.getNome());
        values.put(COLUNA_NIVEL , save.getNivel());

        db.update(TABELA_SAVE, values, COLUNA_CODIGO + " = ?", new String[] { String.valueOf(save.getCodigo()) });

    }

    public List<Save> listaTodosSaves(){
        List<Save> listaSaves = new ArrayList<Save>();

        String query = "SELECT * FROM " + TABELA_SAVE;

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(query, null);

        if(cursor.moveToFirst()){
            do {
                Save save = new Save();
                save.setCodigo(Integer.parseInt(cursor.getString(0)));
                save.setNome(cursor.getString(1));
                save.setNivel(Integer.parseInt(cursor.getString(2)));

                listaSaves.add(save);
            } while (cursor.moveToNext());
        }

        return listaSaves;
    }


}
