package exemplos.exemplo02;

import java.util.ArrayList;

public class Exemplo02 {
    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<>();

        lista.add(10);
        lista.add(56);
        lista.add(23);
        lista.add(76);

        System.out.println(lista);

        System.out.println(lista.get(1));

        for (int i = 0; i < lista.size(); i++) {
            System.out.println("procurando no indice " + i);    
            if (lista.get(i) == 23) {
                System.out.println("Achei no indice : " + i);
                break; // intrrompe o laço nesse for
            }
        }

        for (Integer numero : lista) { // para cada "numero" da "lista" faça...
            if(numero == 56){
                System.out.println("Achei");
            }
            System.out.println(numero);
            
        }
    }
}