package exercicios;

public class Exercicio01 {

    public static void main(String[] args) {
        int cont;
        final int LIMITE = 201; // 'final' declara constante - UTILIZAR MAIUSCULO POR PADRÃO

        cont = 100;

        while (cont < LIMITE) {
            System.out.print(cont + " ");
            cont++;
        }
        System.out.println("Valor final do contador: " + cont);
    }
}