package br.com.project;

import java.util.Scanner;

public class aula004tomadaDeDecisoes {

    public static void main(String[] args) {

        int num;
        System.out.println("Digite o número 1:");
        Scanner in = new Scanner(System.in);
        num = in.nextInt();

        String mensagem = (num == 1) ? "Você digitou o número 1" : "O número digitado não é 1";
        System.out.println(mensagem);

    }
}
