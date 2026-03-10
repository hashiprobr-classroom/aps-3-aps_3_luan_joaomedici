package br.edu.insper.desagil.aps3.vapor;


import java.util.ArrayList;
import java.util.List;

public class Comunidade {
    private List<Usuario> usuarios;

    public Comunidade(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public void adicionaMembro(Usuario usuario){
        usuarios.add(usuario);
    }
    public List<String> apelidosMembros(){
        List<String> apelidos = new ArrayList<>();
        for (Usuario usuario : usuarios) {
            apelidos.add(usuario.getApelido());
        }
        return apelidos;
    }
}
