package Empresa;

public class Quarto {

    private int numero;
    private Hospital hospital;

    public Quarto() {
    }

    public Quarto(int numero, Hospital hospital) {
        this.hospital = hospital;
        this.numero = numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public int getNumero() {
        return numero;
    }

}
