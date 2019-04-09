package br.com.curso.java.basico.exercicio11;

import java.util.Scanner;

/*
* Author: Alanne Soares
*
* 13. Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
*     Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o
*     Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
*
*       a. salário bruto.
*       b. quanto pagou ao INSS.
*       c. quanto pagou ao sindicato.
*       d. o salário líquido.
*       e. calcule os descontos e o salário líquido, conforme a tabela abaixo:
*           Salário Bruto   = R$
*           IR (11%)        = R$
*           INSS (8%)       = R$
*           Sindicato ( 5%) = R$
*           Salário Liquido = R$
*/
public class Main {
    public static void main(String[] args) {

        Scanner scanner;
        double valorHora;
        int totalHoraDia;

        scanner = new Scanner(System.in);

        System.out.print("Valor por hora: R$ ");
        valorHora = scanner.nextDouble();

        System.out.print("Total de horas por dia: ");
        totalHoraDia = scanner.nextInt();

        System.out.println("\n\n--- Valores ---");
        System.out.print(String.format("\nValor de hora: R$ %.2f", valorHora)); // convertendo double para o formato string com 2 casas decimais
        System.out.print("\nTotal de hora por dia: " + totalHoraDia + " horas por dia");
        System.out.print(String.format("\nValor bruto por mês: R$ %.2f", (((valorHora * totalHoraDia) * 5) * 4)));
        System.out.print(String.format("\nValor pago no INSS: R$ %.2f", (((((valorHora * totalHoraDia) * 5) * 4) * 8) / 100)));
        System.out.print(String.format("\nValor líquido: R$ %.2f", ((((((valorHora * totalHoraDia) * 5) * 4)))) * (8 + 11 + 5) / 100));
    }
}

// Concluído