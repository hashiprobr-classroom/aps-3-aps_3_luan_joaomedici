package br.edu.insper.desagil.aps3.vapor;

import java.util.List;

public class Loja {
    private String dono;
    private List<Jogo> jogos;
    public Loja(String dono, List<Jogo> jogos){
        this.dono = dono;
        this.jogos = jogos;
    }
    public int numeroAvaliados(Usuario usuario){
        int contador = 0;
        for(Jogo jogo : jogos){
            if (jogo.avaliado(usuario.getApelido())){
                contador +=1;
            }
        }
        return contador;
    }
}
