package uri;

public class Uri1059 {

    public static void main(String[] args) {
        int cont;
        final int LIMITE = 100;

        cont = 1;

        while (cont <= LIMITE) {
            if (cont % 2 == 0) {
                System.out.println(cont);
                cont++;
            } else {
                cont++;
            }
        }

    }
}