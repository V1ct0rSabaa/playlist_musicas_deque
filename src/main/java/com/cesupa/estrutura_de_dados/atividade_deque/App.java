package com.cesupa.estrutura_de_dados.atividade_deque;

import java.util.Scanner;

public final class App {
    public static void main(String[] args) {
        Playlist objetoPlaylist = new Playlist();
        Scanner pegarInput = new Scanner(System.in);
        boolean continuar = true;
        StringBuilder textoMenu = new StringBuilder();
        textoMenu.append("1 - show all songs in playlist\n");
        textoMenu.append("2 - add song in the rear\n");
        textoMenu.append("3 - add song in the back\n ");
        textoMenu.append("4 - remove song in the rear\n");
        textoMenu.append("5 - remove song in the back\n");
        textoMenu.append("6 - change song in the rear\n");
        textoMenu.append("7 - change song in the back\n");
        textoMenu.append("8 - Exit playlist App\n");

        while(continuar){
            System.out.println(textoMenu.toString() + "Type your option: ");
            int escolha = pegarInput.nextInt();
            switch(escolha){
                case 1:
                    System.out.printf("%s", objetoPlaylist.MostrarMusicas());
                    break;
                case 2:
                    System.out.println("Type song's name: ");
                    final String nome1 = pegarInput.next();
                    System.out.println("Type album's name: ");
                    final String album1 = pegarInput.next();
                    System.out.println("Type author's name: ");
                    final String autor1 = pegarInput.next();
                    System.out.println("Type song duration(minutes): ");
                    final double duracaoMinutos1 = pegarInput.nextDouble();
                    Musica musicaNovaInicio = new Musica(nome1, album1, autor1, duracaoMinutos1);
                    objetoPlaylist.adicionarInicio(musicaNovaInicio);
                    System.out.println(musicaNovaInicio.getNome() + "was added to the rear of playlist.");
                    break;
                case 3:
                    System.out.println("Informe o nome da música: ");
                    String nome2 = pegarInput.next();
                    System.out.println("Informe o nome do album: ");
                    String album2 = pegarInput.next();
                    System.out.println("Informe o nome da autor da música: ");
                    String autor2 = pegarInput.next();
                    System.out.println("Informe a duração da música em minutos: ");
                    double duracaoMinutos2 = pegarInput.nextDouble();
                    Musica musicaNovaFim = new Musica(nome2, album2, autor2, duracaoMinutos2);
                
                    objetoPlaylist.adicionarFim(musicaNovaFim);
                    System.out.println(musicaNovaFim.getNome() + " was added in the back of playlist.");
                    break;
                case 4:
                    Musica musicaRetiradaInicio = objetoPlaylist.removerInicio();
                    System.out.println(musicaRetiradaInicio.getNome() + " was removed from playlist.");
                    break;
                case 5:
                    Musica musicaRetiradaFim = objetoPlaylist.removerFinal();
                    System.out.println(musicaRetiradaFim.getNome() + " was removed from playlist.");
                    break;
                case 6:
                    System.out.println("Informe o nome da música: ");
                    String nome3 = pegarInput.next();
                    System.out.println("Informe o nome do album: ");
                    String album3 = pegarInput.next();
                    System.out.println("Informe o nome da autor da música: ");
                    String autor3 = pegarInput.next();
                    System.out.println("Informe a duração da música em minutos: ");
                    double duracaoMinutos3 = pegarInput.nextDouble();
                    Musica musicaUpdateInicio = new Musica(nome3, album3, autor3, duracaoMinutos3);
                    objetoPlaylist.atualizarInicio(musicaUpdateInicio);
                    System.out.println("Playlist updated.");
                    break;
                case 7:
                    System.out.println("Informe o nome da música: ");
                    String nome4 = pegarInput.next();
                    System.out.println("Informe o nome do album: ");
                    String album4 = pegarInput.next();
                    System.out.println("Informe o nome da autor da música: ");
                    String autor4 = pegarInput.next();
                    System.out.println("Informe a duração da música em minutos: ");
                    double duracaoMinutos4 = pegarInput.nextDouble();
                    Musica musicaUpdateFim = new Musica(nome4, album4, autor4, duracaoMinutos4);
                    objetoPlaylist.atualizarFim(musicaUpdateFim);
                    System.out.println("Playlist updated.");
                    break;
                case 8:
                    System.out.println("Thanks for using our app :)");
                    pegarInput.close();
                default:
                    System.out.println("Error, type only numbers from 1 to 8");
                    break;
                }
        }
    }
}
