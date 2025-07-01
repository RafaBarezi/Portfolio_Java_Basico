package br.com.project;

import java.util.Random;

public class aula013numerosAleatorios {

    public static void main(String[] args) {

        Random num = new Random();
        System.out.println("\nO numero aleatório sorteado é: " + num.nextInt());

        // Para definir um intervalo de números a escolher: 
        System.out.println("\nO numero aleatório sorteado entre 0 e 9 : " + num.nextInt(9) + "\n");

        // Para gerar um loping com 5 números aleatórios inteiros: 
        for (int i = 0; i <= 5; i++) {
            System.out.println(num.nextInt(6));
        }

        System.out.println("\n");

        // Para gerar um loping com 5 números aleatórios double entre 0 e 30 
        for (int j = 0; j < 5; j++) {
            System.out.println(num.nextDouble() * 30);
        }

        System.out.println("\n");

        // Para gerar um loping com 5 números aleatórios double entre 20 e 50: 
        for (int k = 0; k < 5; k++) {
            System.out.println(num.nextDouble() * 30 + 20);
        }

        System.out.println("\n");

        // Para gerar um loping com 5 valores boleanos aleatórios double entre 20 e 50: 
        for (int l = 0; l < 5; l++) {
            System.out.println(num.nextBoolean());
            
        }
    }
}
