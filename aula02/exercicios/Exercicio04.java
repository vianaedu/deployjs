package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        double salario, prestacao, limite;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o salario e o valor da prestacao");
        salario = teclado.nextDouble();
        prestacao = teclado.nextDouble();

        limite = salario * 0.30;

        boolean teste;

        teste = limite >= prestacao;

        if(teste == true) {
            System.out.println("Emprestimo Concedido");
        } else {
            System.out.println("Emprestimo Recusado");
        }

        teclado.close();
    }
}
