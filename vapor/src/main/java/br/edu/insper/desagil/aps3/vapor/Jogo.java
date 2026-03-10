package br.edu.insper.desagil.aps3.vapor;

import java.util.HashMap;
import java.util.Map;

public class Jogo {
    private int id;
    private String nome;
    private Map<Usuario,Integer> avaliacoes=new HashMap<>();

    public Jogo(int id,String nome){
        this.id=id;
        this.nome=nome;
    }
    public int getId(){
        return id;
    }
    public String getNome(){
        return nome;
    }
    public void avalia(Usuario apelido,int avaliacao){
        avaliacoes.put(apelido,avaliacao);
    }
    public boolean avaliado(Usuario apelido){
        return avaliacoes.containsKey(apelido);
    }
    public double media(){
        int n=avaliacoes.size();
        double valorMedio=0;
        if (n>0){
            for (int avaliacao:avaliacoes.values()) {
                valorMedio += avaliacao;
            }
            return valorMedio;
        }
        else {
            return 0;
        }

    }
}
