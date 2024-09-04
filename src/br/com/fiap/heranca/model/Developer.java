package br.com.fiap.heranca.model;

public class Developer extends Funcionario{

    @Override
    public void cumprimentar() {
        System.out.println("E aí galerinha, beleza?");
    }

    public void cumprimentar(String nome){
        System.out.printf("Olá, %s!!", nome);
    }

    public void cumprimentar(String nome, int hora){
        if (hora > 12 && hora <= 18){
            System.out.printf("Olá %s, boa tarde!", nome);
        } else {
            System.out.printf("Olá %s, bom dia!!", nome);
        }
    }


    @Override
    public void calcular(int a, int b) {
        System.out.println("Calculando a partir da classe developer");
    }

    public void testar(){
        calcular(2, 4);
    }
}
