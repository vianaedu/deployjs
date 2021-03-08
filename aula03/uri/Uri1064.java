package uri;

import java.util.Scanner;

public class Uri1064 {

    public static void main(String[] args) {

        double num, soma;
        int positivo, cont;

        Scanner teclado = new Scanner(System.in);

        positivo = 0;
        soma = 0;
        cont = 0;

        while (cont < 6) {
            num = teclado.nextInt();
            if (num >= 0) {
                positivo ++;
                soma = soma + num;
                cont ++;
            } else {
                cont++;
            }
        }
      
        System.out.println(positivo + " valores positivos");
        System.out.println(soma / positivo);

        teclado.close();
    }
}