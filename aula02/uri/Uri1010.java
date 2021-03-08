package uri;

import java.util.Scanner;

public class Uri1010 {
    public static void main(String[] args) {
        
    Scanner teclado = new Scanner(System.in);    

    int peca1, npeca1, peca2, npeca2;
    Double vpeca1, vpeca2, vtotal;

    peca1 = teclado.nextInt();
    npeca1 = teclado.nextInt();
    vpeca1 = teclado.nextDouble();
    peca2 = teclado.nextInt();
    npeca2 = teclado.nextInt();
    vpeca2 = teclado.nextDouble();

    vtotal = (npeca1 * vpeca1) + (npeca2 * vpeca2);

    System.out.printf("VALOR A PAGAR: R$ %.2f\n", vtotal); 

    teclado.close();

    }
}
