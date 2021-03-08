package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        double n1, n2;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Entre dois numeros");
        n1 = teclado.nextDouble();
        n2 = teclado.nextDouble();

        if (n1 > n2) {
            System.out.println(n1);
            System.out.println(n2);
        } else {
            System.out.println(n2);
            System.out.println(n1);
        }

        teclado.close();
    }
}
