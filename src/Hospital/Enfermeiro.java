package Hospital;

import java.util.ArrayList;

import Abstrato.Funcionario;
import Empresa.Ala;
import Interface.ProfissionalDaSaude;

public class Enfermeiro extends Funcionario implements ProfissionalDaSaude {

    private ArrayList<Paciente> pacientes;
    private Ala numeroAla;

    public Enfermeiro (){
        pacientes = new ArrayList<Paciente>();
    }

    public void adcionarPaciente(Paciente paciente){
        pacientes.add(paciente);
    }

    public void removerPaciente(Paciente paciente){
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
        System.out.println("O(A) Enfermeiro(a) " + paciente.getNome() + " estar aplicando o medicamento");
    }
    @Override
    public void consultar(Paciente paciente) {
        
    }
    @Override
    public void verificarPaciente(Paciente paciente) {
        
    }
    
    public void setNumeroAla(Ala numeroAla) {
        this.numeroAla = numeroAla;
    }
    public Ala getNumeroAla() {
        return numeroAla;
    }
}
