package br.com.dio.exercicios.loops;
/*
 * Nota: Faça um programa que peça uma nota, entre zero e dez.
 * Mostre uma mensagem caso o valor seja inválido
 * e continue pedindo até que o usuário informe um valor válido.
 */

import java.util.Scanner;


public class Nota {
    public static void main(String[] args) {
        double nota;

        Scanner scan = new Scanner(System.in);
        System.out.println("Informe a nota:");
        nota = scan.nextDouble();
        while (nota < 0.0 || nota > 10.0) {
            System.out.println("Valor inválido. Favor informar valor entre 0 e 10");
            nota = scan.nextDouble();
        }
    }
}
