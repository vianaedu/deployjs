package exemplos;

public class Exemplo03 {
    public static void main(String[] args) {
        // tipo nome;
        int numero; //waring - amarelo

        numero = 10; //atribuição = guardar o valor na variável

        System.out.println("numero");
        System.out.println(numero);

        numero = 5; // sobrepoe o valor anterior
        System.out.println(numero);

        numero = 11 * 3;
        System.out.println(numero);


        System.out.println(numero + 2); // utiliza a variavel mas não altera
        System.out.println(numero);

        numero = numero + 2; // faz o calculo e armazena na variavel
        System.out.println(numero);
    }
}
