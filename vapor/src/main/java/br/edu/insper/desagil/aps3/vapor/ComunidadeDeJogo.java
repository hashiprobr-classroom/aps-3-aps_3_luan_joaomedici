package br.edu.insper.desagil.aps3.vapor;

public class ComunidadeDeJogo extends Comunidade{
private String Jogo;
public ComunidadeDeJogo(String Jogo){
    super(usuarios);
    this.Jogo = Jogo;
    }
public void AdicionaUsuario(Usuario usuario){
        usuarios.add(usuario);
        /** extender o codigo depois que finalizar jogo e lojaw **/
    }
}
