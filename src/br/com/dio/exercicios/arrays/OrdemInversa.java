package br.com.dio.exercicios.arrays;
/*
*Ordem Inversa: Faça um Programa que leia um vetor de 5 números inteiros e mostre-os na ordem inversa.
 */
import java.util.Scanner;

public class OrdemInversa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetor = new int[5];

        for (int i=0; i<5;i++){
            System.out.println("Digite o numero da posição " + i + ": ");
            vetor[i] = scan.nextInt();
        }
        int count=0;
        System.out.println("Ordem normal : ");
        while ( count < vetor.length){
            System.out.println("Vetor[" + count + "] = " + vetor[count]);
            count++;
        }
        System.out.println("Ordem inversa : ");
        for(int i= (vetor.length - 1);i >= 0; i--){
            System.out.println("Vetor[" + i + "] = " + vetor[i]);
        }

    }
}
