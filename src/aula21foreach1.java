package br.com.project;

public class aula21foreach1 {

    public static void main(String[] args) {

        int[] lista = new int[3];

        lista[0] = 10;
        lista[1] = 20;
        lista[2] = 30;

        for (int item : lista) {
            System.out.println(item);
        }
    }
}
