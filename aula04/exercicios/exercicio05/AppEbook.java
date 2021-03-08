package exercicios.exercicio05;

public class AppEbook {
    public static void main(String[] args) {
        Ebook eletBook  = new Ebook ("Palmeiras tem Mundial","Desconhecido", 100, 7);

        eletBook.apresentarAtu();
        eletBook.apresentarAvan(10);
        eletBook.apresentarRet(5);

    }
}
