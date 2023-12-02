package Hospital;

import java.util.ArrayList;

import Abstrato.PessoaFisica;

public class Paciente extends PessoaFisica {

    private Enfermeiro enfermeiro;
    private Medico medico;
    private ArrayList<Enfermidade> enfermidades;

    public Paciente() {
        enfermidades = new ArrayList<Enfermidade>();
    }

    public Paciente(String nome, int idade, String cpf, char sexo, double peso, Enfermeiro enfermeiro) {
        super(nome, idade, cpf, sexo, peso);
        this.enfermeiro = enfermeiro;
    }

    public void adcionarEnfermidade(Enfermidade enfermidade) {
        enfermidades.add(enfermidade);
    }

    public void removerEnfermidade(Enfermidade enfermidade) {
        enfermidades.remove(enfermidade);
    }

    public int quantidadeDeEnfermidades() {
        return enfermidades.size();
    }

    public Enfermidade getEnfermidade(int posicao) {
        return enfermidades.get(posicao);
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setEnfermeiro(Enfermeiro enfermeiro) {
        this.enfermeiro = enfermeiro;
    }

    public Enfermeiro getEnfermeiro() {
        return enfermeiro;
    }

}
