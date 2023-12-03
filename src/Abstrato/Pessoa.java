package Abstrato;

import java.util.ArrayList;

public abstract class Pessoa {

    private String nome;
    private int idade;
    private ArrayList<Endereco> enderecos;
    private ArrayList<Email> emails;
    private ArrayList<Telefone> telefones;

    public Pessoa() {
        enderecos = new ArrayList<Endereco>();
        emails = new ArrayList<Email>();
        telefones = new ArrayList<Telefone>();
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void adcionarEndereco(Endereco novoEndereco) {
        enderecos.add(novoEndereco);
    }

    public void removerEndereco(Endereco novoEndereco) {
        enderecos.remove(novoEndereco);
    }

    public int quantidadeDeEndereco() {
        return enderecos.size();
    }

    public Endereco getEndereco(int posicao) {
        return enderecos.get(posicao);
    }

    public void adcionarEmails(Email email) {
        emails.add(email);
    }

    public void removerEmail(Email email) {
        emails.remove(email);
    }

    public int quantidadeDeEmail() {
        return emails.size();
    }

    public Email getEmail(int posicao) {
        return emails.get(posicao);
    }

    public void adcionarTelefone(Telefone telefone) {
        telefones.add(telefone);
    }

    public void removerTelefone(Telefone telefone) {
        telefones.remove(telefone);
    }

    public int quantidadeDeTelefone() {
        return telefones.size();
    }

    public Telefone getTelefone(int posicao) {
        return telefones.get(posicao);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}