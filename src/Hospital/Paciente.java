package Hospital;

import Abstrato.PessoaFisica;

public class Paciente extends PessoaFisica {

    private Enfermeiro enfermeiro;

    public Paciente(String nome,int idade, String cpf, char sexo, double peso, Enfermeiro enfermeiro){
        super(nome, idade, cpf, sexo, peso);
        this.enfermeiro = enfermeiro;
    }

    public void setEnfermeiro(Enfermeiro enfermeiro) {
        this.enfermeiro = enfermeiro;
    } 
    public Enfermeiro getEnfermeiro() {
        return enfermeiro;
    }

}
