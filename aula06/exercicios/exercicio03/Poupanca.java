package exercicios.exercicio03;

public class Poupanca extends Conta {

    private static double taxaDeSaque; // atributo de CLASSE "palavra static"

    public Poupanca(int numero) {
        super(numero);

    }

    public static void setTaxaDeSaque(double taxa) {
        if (taxa > 0) {
            taxaDeSaque = taxa;
        }
    }

    @Override
    public boolean saque(double valor) {
        if (getSaldo() >= valor + taxaDeSaque) {
            return super.saque(valor + taxaDeSaque);

        }
        return false;

    }

}
