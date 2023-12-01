package Interface;

import Hospital.Paciente;

public interface ProfissionalDaSaude {

    public void aplicarMedicamento(Paciente paciente);

    public void verificarPaciente(Paciente paciente);

    public void consultar(Paciente paciente);
    
}
