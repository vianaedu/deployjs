package exercicios.exercicio02;

public class Estudante extends Pessoa {
    
    private String curso;
    
        public Estudante(String curso, String nome, String telefone) {
            super(nome, telefone);
        this.curso = curso;
        
    }
     
    @Override
    public String toString() {
        return super.toString() + " " + curso;
    }
}
