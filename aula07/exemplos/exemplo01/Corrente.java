package exemplos.exemplo01;

public class Corrente extends Conta {
    
    private final double TAXA_DEPOSITO = 0.1;
    
    public Corrente(int numero) {
        super (numero);

    }

    @Override    
        public boolean deposito(double valor) {
            return super.deposito(valor - TAXA_DEPOSITO);
        }
            
    @Override
        public boolean saque(double valor) {
            if (getSaldo() >=valor){   // tem saldo suficiente
            return super.saque(valor);
            }
            return false;
        }
  
}
