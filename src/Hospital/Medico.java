package Hospital;

import java.util.ArrayList;

import Interface.ProfissionalDaSaude;

public class Medico extends Funcionario implements ProfissionalDaSaude {

    private ArrayList<Paciente> pacientes;
    private String especialidade;

    
}
