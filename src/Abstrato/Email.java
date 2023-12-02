package Abstrato;

public class Email {

    protected Pessoa pessoa;
    protected String enderecoEmail;
    protected String servido;
    protected String dominio;

    protected Email (Pessoa pessoa, String enderecoEmail, String servido, String domindo){
        this.dominio = domindo;
        this.enderecoEmail = enderecoEmail;
        this.pessoa = pessoa;
        this.servido = servido;
    }

    protected void setDominio(String dominio) {
        this.dominio = dominio;
    }

    protected void setEnderecoEmail(String enderecoEmail) {
        this.enderecoEmail = enderecoEmail;
    }

    protected void setServido(String servido) {
        this.servido = servido;
    }

    protected void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    protected String getDominio() {
        return dominio;
    }

    protected String getEnderecoEmail() {
        return enderecoEmail;
    }

    protected String getServido() {
        return servido;
    }

    protected Pessoa getPessoa() {
        return pessoa;
    }
}
