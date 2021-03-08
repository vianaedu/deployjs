package exercicios.exercicio02;

public abstract class Pessoa {
    
    private String nome, telefone;
    
    public Pessoa(String nome, String telefone) {
            this.nome = nome;
            this.telefone = telefone;
    }

    @Override
    public String toString() {
        return nome + " " + telefone;
    }
}
