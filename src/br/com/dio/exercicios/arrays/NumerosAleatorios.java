package br.com.dio.exercicios.arrays;
/*
 *Números Aleatórios: Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100)
 * armazene-os num vetor. Ao final, mostre os números e seus sucessores.
 */

import java.util.Random;
import java.util.Scanner;


public class NumerosAleatorios {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for(int i=0; i < (numerosAleatorios.length);i++){
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.print("Numeros Aleatorios:\n");
        for(int numero: numerosAleatorios){
            System.out.print(numero + " ");
        }

        System.out.print("\nSucessores dos Numeros Aleatorios:\n");
        for(int numero: numerosAleatorios){
            System.out.print((numero+1) + " ");
        }
    }
}
