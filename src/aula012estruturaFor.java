package br.com.project;

public class aula012estruturaFor {

    public static void main(String[] args) {

        // O laço for serve para quando sabemos a quantidade de vezes que o laço será repetido
        for (int i = 1; i <= 10; ++i) {

            // (Definição da variável; condição; incrememto)
            System.out.println(i);
        }

        // Seria possível fazer o mesmo com while
        int x = 0;

        while (x <= 10) {
            ++x;
            System.out.println(x);
            
        }
    }
}
