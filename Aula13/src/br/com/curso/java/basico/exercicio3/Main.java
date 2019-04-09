package br.com.curso.java.basico.exercicio3;

import java.util.Scanner;

/*
 * Author: Alanne Soares
 * 3. Faça um Programa que peça dois números e imprima a soma.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner;

        scanner = new Scanner(System.in);
        System.out.println("---- SOMA DOS RESULTADOS ----\n");
        System.out.print("Digite o primeiro número: ");
        int primeiroNumero = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int segundoNumero = scanner.nextInt();

        System.out.println("\n--- Resultado ---");
        System.out.println(primeiroNumero + segundoNumero);

    }
}
