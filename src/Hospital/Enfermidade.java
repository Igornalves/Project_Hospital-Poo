package Hospital;

import java.util.ArrayList;

public class Enfermidade {

    private String nome;
    private ArrayList<String> sintomas;
    private Paciente paciente;

    public Enfermidade() {
        sintomas = new ArrayList<String>();
    }

    public Enfermidade(String nome, Paciente paciente) {
        this.paciente = paciente;
        this.nome = nome;
    }

    public void adcionarSintoma(String sintoma) {
        sintomas.add(sintoma);
    }

    public void removerSintoma(String sintoma) {
        sintomas.remove(sintoma);
    }

    public int quantidadeDeSintomas() {
        return sintomas.size();
    }

    public String getEnfermidade(int posicao) {
        return sintomas.get(posicao);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getNome() {
        return nome;
    }

    public Paciente getPaciente() {
        return paciente;
    }
}
