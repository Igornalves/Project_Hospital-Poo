package Abstrato;

import Empresa.Hospital;

public abstract class Funcionario extends PessoaFisica {

    private Hospital hospital;
    private String matricula;
    private double salario;
    private int cargaHorariaTrabalho;

    public Funcionario(){}

    public Funcionario(String nome, int idade,String cpf,char sexo,double peso ,Hospital hospital, String matricula,double salario, int cargaHorariaTrabalho) {
        super(nome, idade, cpf, sexo, peso);
        this.hospital = hospital;
        this.cargaHorariaTrabalho = cargaHorariaTrabalho;
        this.salario = salario;
        this.matricula = matricula;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setCargaHorariaTrabalho(int cargaHorariaTrabalho) {
        this.cargaHorariaTrabalho = cargaHorariaTrabalho;
    }

    public double getSalario() {
        return salario;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getCargaHorariaTrabalho() {
        return cargaHorariaTrabalho;
    }
}
