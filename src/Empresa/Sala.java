package Empresa;

public class Sala {

    private String tipo;
    private Ala ala;

    public Sala() {
    }

    public Sala(String tipo, Ala ala) {
        this.tipo = tipo;
        this.ala = ala;
    }

    public void setAla(Ala ala) {
        this.ala = ala;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Ala getAla() {
        return ala;
    }

    public String getTipo() {
        return tipo;
    }

}
