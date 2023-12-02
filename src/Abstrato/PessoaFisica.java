package Abstrato;

public abstract class PessoaFisica extends Pessoa {

    private String cpf;
    private char sexo;
    private double peso;
    
    public PessoaFisica(String nome,int idade, String cpf, char sexo, double peso){
        super(nome, idade);
        this.cpf = cpf;
        this.peso = peso; 
        this.sexo = sexo;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public char getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public String getCpf() {
        return cpf;
    }

}
