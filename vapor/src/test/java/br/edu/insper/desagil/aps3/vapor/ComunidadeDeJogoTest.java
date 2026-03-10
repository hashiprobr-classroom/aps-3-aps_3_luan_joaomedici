package br.edu.insper.desagil.aps3.vapor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ComunidadeDeJogoTest {
    private Jogo lol;
    private Usuario luan;
    private Usuario luis;

    @BeforeEach
    void setUp(){
        lol=new Jogo(155,"LoL");
        luan=new Usuario("luanzinho","luan");
        luis=new Usuario("luisinho","luis");
    }
    @Test
    void adicionaDoisInvalidos(){

    }
}
