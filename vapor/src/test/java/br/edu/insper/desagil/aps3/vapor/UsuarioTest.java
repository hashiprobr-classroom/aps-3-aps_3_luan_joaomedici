package br.edu.insper.desagil.aps3.vapor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UsuarioTest {

    @Test
    void Controi() {
        Usuario jorge = new Usuario("Jorginho", "Jorge");
        assertEquals("Jorge", jorge.getNome());
        assertEquals("Jorginho", jorge.toString());
    }

    @Test
    void mudaNome() {
        Usuario jorge = new Usuario("Jorginho", "Jorde");
        jorge.setNome("Jorge");
        assertEquals("Jorge", jorge.getNome());
    }
}

