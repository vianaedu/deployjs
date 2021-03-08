package exercicios;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        Scanner salario = new Scanner(System.in);
      
        double sal;
 
        System.out.println("Digite seu salario atual:");
        sal = salario.nextDouble();

        System.out.println("Parabéns vc recebeu um aumento de 25%");
        System.out.println("Seu salário agora é: " + sal*1.25) ;

        salario.close();
        }    
    
}
