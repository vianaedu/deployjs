package exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n;

        System.out.println("Digite um numero inteiro:");
        n = teclado.nextInt();

        if (n > 20) {
            System.out.println("Metade = " + (n / 2.0));
        }

        System.out.println("final do programa");
    
        teclado.close();
    }
}
