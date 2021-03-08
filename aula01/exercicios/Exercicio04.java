package exercicios;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        Scanner sal = new Scanner(System.in);
        Scanner watts = new Scanner(System.in);
        double salario;
        double kwatts;
        System.out.println("Digite o valor do salário minimo:");
        salario = sal.nextDouble();

        System.out.println("Digite o valor de quilowatts consumido:");
        kwatts = watts.nextDouble();

        System.out.println("O valor de cada quilowatts: " + salario / 500);
        System.out.println("O valor a ser pago é: " + ((salario / 500) * kwatts));
        System.out.println("O valor a ser pago com desconto de 15% é: " + ((salario / 500) * kwatts) * 0.85);


        sal.close();
        watts.close();
    }    
    
}
