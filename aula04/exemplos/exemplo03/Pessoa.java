package exemplos.exemplo03;

public class Pessoa {
    // atrubutos
    String nome;
    double salario;

    
    // métodos

    // métodos contrutor = inicializar o objeto
    Pessoa(String n, double s){
        nome = n;
        salario = s;

    }
    void apresentar(){
        System.out.println("Ola! Eu sou " + nome + " e ganho " + salario);
    }
}
