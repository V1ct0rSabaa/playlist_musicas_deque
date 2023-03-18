package com.cesupa.estrutura_de_dados.atividade_deque;

public class Musica {
    private String nome;
    private String album;
    private String autor;
    private double duracaoMinutos;

    // construtor parametrizado
    public Musica(String nome, String album, String autor, double duracaoMinutos) {
        this.nome = nome;
        this.album = album;
        this.autor = autor;
        this.duracaoMinutos = duracaoMinutos;
    }

    // getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(double duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }
    
    @Override
    public String toString() {
       final String texto = this.nome + " - " + this.album + " - " + this.autor;
       return texto;
    }

}
