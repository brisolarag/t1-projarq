package br.edu.pucrs.brisolara.g.t1_projarq.models;

public class Cliente {
    private int id;
    private String cpf;
    private String nome;
    private String telefone;


    public int getId() {
        return this.id;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    
}
