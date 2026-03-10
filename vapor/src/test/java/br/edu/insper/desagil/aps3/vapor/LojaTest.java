package br.edu.insper.desagil.aps3.vapor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LojaTest {

    private List<Jogo> jogos;
    private Jogo cs2 = new Jogo(730,"Cs2");
    private Jogo lol = new Jogo(690,"Lol");
    private Jogo roblox = new Jogo(700,"Roblox");
    @BeforeEach
    public void setUp() {
        jogos = new ArrayList<>();
        jogos.add(lol);
        jogos.add(roblox);
        jogos.add(cs2);
    }

    @Test
    void constroi(){
        Usuario medici = new Usuario("Medici","Joao Pedro");
        Loja Pichau = new Loja(medici,jogos);
        assertEquals(medici,Pichau.getDono());
        assertEquals(0,Pichau.numeroAvaliados(medici));
    }

    @Test
    void umUsuarioAvaliaUmJogo(){
        Usuario medici = new Usuario("Medici","Joao Pedro");
        Loja Pichau = new Loja(medici,jogos);
        cs2.avalia(medici.getApelido(),10);
        assertEquals(1,Pichau.numeroAvaliados(medici));
    }

    @Test
    void umUsuarioAvaliaDoisJogos(){
        Usuario medici = new Usuario("Medici","Joao Pedro");
        Loja Pichau = new Loja(medici,jogos);
        roblox.avalia(medici.getApelido(),1);
        cs2.avalia(medici.getApelido(),10);
        assertEquals(2,Pichau.numeroAvaliados(medici));
    }

    @Test
    void DoisUsuarioAvaliamUmJogo(){
        Usuario medici = new Usuario("Medici","Joao Pedro");
        Usuario luis = new Usuario("Fifito","Luis Carreira Rosa");
        Loja Pichau = new Loja(medici,jogos);
        cs2.avalia(medici.getApelido(),10);
        cs2.avalia(luis.getApelido(),10);
        assertEquals(1,Pichau.numeroAvaliados(medici));
        assertEquals(1,Pichau.numeroAvaliados(luis));
    }

    @Test
    void doisUsuarioAvaliamDoisJogos(){
        Usuario medici = new Usuario("Medici","Joao Pedro");
        Usuario luis = new Usuario("Fifito","Luis Carreira");
        Loja Pichau = new Loja(medici,jogos);
        lol.avalia(medici.getApelido(),10);
        roblox.avalia(luis.getApelido(),10);
        assertEquals(1,Pichau.numeroAvaliados(medici));
        assertEquals(1,Pichau.numeroAvaliados(luis));
    }

}
