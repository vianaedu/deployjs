package exemplos.exemplo01;

import java.util.ArrayList;

public class GerenciaContas_old {
    private ArrayList<Conta> listaDeContas;

    public GerenciaContas_old() {
        listaDeContas = new ArrayList<>();
    }

    public void novaContaCorrente(int numeroConta) {
        Corrente cc = null;
        cc = new Corrente(numeroConta);
        listaDeContas.add(cc);
    }

    public void novaContaEspecial(int numeroConta, double limite) {
        Especial ce = null;
        ce = new Especial(numeroConta, limite); 
        listaDeContas.add(ce);

    }

    public void novaContaPoupanca(int numeroConta) {
        listaDeContas.add(new Poupanca(numeroConta));

    }

    public boolean deposito(int numeroConta, double valorDeposito) {
        for (Conta conta : listaDeContas) { 
            if (conta.getNumero() == numeroConta) {
                return conta.deposito(valorDeposito);
            }
        }
        return false; // não achou a conta
    }

    public boolean saque(int numeroConta, double valorSaque) {
        for (Conta conta : listaDeContas) { 
            if (conta.getNumero() == numeroConta) {
                return conta.saque(valorSaque);
            }
        }
        return false; // não achou a conta
    }

    public String exibirSaldo(int numeroConta) {
        for (Conta conta : listaDeContas) { 
            if (conta.getNumero() == numeroConta) {
                return conta.toString();
            }
        }
        return "Conta não Encontrada";

    }
}
