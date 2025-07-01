package br.com.project;

public class aula20arraysMultidimencionais {

    public static void main(String[] args) {

        int[][] nums_tabela = new int[3][3];

        nums_tabela[0][0] = 10;
        nums_tabela[1][1] = 20;
        nums_tabela[2][2] = 30;

        System.out.println(nums_tabela[0][0]);

        for (int i = 0; i < nums_tabela[0].length; i++) {
            System.out.println(nums_tabela[0][i]);
            System.out.println("\n");

        }
    }
}
