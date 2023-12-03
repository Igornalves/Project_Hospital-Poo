package Abstrato;

public class Endereco {

    private Pessoa pessoa;
    private String logradouro;
    private String tipo;
    private String cep;
    private String estado;
    private String pais;

    public Endereco(){}
    
    public Endereco(Pessoa pessoa, String logradouro, String tipo, String cep, String estado, String pais){
        this.pessoa = pessoa;
        this.estado = estado;
        this.tipo = tipo;
        this.logradouro = logradouro;
        this.cep = cep;
        this.pais = pais;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCep() {
        return cep;
    }

    public String getEstado() {
        return estado;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getPais() {
        return pais;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }
    
    public String getTipo() {
        return tipo;
    }

}
