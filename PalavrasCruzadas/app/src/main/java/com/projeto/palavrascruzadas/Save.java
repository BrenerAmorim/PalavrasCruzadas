package com.projeto.palavrascruzadas;

public class Save {

    int codigo;
    String nome;
    int nivel;

    public Save(){

    }

    public Save(String _nome, int _nivel){
        this.nome = _nome;
        this.nivel = _nivel;
    }

    public Save(int _codigo , String _nome, int _nivel){
        this.codigo = _codigo;
        this.nome = _nome;
        this.nivel = _nivel;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}
