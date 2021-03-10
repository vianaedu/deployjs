package exemplos.exemplo01;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao;
        int numeroConta;
        double limite, valorDeposito, valorSaque;
        Especial ce = null;

        GerenciaContas contas = new GerenciaContas();

        do {
            System.out.println("1 - Nova Conta Corrente");
            System.out.println("2 - Nova Conta Especial");
            System.out.println("3 - Nova Conta Poupança");
            System.out.println("4 - Fazer Depósito");
            System.out.println("5 - Fazer Saque");
            System.out.println("6 - Verificar Saldo");
            System.out.println("7 - Sair");
            System.out.println("==> ");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Informe o número da Conta: ");
                    numeroConta = teclado.nextInt();
                    contas.novaContaCorrente(numeroConta);

                    break;

                case 2:
                    System.out.println("Informe o número da Conta: ");
                    numeroConta = teclado.nextInt();
                    System.out.println("Informe o limite da Conta: ");
                    limite = teclado.nextDouble();

                    break;

                case 3:
                    System.out.println("Informe o número da Conta: ");
                    numeroConta = teclado.nextInt();
                    contas.novaContaPoupanca(numeroConta);
                    break;

                case 4:
                    System.out.println("Informe o número da Conta para Deposito");
                    numeroConta = teclado.nextInt();

                    System.out.println("Informe o valor do Depósito");
                    valorDeposito = teclado.nextDouble();

                    if (contas.deposito(numeroConta, valorDeposito)) {
                        System.out.println("Deposito Realizado");
                    } else {
                        System.out.println("Falha na Operação");
                    }
                    break;

                case 5:
                    System.out.println("Informe o número da Conta para Saque");
                    numeroConta = teclado.nextInt();

                    System.out.println("Informe o valor do Saque");
                    valorSaque = teclado.nextDouble();

                    if (contas.saque(numeroConta, valorSaque)) {
                        System.out.println("Saque Realizado");
                    } else {
                        System.out.println("Falha na Operação");
                    }
                    break;

                case 6:
                    System.out.println("Informe o número da Conta: ");
                    numeroConta = teclado.nextInt();

                    System.out.println(contas.exibirSaldo(numeroConta));

                    break;

                case 7:

                    break;

                default:
                    System.out.println("Opção inválida");
                    break;

            }
        } while (opcao != 7);

        teclado.close();

    }
}
