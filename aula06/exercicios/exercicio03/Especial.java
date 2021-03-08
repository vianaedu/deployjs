package exercicios.exercicio03;

public class Especial extends Conta {
    
    private double limite;
    
    public Especial(int numero, double saldo, double limite) {
        super(numero, saldo);
        this.limite = limite;
        
    }

    @Override
    public String toString() {
        return super.toString() + " " + limite;
        
    }

}
