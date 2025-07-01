package br.com.project;

import java.util.Scanner;

public class aula008operadoresIgualdade {

    public static void main(String[] args) {

        final int idadeCrianca, idadeAdolescente, idadeJovem, idadeAdulto, idadeIdoso;

        idadeCrianca = 0;
        idadeAdolescente = 13;
        idadeJovem = 18;
        idadeAdulto = 30;
        idadeIdoso = 65;

        Scanner in = new Scanner(System.in);
        System.out.println("Por favor, digite sua idade: ");

        int idade = in.nextInt();

        String faixaEtaria
                = idade >= idadeIdoso ? "Você é idoso"
                        : idade >= idadeAdulto ? "Você é adulto"
                                : idade >= idadeJovem ? "Você é jovem"
                                        : idade >= idadeAdolescente ? "Você é adolescente"
                                                : "Você é criança";

        System.out.println(faixaEtaria);

    }
}
