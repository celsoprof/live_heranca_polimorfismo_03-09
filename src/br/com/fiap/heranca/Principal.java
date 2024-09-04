package br.com.fiap.heranca;

import br.com.fiap.heranca.model.Developer;
import br.com.fiap.heranca.model.Funcionario;
import br.com.fiap.heranca.model.Pessoa;

import java.time.LocalDate;

public class Principal {

    public static void main(String[] args) {
//        Pessoa p = new Pessoa();
//        p.setNome("Maria da Silva");
//        p.setDataNascimento(LocalDate.of(1999, 5, 9)); //09/05/1999
//        p.setAltura(1.76);
//        p.setPeso(78);
//
//        Pessoa p1 = new Pessoa("Pedro Gomes");
//        p1.setPeso(87);
//        p1.setAltura(1.79);
//        p1.setDataNascimento(LocalDate.of(2000, 12, 15));// 15/12/2000
//
//        Pessoa p2 = new Pessoa();
//        Pessoa p3 = new Pessoa();
//        Pessoa p4 = new Pessoa();

        System.out.println(Pessoa.getContador());

        Funcionario f1 = new Funcionario("Patrícia Alves");
        //f1.setNome("Patrícia Alves");
        f1.setAltura(1.65);
        f1.setPeso(54);
        f1.setDataNascimento(LocalDate.of(1998,7, 10));
        f1.setCargo("Analista de Testes");
        f1.setDataAdmissao(LocalDate.of(2020, 10, 1));
        f1.setSalario(5000);
        System.out.println(Funcionario.getContador());

        f1.cumprimentar();
        //p1.cumprimentar();

        Developer dev1 = new Developer();
        dev1.cumprimentar("Maria");

        dev1.calcular(3, 8);
        dev1.testar();


    }

}
