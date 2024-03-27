package App;

import Abstrato.Email;
import Abstrato.Endereco;
import Abstrato.Telefone;
import Empresa.Ala;
import Empresa.Hospital;
import Empresa.Quarto;
import Empresa.Sala;
import Hospital.Enfermeiro;
import Hospital.Enfermidade;
import Hospital.Medico;
import Hospital.Paciente;

public class Principal {
    public static void main(String[] args){

        Paciente paciente1 = new Paciente();
        Paciente paciente2 = new Paciente();
        Paciente paciente3 = new Paciente();

        Quarto quarto1 = new Quarto();
        Quarto quarto2 = new Quarto();
        Quarto quarto3 = new Quarto();

        Medico medico1 = new Medico();
        Medico medico2 = new Medico();
        Medico medico3 = new Medico();

        Sala sala1 = new Sala();
        Sala sala2 = new Sala();
        Sala sala3 = new Sala();

        Ala ala1 = new Ala();
        Ala ala2 = new Ala();

        Enfermeiro enfermeiro1 = new Enfermeiro();
        Enfermeiro enfermeiro2 = new Enfermeiro();
        Enfermeiro enfermeiro3 = new Enfermeiro();

        Enfermidade enfermidade1 = new Enfermidade();
        Enfermidade enfermidade2 = new Enfermidade();
        Enfermidade enfermidade3 = new Enfermidade();

        Hospital hospital1 = new Hospital();

        Endereco endereco1 = new Endereco();
        
        Telefone telefone1 = new Telefone();
        Telefone telefone2 = new Telefone();

        Email email1 = new Email();
        Email email2 = new Email();

        email1.setEnderecoEmail("HospitalGeralHinarioRibeiro@saude.gov.br");
        email1.setPessoa(hospital1);

        email2.setEnderecoEmail("HinarioRibeiroSUS@SaudeMunicipal.gov.br");
        email2.setPessoa(hospital1);
        
        endereco1.setCep("32634-432");
        endereco1.setEstado("Piaui");
        endereco1.setLogradouro("Rua Coronel Carlos Eduardo");
        endereco1.setPais("Brasil");

        telefone1.setDdi("+55");
        telefone1.setDdd("86");
        telefone1.setNumero("99415-3236");
        telefone1.setOperadora("Claro");

        telefone2.setDdi("+55");
        telefone2.setDdd("86");
        telefone2.setNumero("98425-3236");
        telefone2.setOperadora("vivo");

        enfermidade1.setNome("Dengue");
        enfermidade1.adcionarSintoma("Dor de cabeca e febre");

        enfermidade2.setNome("intoxicação alimentar");
        enfermidade2.adcionarSintoma("vomito e enjou");

        enfermidade3.setNome("Gripe");
        enfermidade3.adcionarSintoma("Dor de garganta e mau estar");

        enfermeiro1.setNome("Sophia");
        enfermeiro1.setNumeroAla(ala1);
        enfermeiro1.adcionarPaciente(paciente3);

        enfermeiro2.setNome("Carlos");
        enfermeiro2.setNumeroAla(ala1);
        enfermeiro2.adcionarPaciente(paciente2);

        enfermeiro3.setNome("Rafael");
        enfermeiro3.setNumeroAla(ala1);
        enfermeiro3.adcionarPaciente(paciente1);
        
        paciente1.setNome("Juliana");
        paciente1.setCpf("234.543.654-45");
        paciente1.setSexo("Feminino");
        paciente1.setPeso(55.4);
        paciente1.adcionarEnfermidade(enfermidade1);

        paciente2.setNome("José");
        paciente2.setCpf("328.454.642-54");
        paciente2.setSexo("masculino");
        paciente2.setPeso(65.0);
        paciente2.adcionarEnfermidade(enfermidade2);

        paciente3.setNome("Maycon");
        paciente3.setCpf("123.432.455-70");
        paciente3.setSexo("masculino");
        paciente3.setPeso(85.5);
        paciente3.adcionarEnfermidade(enfermidade3);

        medico1.setNome("Joao");
        medico1.setEspecialidade("Clinica geral");
        medico1.setCargaHorariaTrabalho(80);
        medico1.setSalario(4500);
        medico1.adcionarPaciente(paciente3);
    
        medico2.setNome("Maria");
        medico2.setEspecialidade("Clinica medica");
        medico2.setCargaHorariaTrabalho(80);
        medico2.setSalario(5000);
        medico2.adcionarPaciente(paciente2);

        medico3.setNome("Fernando");
        medico3.setEspecialidade("Clinica geral");
        medico3.setCargaHorariaTrabalho(80);
        medico3.setSalario(4900);
        medico3.adcionarPaciente(paciente1);
    
        quarto1.setNumero(5);
        quarto1.setHospital(hospital1);

        quarto2.setNumero(2);
        quarto2.setHospital(hospital1);

        quarto3.setNumero(4);
        quarto3.setHospital(hospital1);

        sala1.setTipo("escritorio");
        sala1.setAla(ala1);

        sala2.setTipo("Clinica 2");
        sala2.setAla(ala2);

        sala3.setTipo("Clinica 3");
        sala3.setAla(ala2);

        ala1.setNome("Area Clinica");
        ala1.setHospital(hospital1);
        ala1.adcionarSala(sala2);
        ala1.adcionarSala(sala3);

        ala2.setNome("Area administrativa");
        ala1.adcionarSala(sala1);
        ala2.setHospital(hospital1);

        hospital1.setCnpj("56.312.532/0001-45");
        hospital1.setNome("Hospital Geral Hinario Ribeiro");
        hospital1.adcionarTelefone(telefone1);
        hospital1.adcionarTelefone(telefone2);
        hospital1.adcionarPaciente(paciente1);
        hospital1.adcionarPaciente(paciente2);
        hospital1.adcionarPaciente(paciente3);
        hospital1.adcionarFuncionario(medico1);
        hospital1.adcionarFuncionario(medico2);
        hospital1.adcionarFuncionario(medico3);
        hospital1.adcionarFuncionario(enfermeiro1);
        hospital1.adcionarFuncionario(enfermeiro2);
        hospital1.adcionarFuncionario(enfermeiro3);
        hospital1.adcionarEndereco(endereco1);
        hospital1.adcionarEmails(email1);
        hospital1.adcionarEmails(email2);
        hospital1.adcionarQuarto(quarto3);
        hospital1.adcionarQuarto(quarto2);
        hospital1.adcionarQuarto(quarto1);
        hospital1.adcionarAla(ala2);
        hospital1.adcionarAla(ala1);

        System.out.println("\n");

        System.out.println("-------------------------------------------------");
        System.out.println("Ola seja bem vindo ao sistema feito para a prova");
        System.out.println("-------------------------------------------------");
        
        System.out.println("\n");
        
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Este são os dados relacionado ao " + hospital1.getNome() + " que vai ter: ");
        System.out.println("----------------------------------------------------------------------------");

        System.out.println("\n");

        System.out.println("Este é o CNPJ do " + hospital1.getNome() + "\n CNPJ: " + hospital1.getCnpj());

        System.out.println("\n");
        
        System.out.println("Este é o endereco do local que fica o "+ hospital1.getNome()+ " é:");

        for(int k =0; k < hospital1.quantidadeDeEndereco(); k++){
            System.out.println("  Estado: "+hospital1.getEndereco(k).getEstado() + "\n  Cep: " + hospital1.getEndereco(k).getCep() + "\n  Logradouro: " + hospital1.getEndereco(k).getLogradouro() + "\n  País: " + hospital1.getEndereco(k).getPais());
        }
        
        System.out.println("\n");
        
        System.out.println("Este são o total de paciente que estão no "+ hospital1.getNome()+ ": ");
        for(int e =0; e < hospital1.quantidadeDePaciente(); e++){
            System.out.println("  "+ e + ". " + hospital1.getTotalDePaciente(e).getNome());
        }
        
        System.out.println("\n");
        
        System.out.println("Este é os telefones para contato com o "+ hospital1.getNome()+":");
        for(int t =0; t < hospital1.quantidadeDeTelefone(); t++){
            System.out.println("  "+hospital1.getTelefone(t).getDdi()+ " " + hospital1.getTelefone(t).getDdd() + " " + hospital1.getTelefone(t).getNumero() + " (Operadora: " + hospital1.getTelefone(t).getOperadora() + ")");
        }
        
        System.out.println("\n");
        
        System.out.println("Este é são os emails para contato com o "+ hospital1.getNome()+":");
        for(int y =0 ; y < hospital1.quantidadeDeEmail() ; y++){
            System.out.println("  "+hospital1.getEmail(y).getEnderecoEmail());
        }

        System.out.println("\n");
        
        System.out.println("Este são os funcionarios do "+ hospital1.getNome() +":");
        for(int u =0; u < hospital1.quantidadeDeFuncionario(); u++){
            System.out.println("  medico(a): "+hospital1.getFuncionario(u).getNome());
        }

        System.out.println("\n");
        
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Este são os dados relacionado aos paciente do "+ hospital1.getNome() +" que vai ter: ");
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("\n");
        
        System.out.println("A doença do(a) paciente do nome: "+ paciente1.getNome());
        for(int q =0; q < paciente1.quantidadeDeEnfermidades(); q++){
            System.out.println("  Enfermidade: " + paciente1.getEnfermidade(q).getNome());
        }
        
        System.out.println("\n");

        System.out.println("Dados do(a) paciente "+ paciente1.getNome() + " Abaixo:" + "\nCPF:. "+ paciente1.getCpf() + "\nSexo: " + paciente1.getSexo() + "\nPeso:. "+ paciente1.getPeso());
        
        System.out.println("\n");
        
        System.out.println("A doença do(a) paciente do nome: "+ paciente2.getNome());
        for(int q =0; q < paciente2.quantidadeDeEnfermidades(); q++){
            System.out.println("  Enfermidade: " + paciente2.getEnfermidade(q).getNome());
        }
        
        System.out.println("\n");

        System.out.println("Dados do(a) paciente "+ paciente2.getNome() + " Abaixo:" + "\nCPF:. "+ paciente2.getCpf() + "\nSexo: " + paciente2.getSexo() + "\nPeso:. "+ paciente2.getPeso());
        
        System.out.println("\n");
        
        System.out.println("A doença do(a) paciente do nome: "+ paciente3.getNome());
        for(int q =0; q < paciente3.quantidadeDeEnfermidades(); q++){
            System.out.println("  Enfermidade: " + paciente3.getEnfermidade(q).getNome());
        }
        
        System.out.println("\n");

        System.out.println("Dados do(a) paciente "+ paciente3.getNome() + " Abaixo:" + "\nCPF:. "+ paciente3.getCpf() + "\nSexo: " + paciente3.getSexo() + "\nPeso:. "+ paciente3.getPeso());
        
        System.out.println("\n");

        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Este são os dados relacionado aos Medicos do "+ hospital1.getNome() +" que vai ter: ");
        System.out.println("-----------------------------------------------------------------------------------------");
        
        System.out.println("\n");
        
        System.out.println("Dados do(a) medico(a) de Nome: " + medico1.getNome() +  "\n   Especialidade: "+ medico1.getEspecialidade() + "\n   Carga Horaria ao mes: " + medico1.getCargaHorariaTrabalho() +"\n   Salario: " + medico1.getSalario() + " reais");
        
        System.out.println("\n");

        medico1.aplicarMedicamento(paciente3);

        System.out.println("\n");

        medico1.consultar(paciente3);

        System.out.println("\n");

        medico1.verificarPaciente(paciente3);

        System.out.println("\n");

        System.out.println("Dados do(a) medico(a) de Nome: " + medico2.getNome() +  "\n   Especialidade: "+ medico2.getEspecialidade() + "\n   Carga Horaria ao mes: " + medico2.getCargaHorariaTrabalho() +"\n   Salario: " + medico2.getSalario() + " reais");

        System.out.println("\n");

        medico2.aplicarMedicamento(paciente2);

        System.out.println("\n");

        medico2.consultar(paciente2);

        System.out.println("\n");

        medico2.verificarPaciente(paciente2);

        System.out.println("\n");

        System.out.println("Dados do(a) medico(a) de Nome: " + medico3.getNome() +  "\n   Especialidade: "+ medico3.getEspecialidade() + "\n   Carga Horaria ao mes: " + medico3.getCargaHorariaTrabalho() +"\n   Salario: " + medico3.getSalario() + " reais");
        
        System.out.println("\n");
        
        medico3.aplicarMedicamento(paciente1);

        System.out.println("\n");

        medico3.consultar(paciente1);

        System.out.println("\n");

        medico3.verificarPaciente(paciente1);

        System.out.println("\n");

        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("Este são os dados relacionado aos Enfermeiros do "+ hospital1.getNome() +" que vai ter: ");
        System.out.println("--------------------------------------------------------------------------------------------");
        
        System.out.println("\n");
        
        System.out.println("Dados do(a) Enfermeiro(a): "+ enfermeiro1.getNome() + "\nNumero da Ala: "+ enfermeiro1.getNumeroAla());
        
        System.out.println("\n");

        enfermeiro1.aplicarMedicamento(paciente3);

        System.out.println("\n");

        enfermeiro1.consultar(paciente3);

        System.out.println("\n");

        enfermeiro1.verificarPaciente(paciente3);

        System.out.println("\n");
        
        System.out.println("Dados do(a) Enfermeiro(a): "+ enfermeiro2.getNome() + "\nNumero da Ala: "+ enfermeiro2.getNumeroAla());

        System.out.println("\n");

        enfermeiro2.aplicarMedicamento(paciente2);

        System.out.println("\n");

        enfermeiro2.consultar(paciente2);

        System.out.println("\n");

        enfermeiro2.verificarPaciente(paciente2);

        System.out.println("\n");

        System.out.println("Dados do(a) Enfermeiro(a): "+ enfermeiro3.getNome() + "\nNumero da Ala: "+ enfermeiro3.getNumeroAla());

        System.out.println("\n");

        enfermeiro3.aplicarMedicamento(paciente1);

        System.out.println("\n");

        enfermeiro3.consultar(paciente1);

        System.out.println("\n");

        enfermeiro3.verificarPaciente(paciente1);

        System.out.println("\n");
    }
}
