package exercicio.exercicio01;

public class App {
    public static void main(String[] args) {
        Placar p1 = new Placar();
        Placar p2 = new Placar("Palmeiras", "Gremio");
        Placar p3 = new Placar("Palmeiras", "Gremio", 1, 5);
        
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
 
    }
}
