package exercicios;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {

        int n, cont, par, impar;

        par = 0;
        impar = 0;

        Scanner teclado = new Scanner(System.in);

        for (cont = 1; cont < 11; cont++) {
            System.out.println("Entre com o " + cont + "º numero");
            n = teclado.nextInt();
            if (n % 2 == 0) {
                par = par + 1;
            } else {
                impar = impar + 1;
            }
        }
        System.out.println("Total de pares: " + par);
        System.out.println("Total de impares: " + impar);
        teclado.close();
    }
}