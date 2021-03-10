package exemplos.exemplo01;

public class Especial extends Conta {
    
    private double limite;
    
    public Especial(int numero, double limite) {
        super (numero);
        this.limite = limite;
        
    }

    @Override
    public String toString() {
        return getNumero() + ": " + getSaldo() + " : " + limite;
    }

    @Override
    public boolean saque(double valor) {
        if (getSaldo() + limite >= valor){   // tem saldo  + LIMIE suficiente
        return super.saque(valor);
        }
        return false;
    }
     
}
