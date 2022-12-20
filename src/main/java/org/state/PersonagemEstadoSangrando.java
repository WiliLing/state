package org.state;

public class PersonagemEstadoSangrando extends PersonagemEstado {
    private PersonagemEstadoSangrando() {};
    private static PersonagemEstadoSangrando instance = new PersonagemEstadoSangrando();
    public static PersonagemEstadoSangrando getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Sangrando";
    }

    public boolean envenenar(Personagem personagem) {
        personagem.setEstado(PersonagemEstadoEnvenenado.getInstance());
        return true;
    }

    public boolean normalizar(Personagem personagem) {
        personagem.setEstado(PersonagemEstadoNormal.getInstance());
        return true;
    }

    public boolean atordoar(Personagem personagem) {
        personagem.setEstado(PersonagemEstadoAtordoado.getInstance());
        return true;
    }
}
