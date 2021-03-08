package exercicios.exercicio05;

public class Ebook {
    // atributos
    private String titulo, autor;
    private int totalPag, pagAtual;

    // métodos contrutor
    public Ebook(String titulo, String autor, int totalPag, int pagAtual) {

        this.titulo = titulo;
        this.autor = autor;
        this.totalPag = totalPag;
        
        setPagina(pagAtual);

    }

    public void apresentarAtu() {
        System.out.println("Pagina Atual " + pagAtual);
    }

    public void apresentarAvan(int avancPag) {
        pagAtual = pagAtual + avancPag;
        System.out.println("Avançou para pagina " + pagAtual);
    }

    public void apresentarRet(int retPag) {
        pagAtual = pagAtual - retPag;
        System.out.println("Retornou para pagina " + pagAtual);
    }

    public void setPagina(int pagAtual) {
        if (pagAtual >= 0 && pagAtual <= totalPag) {
            this.pagAtual = pagAtual;
            if (pagAtual == 0) {
                System.out.println("Título " + titulo);
                System.out.println("Autor " + autor);
                System.out.println("Total de Paginas " + totalPag);
            }
        } else {
            System.out.println("Pagina Atual " + pagAtual);

        }

    }
}