package br.com.project;

public class aula17arrays2 {

    public static void main(String[] args) {

        int[] x = new int[7];

        x[0] = 10;
        x[1] = 20;
        x[2] = 30;
        x[3] = 40;
        x[4] = 50;
        x[5] = 60;
        x[6] = 70;

        int soma = x[0] + x[1] + x[2];

        System.out.println("\nA soma dos três primeiros elementos é: " + soma);

        // Para somar todos os ítens do array:
        int soma2 = 0;
        for (int i = 0; i < 7; i++) {
            soma2 += x[i];
        }
        System.out.println("\nA soma de todos os elementos é: " + soma2);

    }

}
