package org.state;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonagemTest {
    Personagem personagem;

    @BeforeEach
    public void setUp() {
        personagem = new Personagem();
    }

    // Personagem normal

    @Test
    public void naoDeveNormalizarPersonagemNormal() {
        personagem.setEstado(PersonagemEstadoNormalizar.getInstance());
        assertFalse(personagem.normalizar());
    }

    @Test
    public void deveAtordoarPersonagemNormal() {
        personagem.setEstado(PersonagemEstadoNormalizar.getInstance());
        assertTrue(personagem.atordoar());
        assertEquals(PersonagemEstadoAtordoado.getInstance(), personagem.getEstado());
    }

    @Test
    public void deveEnvenenarPersonagemNormal() {
        personagem.setEstado(PersonagemEstadoNormalizar.getInstance());
        assertTrue(personagem.envenenar());
        assertEquals(PersonagemEstadoEnvenenado.getInstance(), personagem.getEstado());
    }

    @Test
    public void deveSangrarPersonagemNormal() {
        personagem.setEstado(PersonagemEstadoNormalizar.getInstance());
        assertTrue(personagem.sangrar());
        assertEquals(PersonagemEstadoSangrando.getInstance(), personagem.getEstado());
    }

    // PersonagemAtordoado

    @Test
    public void naoDeveAtordoarPersonagemAtordoado() {
        personagem.setEstado(PersonagemEstadoAtordoado.getInstance());
        assertFalse(personagem.atordoar());
    }

    @Test
    public void deveNormalizarPersonagemAtordoado() {
        personagem.setEstado(PersonagemEstadoAtordoado.getInstance());
        assertTrue(personagem.normalizar());
        assertEquals(PersonagemEstadoNormalizar.getInstance(), personagem.getEstado());
    }

    @Test
    public void deveEnvenenarPersonagemAtordoado() {
        personagem.setEstado(PersonagemEstadoAtordoado.getInstance());
        assertTrue(personagem.envenenar());
        assertEquals(PersonagemEstadoEnvenenado.getInstance(), personagem.getEstado());
    }

    @Test
    public void deveSangrarPersonagemAtordoado() {
        personagem.setEstado(PersonagemEstadoAtordoado.getInstance());
        assertTrue(personagem.sangrar());
        assertEquals(PersonagemEstadoSangrando.getInstance(), personagem.getEstado());
    }

    // Personagem Sangrando

    @Test
    public void naoSangrarNormalizarPersonagemSangrando() {
        personagem.setEstado(PersonagemEstadoSangrando.getInstance());
        assertFalse(personagem.sangrar());
    }

    @Test
    public void deveAtordoarPersonagemSangrando() {
        personagem.setEstado(PersonagemEstadoSangrando.getInstance());
        assertTrue(personagem.atordoar());
        assertEquals(PersonagemEstadoAtordoado.getInstance(), personagem.getEstado());
    }

    @Test
    public void deveEnvenenarPersonagemSangrando() {
        personagem.setEstado(PersonagemEstadoSangrando.getInstance());
        assertTrue(personagem.envenenar());
        assertEquals(PersonagemEstadoEnvenenado.getInstance(), personagem.getEstado());
    }

    @Test
    public void deveNormalizarPersonagemSangrando() {
        personagem.setEstado(PersonagemEstadoSangrando.getInstance());
        assertTrue(personagem.normalizar());
        assertEquals(PersonagemEstadoNormalizar.getInstance(), personagem.getEstado());
    }

    // Personagem Envenenado
    @Test
    public void naoDeveEnvenanarPersonagemEnvenenado() {
        personagem.setEstado(PersonagemEstadoEnvenenado.getInstance());
        assertFalse(personagem.envenenar());
    }

    @Test
    public void deveAtordoarPersonagemEnvenenado() {
        personagem.setEstado(PersonagemEstadoEnvenenado.getInstance());
        assertTrue(personagem.atordoar());
        assertEquals(PersonagemEstadoAtordoado.getInstance(), personagem.getEstado());
    }

    @Test
    public void deveNormalizarPersonagemEnvenenado() {
        personagem.setEstado(PersonagemEstadoEnvenenado.getInstance());
        assertTrue(personagem.normalizar());
        assertEquals(PersonagemEstadoNormalizar.getInstance(), personagem.getEstado());
    }

    @Test
    public void deveSangrarPersonagemEnvenenado() {
        personagem.setEstado(PersonagemEstadoEnvenenado.getInstance());
        assertTrue(personagem.sangrar());
        assertEquals(PersonagemEstadoSangrando.getInstance(), personagem.getEstado());
    }

}