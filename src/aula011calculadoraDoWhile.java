package br.com.project;

import java.util.Scanner;

public class aula011calculadoraDoWhile {

    public static void main(String[] args) {

        int x = 0;
        double num1, num2, resultado;

        num1 = num2 = resultado = 0;

        Scanner in = new Scanner(System.in);

        do {
            System.out.println("\nEscolha a operação desejada:\n");

            System.out.println(" 1 para somar");
            System.out.println(" 2 para subtrair");
            System.out.println(" 3 para multiplicar");
            System.out.println(" 4 para dividir");
            System.out.println(" \n 5 para sair do sistema\n");

            x = in.nextInt();

            if (x == 5) {
                System.out.println("\nVocê está saindo do sistema");
                break; // saindo do laço
            }

            if (x < 1 || x > 5) {
                System.out.println("\nOpção inválida!");
                continue; // ele volta para o laço
            }

            if (x != 5) {
                System.out.println("Digite o primeiro número:");
                num1 = in.nextDouble();
                System.out.println("Digite o segundo número:");
                num2 = in.nextDouble();

                if (x == 1) {
                    resultado = num1 + num2;
                } else if (x == 2) {
                    resultado = num1 - num2;
                } else if (x == 3) {
                    resultado = num1 * num2;
                } else if (x == 4) {
                    if (num2 == 0) {
                        System.out.println("\nNão é possível dividir por zero!\n");
                        continue;
                    }
                    resultado = num1 / num2;
                }

                System.out.println("O resultado é: " + resultado);
            }

        } while (true);// laço infinito controlado por break
    }
}
