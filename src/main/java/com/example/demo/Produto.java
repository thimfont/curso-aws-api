package com.example.demo;

public class Produto {
    private String nome;
    private Double valor;

    public Produto(final String nome, final Double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public Double getValor() {
        return valor;
    }
}
