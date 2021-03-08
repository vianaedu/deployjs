package exercicios;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {

        int n, cont, parSoma, par, impar, imparSoma;

        par = 0;
        impar = 0;
        parSoma = 0;
        imparSoma = 0;

        Scanner teclado = new Scanner(System.in);

        for (cont = 1; cont < 11; cont++) {
            System.out.println("Entre com o " + cont + "º numero");
            n = teclado.nextInt();

            if (n % 2 == 0) {
                par = par + 1;
                parSoma = parSoma + n;
            } else {
                impar = impar + 1;
                imparSoma = imparSoma + n;
            }
        }
        System.out.println("A media dos valores pares é: " + (parSoma / par));
        System.out.println("A porcentagem de impares entre os nº digitados é: " + 100 * impar / 10 + "%");
        
        teclado.close();
    }
}