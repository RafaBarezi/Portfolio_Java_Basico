package br.com.project;

import java.util.Scanner;

public class aula007usoConstante {

    public static void main(String[] args) {

        // Declaração de uma constante em m/seg
        final double velSom = 340.28;
        System.out.println("Digite o tempo em segundos: ");
        Scanner in = new Scanner(System.in);
        int tempo = in.nextInt();
        System.out.println("Em " + tempo + " segundos, o som percorre " + tempo * velSom + " metros. Ou " + tempo * velSom / 1000 + " quilômetros.");

    }
}
