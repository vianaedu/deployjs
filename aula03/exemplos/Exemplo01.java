package exemplos;

/**
 * Exemplo01
 */
public class Exemplo01 {

    public static void main(String[] args) {
        int cont;

        cont = 2; // inicialização

        while(cont <= 10) {  // condição = valor final
            System.out.println(cont);
            // cont++; //cont = cont + 1;
            cont = cont + 2; // ou cont += 2;
        }
        System.out.println("Valor final do contador: " + cont);
    }
}