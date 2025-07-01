package br.com.project;

import java.util.Scanner;

public class aula002entradaDados {

    public static void main(String[] args) {

        System.out.println("Por favor, digite a idade do seu cãozinho");
        Scanner in = (new Scanner(System.in));

        int idadePet = in.nextInt();  
        idadePet = idadePet * 7;  

        System.out.println("Seu pet tem " + idadePet + " anos em idade de humanos.");

    }

}
