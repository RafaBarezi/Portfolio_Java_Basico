package br.com.project;

public class aula19mediaArrays {

    public static void main(String[] args) {

        int[] num = new int[5];
        

        num[0] = 10;
        num[1] = 10;
        num[2] = 10;
        num[3] = 10;
        num[4] = 10;

        float media = 0;

        for (int i = 0; i < num.length; i++) {
            media += num[i];
        }

        float total = media / num.length;
        System.out.println(" A média é: " + total);

    }

}
