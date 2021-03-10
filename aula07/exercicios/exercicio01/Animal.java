package exercicios.exercicio01;

public class Animal {

    private String nome, raca, cor, 
    private int anoNascimento;
    private Proprietario proprietario;

    public Animal(String nome, String raca, String cor, int anoNascimento, Proprietario proprietario) {
        this.nome = nome;
        this.raca = raca;
        this.cor = cor;
    }

    @Override
    public String toString() {
        return nome + " " + telefone;
    }
    
}
