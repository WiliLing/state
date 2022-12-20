package org.state;

public class PersonagemEstadoEnvenenado extends PersonagemEstado {
    private PersonagemEstadoEnvenenado() {};
    private static PersonagemEstadoEnvenenado instance = new PersonagemEstadoEnvenenado();
    public static PersonagemEstadoEnvenenado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Envenenado";
    }

    public boolean normalizar(Personagem personagem) {
        personagem.setEstado(PersonagemEstadoNormal.getInstance());
        return true;
    }

    public boolean sangrar(Personagem personagem) {
        personagem.setEstado(PersonagemEstadoSangrando.getInstance());
        return true;
    }

    public boolean atordoar(Personagem personagem) {
        personagem.setEstado(PersonagemEstadoAtordoado.getInstance());
        return true;
    }
}
