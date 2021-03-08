package exercicios.exercicio03;

public class Poupança extends Conta {
    
    private double taxa;
    
    public Poupança(int numero, double saldo, double taxa) {
        super(numero, saldo);
        this.taxa = taxa;
        
    }

    @Override
    public String toString() {
        return super.toString() + " " + taxa;
        
    }

}
