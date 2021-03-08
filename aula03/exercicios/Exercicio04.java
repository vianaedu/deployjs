package exercicios;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        int num, soma;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Entre com um numeros inteiros");

        num = teclado.nextInt();
        soma = num;

        while (num != 0) {
            num = teclado.nextInt();
            soma = soma + num;
        }
        System.out.print("A soma dos valores é: " + soma);

        teclado.close();
    }
}