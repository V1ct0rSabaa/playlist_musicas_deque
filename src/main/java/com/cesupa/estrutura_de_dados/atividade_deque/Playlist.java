package com.cesupa.estrutura_de_dados.atividade_deque;

import java.util.ArrayDeque;
import java.util.Deque;

public final class Playlist {
    // por padrão o ArrayDeque tem 16 de capacidade, mas a classe tem outro construtor com parametro para definir quantos objetos cabe
    final int quantidadeMaximaMusicas = 10;
    private Deque<Musica> playlist = new ArrayDeque<>(quantidadeMaximaMusicas);

    public void atualizarInicio(Musica novaMusica){
        this.playlist.removeFirst();
        this.playlist.addFirst(novaMusica);
    }

    public void atualizarFim(Musica novaMusica){
        this.playlist.removeLast();
        this.playlist.addLast(novaMusica);
    }

    public String MostrarMusicas(){
        // StringBuilder é uma classe irmã da String que é mais eficiente para concatenar strings
        StringBuilder texto = new StringBuilder();
        int tamanho = playlist.size();
        texto.append("Lista Completa de " + tamanho + " Músicas da Playlist:\n");
        for(Musica musica: playlist){
            texto.append(musica.toString() + "\n");
        }
        return texto.toString();
    }

    public void adicionarInicio(Musica m1){
        this.playlist.addFirst(m1);
    }
    
    public void adicionarFim(Musica m1) {
        this.playlist.addLast(m1);
    }

    public Musica removerInicio() {
        return this.playlist.removeFirst();
    }
    public Musica removerFinal() {
        return this.playlist.removeLast();
    }

    // public void pegarComeço() {
    //     this.playlist.getFirst();
    // }

    // public void pegarFinal() {
    //     this.playlist.getLast(); 
    // }
}
