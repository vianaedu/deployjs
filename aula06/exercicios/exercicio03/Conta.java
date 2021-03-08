package exercicios.exercicio03;

public class Conta {

    private int numero;
    private double saldo;

    public Conta(int numero) {
        this.numero = numero;
    
    }

    public void deposito(double valor) {
        if (valor > 0) {
            saldo = saldo + valor;
        }
    }

    public void saque(double valor) {
        if (valor > 0){
            saldo -= valor;

    }
}

    @Override
    public String toString() {
        return numero + ": " + saldo;
    }

}
