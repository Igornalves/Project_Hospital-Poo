package Abstrato;

public class Telefone {

    private String ddi;
    private String operadora;
    private String ddd;
    private String numero;

    protected Telefone (){
    }

    protected void setDdd(String ddd) {
        this.ddd = ddd;
    }

    protected void setDdi(String ddi) {
        this.ddi = ddi;
    }

    protected void setNumero(String numero) {
        this.numero = numero;
    }

    protected void setOperadora(String operadora) {
        this.operadora = operadora;
    }

    protected String getDdd() {
        return ddd;
    }

    protected String getDdi() {
        return ddi;
    }

    protected String getNumero() {
        return numero;
    }

    protected String getOperadora() {
        return operadora;
    }

}
