package Empresa;

import java.util.ArrayList;

import Abstrato.Funcionario;
import Abstrato.PessoaJuridica;
import Hospital.Paciente;

public class Hospital extends PessoaJuridica {

    private ArrayList<Ala> alas;
    private ArrayList<Quarto> quartos;
    private ArrayList<Funcionario> funcionarios;
    private ArrayList<Paciente> pacientes;

    public Hospital() {
        alas = new ArrayList<Ala>();
        quartos = new ArrayList<Quarto>();
        funcionarios = new ArrayList<Funcionario>();
        pacientes = new ArrayList<Paciente>();
    }

    public void adcionarAla(Ala ala) {
        alas.add(ala);
    }

    public void removerAla(Ala ala) {
        alas.remove(ala);
    }

    public int quantidadeDeAlas() {
        return alas.size();
    }

    public Ala getAla(int posicao) {
        return alas.get(posicao);
    }

    public void adcionarQuarto(Quarto quarto) {
        quartos.add(quarto);
    }

    public void removerQuarto(Quarto quarto) {
        quartos.remove(quarto);
    }

    public int quantidadeDeQuartos() {
        return quartos.size();
    }

    public Quarto getQuarto(int posicao) {
        return quartos.get(posicao);
    }

    public void adcionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void removerFuncionario(Funcionario funcionario) {
        funcionarios.remove(funcionario);
    }

    public int quantidadeDeFuncionario() {
        return funcionarios.size();
    }

    public Funcionario getFuncionario(int posicao) {
        return funcionarios.get(posicao);
    }

    public void adcionarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    public void removerPaciente(Paciente paciente) {
        pacientes.remove(paciente);
    }

    public int quantidadeDePaciente() {
        return pacientes.size();
    }

    public Paciente getTotalDePaciente(int posicao) {
        return pacientes.get(posicao);
    }

}
