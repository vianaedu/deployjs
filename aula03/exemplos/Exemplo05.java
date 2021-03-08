package exemplos;

import java.util.Scanner;

public class Exemplo05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;

        System.out.println("Digite um valor inteiro menor que 10");
        numero = entrada.nextInt();

        // while (numero >=10) {
        // System.out.println("Digite um valor inteiro menor que 10");
        // numero = entrada.nextInt();
        // }

        do {
            System.out.println("Digite um valor inteiro menor que 10");
            numero = entrada.nextInt();
        } while (numero >= 10);
    }

}
