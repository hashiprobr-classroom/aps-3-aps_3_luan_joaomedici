package br.edu.insper.desagil.aps3.vapor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
        assertTrue(cs.avaliado(luan.getApelido()));
        assertFalse(cs.avaliado("luís"));
        assertEquals(3,cs.media());
    }
    @Test
    void avaliaDuasVezes(){
        Jogo roblox=new Jogo(580,"Roblox");
        Usuario luan=new Usuario("luanzinho","luan");
        Usuario luis=new Usuario("luisinho","luis");
        roblox.avalia(luan.getApelido(),3);
        roblox.avalia(luis.getApelido(),4);
        assertTrue(roblox.avaliado(luan.getApelido()));
        assertTrue(roblox.avaliado(luis.getApelido()));
        assertEquals(3.5,roblox.media());
    }
    @Test
    void avaliaTresVezes(){
        Jogo bloons=new Jogo(679,"Bloons");
        Usuario luan=new Usuario("luanzinho","luan");
        Usuario luis=new Usuario("luisinho","luis");
        bloons.avalia(luan.getApelido(),3);
        bloons.avalia(luis.getApelido(),4);
        bloons.avalia(luan.getApelido(),5);
        assertEquals(4.5,bloons.media());
    }
}
