package br.com.dio.exercicios.arrays;
/*
 * Consoantes: Faça um Programa que leia um vetor de 6 caracteres,
 * e diga quantas consoantes foram lidas. Imprima as consoantes.
 */
import java.util.Scanner;

public class Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int qtdeConsoantes=0;
        String [] vetorCaracteres = new String[6];

/*
        for (int i=0;i<vetorCaracteres.length;i++) {
            System.out.println("Digite o caracter da posicao [" + i +"]: ");
            vetorCaracteres[i] = scan.next();
            if (!vetorCaracteres[i].equals("a") && !vetorCaracteres[i].equals("e") && !vetorCaracteres[i].equals("i") && !vetorCaracteres[i].equals("o") && !vetorCaracteres[i].equals("u")){
                qtdeConsoantes++;
            }
        }
*/
        int count=0;
        do {
            System.out.println("Digite o caracter da posicao [" + count +"]: ");
            String letra = scan.next();
            if(!(letra.equalsIgnoreCase("a") |
                letra.equalsIgnoreCase("e") |
                letra.equalsIgnoreCase("i") |
                letra.equalsIgnoreCase("o") |
                letra.equalsIgnoreCase("u"))) {

                vetorCaracteres[count] = letra;
                qtdeConsoantes++;
            }
            count++;
        } while(count < vetorCaracteres.length);


        System.out.println("Consoantes:");
        for(String consoante : vetorCaracteres){
            if (consoante!=null) System.out.print("< " + consoante + " >  ");
        }

        System.out.println("A quantidade de consoantes é: " + qtdeConsoantes);
    }
}
