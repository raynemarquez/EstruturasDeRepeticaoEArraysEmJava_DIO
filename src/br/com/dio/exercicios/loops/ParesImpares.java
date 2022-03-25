package br.com.dio.exercicios.loops;
/*
 * Par e Ímpar: Faça um programa que peça N números inteiros.
 * Calcule e mostre a quantidade de números pares e a quantidade de números impares.
 */

import java.util.Scanner;

public class ParesImpares {
    public static void main(String[] args) {
        int qtdeNumeros=0, pares=0, impares=0, numero;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a quantidade de numeros:");
        qtdeNumeros = scan.nextInt();

        int count=0;
        do {
            System.out.println("Digite um numero:");
            numero = scan.nextInt();
            if ((numero%2)==0)pares++;
            else impares++;
            count++;
        } while(count<qtdeNumeros);

        System.out.println("Quantidade de numeros pares:" +pares);
        System.out.println("Quantidade de numeros impares:" +impares);
    }
}
