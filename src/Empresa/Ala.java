package Empresa;

import java.util.ArrayList;

public class Ala {

    private String nome;
    private Hospital hospital;
    private ArrayList<Sala> salas;

    public Ala() {
        salas = new ArrayList<Sala>();
    }

    public Ala(String nome, Hospital hospital) {
        this.nome = nome;
        this.hospital = hospital;
    }

    public void adcionarSala(Sala sala) {
        salas.add(sala);
    }

    public void removerAla(Sala sala) {
        salas.remove(sala);
    }

    public int quantidadeDeSalas() {
        return salas.size();
    }

    public Sala getSala(int posicao) {
        return salas.get(posicao);
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
