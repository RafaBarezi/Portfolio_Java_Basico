package br.com.project;

import java.util.Arrays;

public class aula22ciclosAninhados {

    public static void main(String[] args) {

        
        // Trabalhando um ciclo dentro do outro 
        int[] valores = new int[5];
              
        for (int i = 0; i < 5; i++) {
            valores[i] = i;
        }
        
        System.out.println(valores[0]);
        System.out.println(valores[1]);
        System.out.println(valores[2]);
        System.out.println(valores[3]);
        System.out.println(valores[4]);

        // Se quiser imprimir todos os valores mais rapidinho, pode usar Arrays.toString():

        System.out.println("\n");
        System.out.println(Arrays.toString(valores));
        System.out.println("\n");

        // Trabalhando agora com ciclo alinhados 

        int[][] valoresalinhados = new int [5][5];
        for (int x = 0; x < 5; x++) {
            for(int y= 0; y < 5; y++){
            valoresalinhados[x][y] = 5; // Estipulando que todos os elemento serão iniciados como 5
            }
        }

        // Amostra provando que foi atribuido 5: 
        System.out.println(valoresalinhados[0][0]);
        System.out.println(valoresalinhados[1][0]);
        System.out.println(valoresalinhados[2][0]);
        System.out.println(valoresalinhados[3][0]);
        System.out.println(valoresalinhados[4][0]);

    }
}
