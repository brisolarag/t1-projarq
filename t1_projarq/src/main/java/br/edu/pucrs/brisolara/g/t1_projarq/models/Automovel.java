package br.edu.pucrs.brisolara.g.t1_projarq.models;

public class Automovel {
    private String placa;
    private int ano;
    private double valorDiaria;
    private boolean disponivel;

    public Automovel(String placa, int ano, double valorDiaria) {
        this.placa = placa;
        this.ano = ano;
        this.valorDiaria = valorDiaria;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getValorDiaria() {
        return this.valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public boolean isDisponivel() {
        return this.disponivel;
    }

    public void setDisponivel() {
        if (!this.disponivel) {
            this.disponivel = true;
        }
    }

    public void setIndisponivel() {
        if (!this.disponivel) {
            this.disponivel = false;
        }
    }
}
