package org.example;

public class estudante {
    private String nome;
    private double notaFinal;


    public estudante(String nome, double notaFinal) {
        this.nome = nome;
        this.notaFinal = notaFinal;
    }


    public String getNome() {
        return nome;
    }

    public double getNotaFinal() {
        return notaFinal;
    }
}
