package br.com.project;

public class aula23foreach2 {

    public static void main(String[] args) {

        int[] lista = new int[5];

        lista[0] = 10;
        lista[1] = 20;
        lista[2] = 30;
        lista[3] = 40;
        lista[4] = 50;

        // Calculando a média
        int soma = 0;
        for (int item : lista) {
            soma += item;
        }

        float media = (float) soma / lista.length;
        System.out.println("A média aritmética é: " + media);

        // Encontrando o menor valor e o maio valor 
        int menor = lista[0];
        int maior = lista[0];

        for (int item : lista) {
            if (item < menor || menor == 0) {
                menor = item;
            }
            if (item > maior) {
                maior = item;
            }
        }

        System.out.println("O menor valor da lista é: " + menor);
        System.out.println("O maior valor da lista é: " + maior);
    }

}
