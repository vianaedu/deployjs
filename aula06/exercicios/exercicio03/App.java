package exercicios.exercicio03;

public class App {
    public static void main(String[] args) {

        Poupanca cp = new Poupanca(333);
        Poupanca.setTaxaDeSaque(0.15);

                if(cp.deposito(100)){
            System.out.println("deposito realizado");
        } else {
            System.out.println("Falha na Operação");
        }

        if (cp.saque(99.85)){
            System.out.println("Saque realizado");
        } else {
            System.out.println("O Saque não foi realizado");
        }
            
        System.out.println(cp);
    }

}
