package br.edu.insper.desagil.aps3.vapor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComunidadeTest {
    private List<Usuario> usuarios;
    private List<String> apelidos;

    @BeforeEach
    public void setUp(){
        Usuario rogerio = new Usuario("Rogerin","Rogerio");
        Usuario adamastor = new Usuario("Marreco","Adamastor");
        usuarios = new ArrayList<>();
        apelidos = new ArrayList<>();
        usuarios.add(rogerio);
        usuarios.add(adamastor);
        apelidos.add(rogerio.getApelido());
        apelidos.add(adamastor.getApelido());
    }
    @Test
    void controi(){

        Comunidade cs2 = new Comunidade(usuarios);
        assertEquals(apelidos,cs2.apelidosMembros());
    }

    @Test
    void adicionaUmMembro(){
        Usuario luis = new Usuario("Fifito","luis");
        Comunidade cs2 = new Comunidade(usuarios);
        cs2.adicionaMembro(luis);
        apelidos.add(luis.getApelido());
        assertEquals(apelidos,cs2.apelidosMembros());
    }

    @Test
    void adicionaDoisMembros(){
        Usuario luis = new Usuario("Fifito","luis");
        Usuario medici = new Usuario("Medici","Joao Pedro");
        Comunidade cs2 = new Comunidade(usuarios);
        cs2.adicionaMembro(luis);
        cs2.adicionaMembro(medici);
        apelidos.add(luis.getApelido());
        apelidos.add(medici.getApelido());
        assertEquals(apelidos,cs2.apelidosMembros());
    }
}
