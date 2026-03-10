package br.edu.insper.desagil.aps3.vapor;

import java.util.HashMap;
import java.util.Map;

public class Jogo {
    private int id;
    private String nome;
    private Map<String,Integer> avaliacoes;

    public Jogo(int id,String nome){
        this.id=id;
        this.nome=nome;
        this.avaliacoes=new HashMap<>();
    }
    public int getId(){
        return id;
    }
    public String getNome(){
        return nome;
    }
    public void avalia(String apelido,int avaliacao){
        avaliacoes.put(apelido,avaliacao);
    }
    public boolean avaliado(String apelido){
        return avaliacoes.containsKey(apelido);
    }
    public double media(){
        int n=avaliacoes.size();
        double valorMedio=0;
        if (n>0){
            for (int avaliacao:avaliacoes.values()) {
                valorMedio += avaliacao;
            }
            return valorMedio/n;
        }
        else {
            return 0;
        }

    }
}
