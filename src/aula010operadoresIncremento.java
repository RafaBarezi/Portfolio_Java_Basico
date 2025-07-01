package br.com.project;

public class aula010operadoresIncremento {

    public static void main(String[] args) {

        // Servem para melhorar estética e performance
        int a = 0;
        int b = 0;

        // ++a; operador de pré-incremento - incrementa antes da instrução
        System.out.println(a);
        System.out.println(++a);

        // ++b; operador de pós-incremento - incrementa depois da instrução
        System.out.println(b++);
        System.out.println(b);

        int x = 0;
        int y = 0;

        // ++x; operador de pré-decremento - decrementa antes da instrução
        System.out.println(x);
        System.out.println(--x);

        // ++y; operador de pré-decremento - decrementa antes da instrução
        System.out.println(y--);
        System.out.println(y);
    }

}
