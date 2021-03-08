package exercicios;

import java.util.Scanner;
public class Exercicio02 {
    public static void main(String[] args) {
        double n1, n2, media;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite duas notas");
        n1 = teclado.nextDouble();
        n2 = teclado.nextDouble();
        media = (n1 * 0.4 + n2 * 0.6);

        if (media >= 6.0) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        teclado.close();
    }
}
