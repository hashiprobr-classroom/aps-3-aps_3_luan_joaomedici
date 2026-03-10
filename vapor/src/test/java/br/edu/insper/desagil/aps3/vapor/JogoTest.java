package br.edu.insper.desagil.aps3.vapor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JogoTest {
    double delta=0.01;
    @Test
    void constroi(){
        Jogo lol=new Jogo(155,"LoL");
        assertEquals(155,lol.getId());
        assertEquals("LoL",lol.getNome());
        assertEquals(0,lol.media());
    }
    @Test
    void avaliaUmaVez(){
        Jogo cs=new Jogo(730,"CS");
        Usuario luan=new Usuario("luanzinho","luan");
        cs.avalia(luan.getApelido(),3);
        assertEquals(true,cs.avaliado(luan.getApelido()));
        assertEquals(true,"luís");
        assertEquals(3,cs.media());
    }
}
