package exercicios;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        
        int n;
        char resultado;

        Scanner teclado = new Scanner(System.in);

        n = teclado.nextInt();

            resultado = verifPar(n);

        if (resultado == 'p') {

            System.out.println("par");
        } else {
            System.out.println("impar");
        }

        teclado.close();
        
    }

    static char verifPar(int valor) {
        char resposta;

        if (valor % 2 == 0) {
            resposta = 'p';
            return resposta;
        } else {
            resposta = 'i';
            return resposta;
        }
    
    }
    
}
