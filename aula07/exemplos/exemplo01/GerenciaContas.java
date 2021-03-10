package exemplos.exemplo01;


import java.util.HashMap;

public class GerenciaContas {
    private HashMap<Integer, Conta> mapaDeContas;

    public GerenciaContas() {
        mapaDeContas = new HashMap<>();
    }

    public void novaContaCorrente(int numeroConta) {
        mapaDeContas.put(numeroConta, new Corrente(numeroConta));
    }

    public void novaContaEspecial(int numeroConta, double limite) {
       mapaDeContas.put(numeroConta, new Especial(numeroConta, limite));

    }

    public void novaContaPoupanca(int numeroConta) {
        mapaDeContas.put(numeroConta, new Poupanca(numeroConta));

    }

    public boolean deposito(int numeroConta, double valorDeposito) {

        Conta conta = mapaDeContas.get(numeroConta);

        if (conta != null){
            return conta.deposito(valorDeposito);
        }
        return false;
    }

    public boolean saque(int numeroConta, double valorSaque) {
        
        Conta conta = mapaDeContas.get(numeroConta);

        if (conta != null){
            return conta.saque(valorSaque);
        }
        return false;
    }

    public String exibirSaldo(int numeroConta) {

        Conta conta = mapaDeContas.get(numeroConta);

        if (conta != null){
            return conta.toString();
        }
        return "Conta não Encontrada";

    }
}
