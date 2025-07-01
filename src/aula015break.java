package br.com.project;

public class aula015break {

    public static void main(String[] args) {

        // Quebrando o looping i no 5 usando break:
        labelForI:
        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 10; j++) {
                System.out.println("\n o valor de i é: " + i + " o valor de j é: " + j);

                if (j == 5 && i == 0) {
                    break labelForI;
                }
            }
        }
    }
}
