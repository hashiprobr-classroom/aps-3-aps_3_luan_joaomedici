package br.edu.insper.desagil.aps3.vapor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ComunidadeDeJogoTest {
    private Jogo lol;
    private Usuario luan;
    private Usuario luis;
    private List<Usuario> usuarios;

    @BeforeEach
    void setUp(){
        lol=new Jogo(155,"LoL");
        luan=new Usuario("luanzinho","luan");
        luis=new Usuario("luisinho","luis");
        usuarios=new ArrayList<>();
    }
    @Test
    void adicionaDoisInvalidos(){
        ComunidadeDeJogo lolComunity=new ComunidadeDeJogo(usuarios,lol);
        lolComunity.adicionaMembro(luan);
        lolComunity.adicionaMembro(luis);
        assertEquals(new ArrayList<>(),lolComunity.apelidosMembros());
        for (String apelido:lolComunity.apelidosMembros()){
            assertEquals("",apelido);
        }

    }
    @Test
    void adicionaUmInvalidoUmValido(){
        ComunidadeDeJogo lolComunity=new ComunidadeDeJogo(usuarios,lol);
        lol.avalia(luan.getApelido(),5);
        lolComunity.adicionaMembro(luan);
        lolComunity.adicionaMembro(luis);
        List<String> apelidos=new ArrayList<>();
        apelidos.add(luan.getApelido());
        assertEquals(apelidos,lolComunity.apelidosMembros());

    }
    @Test
    void adicionaDoisValidos(){
        ComunidadeDeJogo lolComunity=new ComunidadeDeJogo(usuarios,lol);
        lol.avalia(luan.getApelido(),5);
        lol.avalia(luis.getApelido(),5);
        lolComunity.adicionaMembro(luan);
        lolComunity.adicionaMembro(luis);
        List<String> apelidos=new ArrayList<>();
        apelidos.add(luan.getApelido());
        apelidos.add(luis.getApelido());
        assertEquals(apelidos,lolComunity.apelidosMembros());
    }
}
