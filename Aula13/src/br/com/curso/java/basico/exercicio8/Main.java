package br.com.curso.java.basico.exercicio8;

import java.util.Scanner;

/*
*
*  8. Faça um Programa que pergunte quanto você ganha por hora
*     e o número de horas trabalhadas no mês. Calcule e mostre o
*     total do seu salário no referido mês.
*
* */
public class Main {
    public static void main(String[] args) {

        Scanner scanner;
        double valorHora;
        int totalHorasDia;
        int totalDias;

        scanner = new Scanner(System.in);
        System.out.print("Valor por hora: R$ ");
        valorHora = scanner.nextDouble();

        System.out.print("Total de horas ao dia: ");
        totalHorasDia = scanner.nextInt();

        System.out.print("Total de dias de trabalho: ");
        totalDias = scanner.nextInt();

        System.out.print("\nTotal de horas trabalhadas no mês: " + ((totalHorasDia * totalDias) * 4));
        System.out.print(String.format("\nValor do salário no mês: R$ %.2f", ((valorHora * totalHorasDia) * totalDias) * 4));
    }
}

// Concluído.