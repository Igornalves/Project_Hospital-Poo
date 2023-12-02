package Hospital;

import java.util.ArrayList;

import Abstrato.Funcionario;
import Empresa.Ala;
import Interface.ProfissionalDaSaude;

public class Enfermeiro extends Funcionario implements ProfissionalDaSaude {

    private ArrayList<Paciente> pacientes;
    private Ala numeroAla;

    public Enfermeiro() {
        pacientes = new ArrayList<Paciente>();
    }

    public Enfermeiro(Ala ala) {
        this.numeroAla = ala;
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

    public Paciente getDisciplina(int posicao) {
        return pacientes.get(posicao);
    }

    @Override
    public void aplicarMedicamento(Paciente paciente) {
        // TODO Auto-generated method stub

        Medico medico = new Medico();

        System.out.println("O(a) enfermeiro(a) com o nome "+ getNome() + " Aplica Medicamento no(a) paciente com nome "+ paciente.getNome() +" como foi ordenado pelo(a) medico(a) "+ medico.getNome() + " para que o paciente com o Enfermo possa melhora ");
    }

    @Override
    public void consultar(Paciente paciente) {
        // TODO Auto-generated method stub
        System.out.println("O(a) enfermeiro(a) estar consultando os dados do paciente de nome "+ paciente.getNome()+ " que tem o peso de "+ paciente.getPeso() +" seu genero é "+ paciente.getSexo() + " com idade " + paciente.getIdade()+ " anos ");
    }

    @Override
    public void verificarPaciente(Paciente paciente) {
        // TODO Auto-generated method stub
        System.out.println("O(a) enfermeiro(a) de nome"+ getNome() +" estar verificando o(a) Paciente de nome "+ paciente.getNome() +" seu estado de saude ainda esta em analise ");
    }

    public void setNumeroAla(Ala numeroAla) {
        this.numeroAla = numeroAla;
    }

    public Ala getNumeroAla() {
        return numeroAla;
    }
}
