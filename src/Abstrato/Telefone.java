package Abstrato;

public class Telefone {

    private String ddi;
    private String operadora;
    private String ddd;
    private String numero;

    public Telefone (){
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public void setDdi(String ddi) {
        this.ddi = ddi;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }

    public String getDdd() {
        return ddd;
    }

    public String getDdi() {
        return ddi;
    }

    public String getNumero() {
        return numero;
    }

    public String getOperadora() {
        return operadora;
    }

}
