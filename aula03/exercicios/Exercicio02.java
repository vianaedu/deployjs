package exercicios;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        int cont, num;

        cont = 0;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Entre com um numero inteiro");
        num = teclado.nextInt();

        while (cont < 11) {
            System.out.println(num + " x " + cont + " = " + (num * cont));
            cont++;
           // outra forma - System.out.printf("%d x %02d = %2d\n", num, cont, (num * cont)); 
        }
        teclado.close();
    }
}