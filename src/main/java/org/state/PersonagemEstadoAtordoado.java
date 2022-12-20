package org.state;

public class PersonagemEstadoAtordoado extends PersonagemEstado{
    private PersonagemEstadoAtordoado() {};
    private static PersonagemEstadoAtordoado instance = new PersonagemEstadoAtordoado();
    public static PersonagemEstadoAtordoado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Atordoado";
    }

    public boolean envenenar(Personagem personagem) {
        personagem.setEstado(PersonagemEstadoEnvenenado.getInstance());
        return true;
    }

    public boolean sangrar(Personagem personagem) {
        personagem.setEstado(PersonagemEstadoSangrando.getInstance());
        return true;
    }

    public boolean normalizar(Personagem personagem) {
        personagem.setEstado(PersonagemEstadoNormal.getInstance());
        return true;
    }
}
