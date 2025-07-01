package br.com.project;

import java.util.Scanner;

public class aula003calculadora1 {

    public static void main(String[] args) {

        Scanner in = (new Scanner(System.in));
        int num1, num2, soma, sub, mult, div;

        System.out.println("Por favor digite um número");
        num1 = in.nextInt();

        System.out.println("Por favor digite outro número");
        num2 = in.nextInt();

        soma = num1 + num2;
        System.out.println("A soma dos números digitados é " + soma);
        sub = num1 - num2;
        System.out.println("A diferença dos números digitados é " + sub);
        mult = num1 * num2;
        System.out.println("A multiplicação dos números digitados é " + mult);
        div = num1 / num2;
        System.out.println("A divisão dos números digitados é " + div);

    }
}
