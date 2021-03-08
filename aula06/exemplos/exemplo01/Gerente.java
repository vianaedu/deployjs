package exemplos.exemplo01;

public class Gerente extends Funcionario {
    private int numeroFuncionarios;
    
    public Gerente(String nome, double salario, int numeroFuncionarios) {
        super(nome, salario);  // chamada ao construtor da classe base (superClasse)
        this.numeroFuncionarios = numeroFuncionarios;
    }
    public void setNumeroFuncionarios(int numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public int getNuemroFuncionarios() {
        return numeroFuncionarios;
    }

    @Override // sobreposição de método
    public String toString() {
        return super.toString() + " : " + numeroFuncionarios;
    }

    //sobescrever aumenta salário com 10% a mais
    @Override
    public void setAlteraSalario(double aumento) {
        super.setAlteraSalario(aumento + 10);
    }

}
