package br.com.dio.exercicios.Lista;

import java.util.Scanner;

/**
 * 2. Faça um programa que leia um nome de usuário e a sua senha
 *  e não aceite a senha igual ao nome do usuário,
 *   mostrando uma mensagem de erro e voltando a pedir as informações.
 */

public class Exercicio2 {
    public static void main(String[] args) {

        String usuario, senha;

        do{
            Scanner scan = new Scanner(System.in);
            System.out.println("Digite o usuario: ");
            usuario = scan.next();
            System.out.println("Digite a senha: ");
            senha = scan.next();
            if (usuario.equals(senha)) {
                System.out.println("A senha e o usuario nao podem ser iguais, informe novamente os dados.");
            }
        } while (usuario.equals(senha));

    }
}
