package br.com.curso.java.basico.exercicio4;

import java.util.Scanner;

/*
* author: Alanne Soares
* 4. Faça um Programa que peça as 4 notas bimestrais e mostre a média
*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner;
        int nota1;
        int nota2;
        int nota3;
        int nota4;
        double media;

        scanner = new Scanner(System.in);
        System.out.print("Digite a nota 1: ");
        nota1 = scanner.nextInt();

        System.out.print("Digite a nota 2: ");
        nota2 = scanner.nextInt();

        System.out.print("Digite a nota 3: ");
        nota3 = scanner.nextInt();

        System.out.print("Digite a nota 4: ");
        nota4 = scanner.nextInt();

        System.out.println("\n--- RESULTADO DA MÉDIA ---");
        System.out.println("\n\nNota 1: " + nota1 + "\nNota 2: " + nota2 + "\nNota 3: " + nota3 + "\nNota 4: " + nota4);

        media = (nota1 + nota2 + nota3 + nota4) /4;
        System.out.println("\n\nMédia: " + media);
    }
}

// concluído