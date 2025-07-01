package br.com.project;

public class aula25manipulandoPlanilhas {

    public static void main(String[] args) {

        double[][] planilha = {
            {10, 10, 10, 10, 10, 0},
            {10, 10, 10, 10, 10, 0},
            {10, 10, 10, 10, 10, 0},
            {10, 10, 10, 10, 10, 0},
            {10, 10, 10, 10, 10, 0}
        };

        double somaTotal = 0;

        for (int x = 0; x < 5; x++) { // percorrendo todas as linhas 
            for (int y = 0; y < 5; y++) { // percorrendo todas as colunas
                // para somar os valores com 0 no final da linha: 
                planilha[x][5] += planilha[x][y];
            }
            somaTotal += planilha[x][5]; // Somando o valor já calculado com a ultima coluna 
        }

        // Imprimindo os resultados
        for (int x = 0; x < 5; x++) { // temos a 6 coluna, mas não a sexta linha , por isso aqui é 5 
            String str = "";
            for (int y = 0; y < 6; y++) {
                if (y < 5) {
                    str += planilha[x][y] + ", ";
                } else {
                    str += planilha[x][y];
                }

            }

            System.out.println(str);

        }

        System.out.printf("\nA soma total é: %.0f\n", +somaTotal);
    }
}
