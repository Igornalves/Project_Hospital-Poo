package Hospital;

import java.util.ArrayList;

public class Enfermidade {

    protected String nome;
    protected ArrayList<String> sintomas;
    protected Paciente paciente;

    protected Enfermidade() {
        sintomas = new ArrayList<String>();
    }

    protected Enfermidade(String nome, Paciente paciente) {
        this.paciente = paciente;
        this.nome = nome;
    }

    protected void adcionarSintoma(String sintoma) {
        sintomas.add(sintoma);
    }

    protected void removerSintoma(String sintoma) {
        sintomas.remove(sintoma);
    }

    protected int quantidadeDeSintomas() {
        return sintomas.size();
    }

    protected String getEnfermidade(int posicao) {
        return sintomas.get(posicao);
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }

    protected void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    protected String getNome() {
        return nome;
    }

    protected Paciente getPaciente() {
        return paciente;
    }
}
