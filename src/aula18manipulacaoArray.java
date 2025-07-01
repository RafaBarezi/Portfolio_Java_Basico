package br.com.project;

import java.util.Arrays;
import java.util.Scanner;

public class aula18manipulacaoArray {

    public static void main(String[] args) {

        /*
        *
        * Fazer um programa que peça para o usuário informar 7 números e armazene-os em uma Array. Depois:
        *
        * Some todos os números e exiba na tela
        * Multiplique o índice pelo seu valor
        * Calcule a média aritmética
        *
        */

        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[7];
        double soma = 0;
        double soma_mult = 0;
        
        // Pedindo os números e armazenando no array
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "° número : ");
            numeros[i] = scanner.nextDouble();
            soma += numeros[i]; // já soma aqui
        }

        // Imprimindo os arrays de forma linear
        System.out.println("\nVocê digitou os seguintes números: " + Arrays.toString(numeros));

        // Exibindo a soma
        System.out.println("\nSoma dos números é " + soma);

        // Multiplicando índice pelo valor
        System.out.println("\nMultiplicação de índice pelo valor:");
        for (int i = 0; i < numeros.length; i++) {
            double multiplicacao = i * numeros[i];
            System.out.println("Índice " + i + " * multiplicado por " + numeros[i] + " = " + multiplicacao);
            soma_mult += multiplicacao;
        }

        // Exibindo a multiplicação
        System.out.println("\nSoma dos números é " + soma_mult);

        // Calculando a média
        double media_soma = (double) soma / numeros.length;
        System.out.printf("\nMédia dos valores somados: %.0f\n", media_soma);

        double media_mult = (double) soma_mult / numeros.length;
        System.out.printf("\nMédia dos valores multiplicados: %.0f\n", media_mult);


        scanner.close();

    }

}
