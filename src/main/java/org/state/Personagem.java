package org.state;

public class Personagem {
    private String nome;
    private PersonagemEstado estado;

    public Personagem() {
        this.estado = PersonagemEstadoNormal.getInstance();
    }

    public void setEstado(PersonagemEstado estado) {
        this.estado = estado;
    }

    public boolean normalizar() {
        return estado.normalizar(this);
    }

    public boolean envenenar() {
        return estado.envenenar(this);
    }

    public boolean sangrar() {
        return estado.sangrar(this);
    }

    public boolean atordoar() {
        return estado.atordoar(this);
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public PersonagemEstado getEstado() {
        return estado;
    }
}