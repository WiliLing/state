package org.state;

public class PersonagemEstadoNormalizar extends PersonagemEstado{
    private PersonagemEstadoNormalizar() {};
    private static PersonagemEstadoNormalizar instance = new PersonagemEstadoNormalizar();
    public static PersonagemEstadoNormalizar getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Normal";
    }

    public boolean envenenar(Personagem personagem) {
        personagem.setEstado(PersonagemEstadoEnvenenado.getInstance());
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
