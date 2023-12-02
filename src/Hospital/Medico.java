package Hospital;

import java.util.ArrayList;

import Abstrato.Funcionario;
import Interface.ProfissionalDaSaude;

public class Medico extends Funcionario implements ProfissionalDaSaude {

    private ArrayList<Paciente> pacientes;
    private String especialidade;

    public Medico() {
        pacientes = new ArrayList<Paciente>();
    }

    public Medico(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public void aplicarMedicamento(Paciente paciente) {
        // TODO Auto-generated method stub

        Enfermeiro enfermeiro = new Enfermeiro();

        System.out.println("O(a) Medico(a) de nome "+ getNome() + " de especialidade "+ getEspecialidade() + " pede para o Enfermeiro(a) de nome "+ enfermeiro.getNome() + " aplicar os medicamentos na paciente "+ paciente.getNome() + " para que ela fique melhor");
    }

    @Override
    public void verificarPaciente(Paciente paciente) {
        // TODO Auto-generated method stub

        Medico medico = new Medico();

        System.out.println("Medico(a) de nome "+ medico.getNome() +" identificou todos estes sintomas que no(a) paciente de nome "+ paciente.getNome() + " esta sentindo: ");
        for(int r =0 ; r < paciente.quantidadeDeEnfermidades() ; r++){
            System.out.println(r + ". " + paciente.getEnfermidade(r));
        }
    }

    @Override
    public void consultar(Paciente paciente) {
        // TODO Auto-generated method stub

        System.out.println("O(a) Medico(a) receita algums medicamentos para que a paciente de nome " + paciente.getNome() + " possa meelhorar de sua Enfermidade");
    }

    public void adcionarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    public void removerPaciente(Paciente paciente) {
        pacientes.remove(paciente);
    }

    public int quantidadeDeEnfermidades() {
        return pacientes.size();
    }

    public Paciente getPaciente(int posicao) {
        return pacientes.get(posicao);
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }
}
