package Empresa;

public class Sala {

    protected String tipo;
    protected Ala ala;

    protected Sala() {
    }

    protected Sala(String tipo, Ala ala) {
        this.tipo = tipo;
        this.ala = ala;
    }

    protected void setAla(Ala ala) {
        this.ala = ala;
    }

    protected void setTipo(String tipo) {
        this.tipo = tipo;
    }

    protected Ala getAla() {
        return ala;
    }

    protected String getTipo() {
        return tipo;
    }

}
