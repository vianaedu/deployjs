package exemplos.exemplo03;

public class AppPessoa {
    public static void main(String[] args) {
        Pessoa p  = new Pessoa("Eduardo", 5000); // instanciando um objeto do tipo Pessoa
        Pessoa p2  = new Pessoa("Diego", 3000);

        p.apresentar();

        p2.apresentar();

    }
}
