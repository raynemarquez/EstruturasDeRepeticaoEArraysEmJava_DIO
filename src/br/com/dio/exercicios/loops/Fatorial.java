package br.com.dio.exercicios.loops;
/*
 * Fatorial: Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
 * Ex.: 5!=5.4.3.2.1=120
 */

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        int count;
        int fatorial=1;

        System.out.println("Digite um numero:");
        numero = scan.nextInt();
        for (count=numero;count>=1;count--){
            fatorial = fatorial * count;
        }
        System.out.println(numero + "! = " +fatorial);
    }
}
