package exercicios.exercicio03;

public class App {
    public static void main(String[] args) {

        Conta conta = new Conta(111);

        conta.deposito(500);
        conta.saque(300);
            
        System.out.println(conta);
        }
}
