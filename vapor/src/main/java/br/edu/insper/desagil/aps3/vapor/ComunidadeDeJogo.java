package br.edu.insper.desagil.aps3.vapor;

import java.util.List;

public class ComunidadeDeJogo extends Comunidade{
    private Jogo jogo;
    public ComunidadeDeJogo(List<Usuario> usuarios, Jogo Jogo){
    super(usuarios);
    this.jogo = Jogo;
    }

    @Override
    public void adicionaMembro(Usuario usuario){
        if (jogo.avaliado(usuario.getApelido())){
            super.adicionaMembro(usuario);
        }
    }
}
