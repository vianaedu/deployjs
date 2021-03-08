package exercicios;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner entra1 = new Scanner(System.in);
        Scanner entra2 = new Scanner(System.in);
        double nota1;
        double nota2;
        System.out.println("Digite a primeira nota:");
        nota1 = entra1.nextDouble();

        System.out.println("Digite a segunda nota:");
        nota2 = entra2.nextDouble();

        System.out.println("A media é: " + (nota1 + nota2) / 2);

        entra1.close();
        entra2.close();
    }    
    
}
