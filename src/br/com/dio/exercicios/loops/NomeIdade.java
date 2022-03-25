package br.com.dio.exercicios.loops;

/*
 * Nome e Idade: Faça um programa que leia conjuntos de dois valores,
 *  o primeiro representando o nome do aluno e o segundo representando a sua idade.
 *  (Pare o programa inserindo o valor 0 no campo nome)
 */

import java.util.Scanner;

public class NomeIdade {
    public static void main(String[] args) {
        String nome;
        int idade;

        Scanner scan = new Scanner(System.in);
        while (true){

            System.out.println("Informe o nome (caso queira sair digite 0):");
            nome= scan.next();
            if (nome.equals("0")) break;
            System.out.println("Informe a idade");
            idade = scan.nextInt();
            System.out.println("Idade:" +idade);

        }
    }
}
