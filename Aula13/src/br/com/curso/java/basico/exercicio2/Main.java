package br.com.curso.java.basico.exercicio2;

import java.util.Scanner;

/*
 * Author: Alanne Soares
 * 2. Faça um programa que peça um número e então mostre a mensagem O número informado foi [número].
 */
public class Main {
    public static void main(String[] args) {

        Scanner scanner;

        scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        System.out.println("\nO número informado foi [" + numero + "]");
    }
}

// concluído