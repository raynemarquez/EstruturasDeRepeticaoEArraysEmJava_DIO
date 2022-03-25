package br.com.dio.exercicios.loops;
/*
 *  Tabuada: Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
 * O usuário deve informar de qual numero ele deseja ver a tabuada.
 * A saída deve ser conforme o exemplo abaixo:
 * Tabuada de 5:
 * 5 X 1 = 5
 * 5 X 2 = 10
 * ...
 * 5 X 10 = 50
 */

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        int count;

        System.out.println("Digite um numero:");
        numero = scan.nextInt();
        System.out.println("Tabuada de " +numero);
        for(count=1; count<=10; count++){
            System.out.println(count + "x" + numero + " = " + (count*numero));
        }
    }
}
