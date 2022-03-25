package br.com.dio.exercicios.arrays;
/*
*Array Multidimensional: Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9.
* Após isso determine o menor número da matriz e a sua posição(linha, coluna).
 */

import java.util.Random;

public class ArrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] matriz = new int[4][4];

        for (int i =0; i < (matriz.length);i++) {
            for(int j =0; j < (matriz[i].length);j++){
                matriz[i][j] = random.nextInt(9);
            }
        }
        System.out.println("Matriz: ");
        for (int[] linha : matriz) {
            for(int elementoDaColuna: linha){
                System.out.print(elementoDaColuna + " ");
            }
            System.out.println();

            
        }
    }
}
