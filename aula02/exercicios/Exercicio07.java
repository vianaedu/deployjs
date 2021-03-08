package exercicios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
       
        Scanner teclado = new Scanner(System.in);
        double lado1, lado2, lado3;

        System.out.println("Entre os 3 lados");
        lado1 = teclado.nextDouble();
        lado2 = teclado.nextDouble();
        lado3 = teclado.nextDouble();

        if (lado1 > (lado2 + lado3) || lado2 > (lado1 + lado3) || lado3 > (lado1 + lado2)){
            System.out.println("Não formam triangulo");
        } else {
            if ((lado1 == lado2) && (lado2 == lado3)) {
                System.out.println("Formam triangulo equilátero");
            } else {
                if ((lado1 == lado2) || (lado2 == lado3) || (lado1 == lado3)) {
                    System.out.println("Formam um triangulo isóceles");
                } else {
                    System.out.println("Formam um triangulo escaleno");
                }
            }
        }
        teclado.close();
    }
}
