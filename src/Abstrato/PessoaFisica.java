package Abstrato;

public abstract class PessoaFisica extends Pessoa {

    private String cpf;
    private String sexo;
    private double peso;

    public PessoaFisica(){}

    public PessoaFisica(String nome, int idade,String cpf,String sexo,double peso){
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

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public String getSexo() {
        return sexo;
    }

    public String getCpf() {
        return cpf;
    }
}
