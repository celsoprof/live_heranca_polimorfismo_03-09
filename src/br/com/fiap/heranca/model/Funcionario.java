package br.com.fiap.heranca.model;

import java.time.LocalDate;

public class Funcionario extends Pessoa{

    private double salario;
    private LocalDate dataAdmissao;
    private String cargo;

    public Funcionario(){

    }

    public Funcionario(String nome){
        setNome(nome);
    }

    @Override
    public String falar() {
        return "";
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public void cumprimentar() {
        System.out.println("Bom dia! Tudo bem?");
    }

    public void calcular(int a, int b){
        System.out.println("A soma de A e B é: " + (a + b));
    }
}
