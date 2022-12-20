package org.state;

public abstract class PersonagemEstado {
    public abstract String getEstado();

    public boolean normalizar(Personagem personagem) {
        return false;
    }

    public boolean envenenar(Personagem personagem) {
        return false;
    }

    public boolean sangrar(Personagem personagem) {
        return false;
    }

    public boolean atordoar(Personagem personagem) {
        return false;
    }
}