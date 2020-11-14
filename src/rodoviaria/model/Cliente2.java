package rodoviaria.model;

import rodoviaria.dao.ClienteDao2;
import rodoviaria.dao.ExceptionDao2;

public class Cliente2 {

    private String nome;
    private String telefone;
    private int idade;
    private String cpf;

    public Cliente2(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void cadastrarCliente2(Cliente2 cliente) throws ExceptionDao2 {
        new ClienteDao2().cadastrarCliente(cliente);
    }

}
