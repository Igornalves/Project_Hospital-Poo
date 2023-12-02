package Empresa;

public class Quarto {

    protected int numero;
    protected Hospital hospital;

    protected Quarto() {
    }

    protected Quarto(int numero, Hospital hospital) {
        this.hospital = hospital;
        this.numero = numero;
    }

    protected void setNumero(int numero) {
        this.numero = numero;
    }

    protected void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    protected Hospital getHospital() {
        return hospital;
    }

    protected int getNumero() {
        return numero;
    }

}
