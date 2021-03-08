package exercicios;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        int cont, num;

        cont = 1;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Entre com um numero inteiro");
        num = teclado.nextInt();

        while (cont <= num) {
            if (cont <= num / 2){  // se não for o ultimo
                System.out.print(cont + ", ");
            } else {
                System.out.print(cont);
            }
            cont = cont * 2;
        }
        teclado.close();
    }
}