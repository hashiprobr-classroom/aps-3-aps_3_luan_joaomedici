package br.edu.insper.desagil.aps3.vapor;

import java.util.List;

public class ComunidadeDeJogo extends Comunidade{
    private String Jogo;
    public ComunidadeDeJogo(List<Usuario> usuarios, String Jogo){
    super(usuarios);
    this.Jogo = Jogo;
    }

    @Override
    public void adicionaMembro(Usuario usuario){
        /** extender o codigo depois que finalizar jogo e lojaw **/
    }
}
