package Hospital;

import java.util.ArrayList;

import Abstrato.Funcionario;
import Empresa.Ala;
import Empresa.Hospital;
import Interface.ProfissionalDaSaude;

public class Enfermeiro extends Funcionario implements ProfissionalDaSaude {

    private ArrayList<Paciente> pacientes;
    private Ala numeroAla;

    public Enfermeiro (){
        pacientes = new ArrayList<Paciente>();
    }

    public Enfermeiro(String nome, int idade,String cpf,char sexo,double peso ,Hospital hospital, String matricula,double salario, int cargaHorariaTrabalho,Ala ala){
        super(nome, idade, cpf, sexo, peso, hospital, matricula, salario, cargaHorariaTrabalho);
        this.numeroAla = ala;
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
        // TODO Auto-generated method stub
        
    }

    @Override
    public void consultar(Paciente paciente) {
        // TODO Auto-generated method stub
        
    }
    
    @Override
    public void verificarPaciente(Paciente paciente) {
        // TODO Auto-generated method stub
        
    }

    public void setNumeroAla(Ala numeroAla) {
        this.numeroAla = numeroAla;
    }
    public Ala getNumeroAla() {
        return numeroAla;
    }
}
