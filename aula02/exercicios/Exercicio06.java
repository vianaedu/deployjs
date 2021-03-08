package exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        double salario;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o salario");
        salario = teclado.nextDouble();
        if (salario > 2000) {
            System.out.println("Desconto INSS 30%");
        } else {
            if (salario > 1200) {
                System.out.println("Desconto INSS 25%");
            } else {
                if (salario > 600) {
                    System.out.println("Desconto INSS 20%");
                } else {
                    System.out.println("Isento de Desconto INSS");
                }
            }
        }
        teclado.close();
    }
}
