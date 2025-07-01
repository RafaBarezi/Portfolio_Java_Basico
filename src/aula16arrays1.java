package br.com.project;

public class aula16arrays1 {

    public static void main(String[] args) {

        int[] array = {78, 20, 56, 89, 1};
        System.out.printf("%s%8s\n", "Índice", "Valores");

        // para saber o tamanho da array, imprimindo todos os elementos:
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%5s%8d\n", i, array[i]);
      
        }
    }
}
