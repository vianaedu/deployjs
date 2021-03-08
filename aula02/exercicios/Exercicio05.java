package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {

        String senha;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a Senha");
        senha = teclado.nextLine();
      
        if (senha.equals("R10p5")) {
            System.out.println("Acesso concedido");
        } else {
            System.out.println("Acesso negado");
        }
        teclado.close();
    }
}
