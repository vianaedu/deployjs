package exercicios.exercicio03;

public class Corrente extends Conta {
    
    private final double TAXA_DEPOSITO = 0.1;
    
    public Corrente(int numero) {
        super (numero);

    }

    @Override    
        public void deposito(double valor) {
            super.deposito(valor - TAXA_DEPOSITO);
            }
        }
    
        public void saque(double valor) {
            if (valor > 0){
                saldo -= valor;
    
        }

        public void valida(double valor) {
            if (saldo >= (saldo -=valor)){


    
        }
            }

    @Override
    public String toString() {
        return super.toString() + numero + " " + saldo;
        
    }

}
