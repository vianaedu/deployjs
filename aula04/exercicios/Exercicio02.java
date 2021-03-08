package exercicios;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        int n1, n2, n3, menor;

        Scanner teclado = new Scanner(System.in);

        n1 = teclado.nextInt();
        n2 = teclado.nextInt();
        n3 = teclado.nextInt();

        menor = verMenor(n1, n2, n3);

        System.out.println("O menor numero é " + menor);

        teclado.close();

    }

    static int verMenor(int valor1, int valor2, int valor3) {
        int resposta;
        resposta = 0;

        if (valor1 < valor2) {
            if (valor1 <= valor3)
                resposta = valor1;
            return resposta;
        } else {
            if (valor2 < valor3) {
                resposta = valor2;
                return resposta;
            } else {
                resposta = valor3;
                return resposta;
            }
            
        }
        
    }
}
