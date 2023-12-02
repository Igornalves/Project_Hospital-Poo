package Empresa;

import java.util.ArrayList;

public class Ala {

    protected String nome;
    protected Hospital hospital;
    protected ArrayList<Sala> salas;

    protected Ala() {
        salas = new ArrayList<Sala>();
    }

    protected Ala(String nome, Hospital hospital) {
        this.nome = nome;
        this.hospital = hospital;
    }

    protected void adcionarSala(Sala sala) {
        salas.add(sala);
    }

    protected void removerAla(Sala sala) {
        salas.remove(sala);
    }

    protected int quantidadeDeSalas() {
        return salas.size();
    }

    protected Sala getSala(int posicao) {
        return salas.get(posicao);
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public Hospital getHospital() {
        return hospital;
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }

    protected String getNome() {
        return nome;
    }
}
