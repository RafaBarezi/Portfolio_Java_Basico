package br.com.project;

import java.util.Scanner;

public class aula005calculadora2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite 1 para somar");
        System.out.println("\nDigite 2 para subtrair");
        System.out.println("\nDigite 3 para multiplicar");
        System.out.println("\nDigite 4 para dividir");
        int operacao = in.nextInt();

        if (operacao != 1 && operacao != 2 && operacao != 3 && operacao != 4) {
            System.out.println("\nVocê escolheu uma opção inválida");
            return; // Adicionando um return para sair se a operação for inválida
        }

        System.out.println("\nDigite um número");
        double num1 = in.nextDouble();

        System.out.println("\nDigite outro número");
        double num2 = in.nextDouble();

        String resultado = (operacao == 1) ? "\nO resultado da soma é " + (num1 + num2)
                : (operacao == 2) ? "\nO resultado da subtração é " + (num1 - num2)
                        : (operacao == 3) ? "\nO resultado da multiplicação é " + (num1 * num2)
                                : "\nO resultado da divisão é " + (num1 / num2);

        System.out.println(resultado);
    }
}
