package br.com.fiap.heranca.model;

import java.time.LocalDate;

public abstract class Pessoa {

    private String nome;
    private LocalDate dataNascimento;
    private int peso;
    private double altura;
    private static int contador;

    public Pessoa(){
        contador++;
    }

    public Pessoa(String nome){
        this.nome = nome;
        contador++;
    }

    public abstract String falar();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public static String getContador() {
        return "Contador: "+ contador;
    }

    public void cumprimentar(){
        System.out.println("Olá, como vai!");
    }

}
