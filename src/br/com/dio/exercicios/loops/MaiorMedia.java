package br.com.dio.exercicios.loops;
/*
 *Maior e Média: Faça um programa que leia 5 números e informe o maior número e a média desses números.
 */

import java.util.Scanner;

public class MaiorMedia {
    public static void main(String[] args) {
        int count = 0;
        double numero, media, soma = 0, maior = 0;

        Scanner scan = new Scanner(System.in);

        do{
            System.out.println("Digite o valor:");
            numero = scan.nextDouble();
            if (numero > maior) {
                maior = numero;
            }
            soma = soma + numero;
            count = count+1;
        } while(count < 5);
        media = (soma)/5;
        System.out.println("O maior valor é: " +maior);
        System.out.println("A média dos valores é: " +media);
    }
}
