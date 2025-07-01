package br.com.project;

import java.util.Scanner;

public class aula014operadoresTernarios {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Digite o número do seu dia da semama favorito");

        int num = in.nextInt();
        String dia = (num == 1) ? "Domingo"
                : (num == 2) ? "Segunda-feira"
                        : (num == 3) ? "Terça-feira"
                                : (num == 4) ? "Quarta-feira"
                                        : (num == 5) ? "Quinta-feira"
                                                : (num == 6) ? "Sexta-feira"
                                                        : (num == 7) ? "Sábado" : "opção inválida";

        System.out.println("O dia escolhido foi " + dia);

/* ou poderia ser usando swith case, que é mais recomendado: 
        switch (num) {

            case 1:
                dia = "Domingo";
            case 2:
                dia = "Segunda-feira";
            case 3:
                dia = "Terça-feira";
            case 4:
                dia = "Quarta-feira";
            case 5:
                dia = "Quinta-feira";
            case 6:
                dia = "Sexta-feira";
            case 7:
                dia = "Sábado";
            default:
                dia = "Opção inválida";

        }
*/ 

    }

}
