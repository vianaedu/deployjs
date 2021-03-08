package exercicios;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
      
        double custoFabrica;
        double custoFinal;
  
 
        System.out.println("Digite o valor de custo de fábrica do veiculo:");
        custoFabrica = entrada.nextDouble();

        custoFinal = ((custoFabrica * 0.28) + (custoFabrica * 0.45) + custoFabrica);
    
        System.out.println("O custo final do veiculo para o consumidor é: " + custoFinal);
        System.out.println("O valor pago com impostos foi de: " + (custoFabrica * 0.45)) ;

        entrada.close();
        }    
    
}
