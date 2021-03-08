package uri;

import java.util.Scanner;

public class Uni1037 {
    public static void main(String[] args) {
        double valor;

        Scanner teclado = new Scanner(System.in);

        valor = teclado.nextDouble();

        if (valor >= 0 && valor <= 25) {
            System.out.println("Intervalo [0,25]");
        } else {
            if (valor > 25.0 && valor <= 50) {
                System.out.println("Intervalo (25,50]");
            } else {
                if (valor > 50.0 && valor <= 75) {
                    System.out.println("Intervalo (50,75]");
                } else {
                    if (valor > 75.0 && valor <= 100) {
                        System.out.println("Intervalo (75,100]");
                    } else {
                        System.out.println("Fora de intervalo");
                    }
                }
            }   
        }
        teclado.close();
    }
}