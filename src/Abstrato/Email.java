package Abstrato;

public class Email {

    private Pessoa pessoa;
    private String enderecoEmail;
    private String servido;
    private String dominio;

    public Email (Pessoa pessoa, String enderecoEmail, String servido, String domindo){
        this.dominio = domindo;
        this.enderecoEmail = enderecoEmail;
        this.pessoa = pessoa;
        this.servido = servido;
    }

    public void setDominio(String dominio) {
        this.dominio = dominio;
    }

    public void setEnderecoEmail(String enderecoEmail) {
        this.enderecoEmail = enderecoEmail;
    }

    public void setServido(String servido) {
        this.servido = servido;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public String getDominio() {
        return dominio;
    }

    public String getEnderecoEmail() {
        return enderecoEmail;
    }

    public String getServido() {
        return servido;
    }
    
    public Pessoa getPessoa() {
        return pessoa;
    }
}
