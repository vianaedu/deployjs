package exercicios.exercicio02;

public class App {
    public static void main(String[] args) {

        // Pessoa pe = new Pessoa("Jose", "0000-0000");
        Estudante es = new Estudante("Orientrada a Objeto" , "Eduardo", "1111-1111");
        Professor pr = new Professor("Emersson" , "2222-2222" , 30000);
         
        // System.out.println("Aluno: " + pe);
        System.out.println("Curso: " + es);
        System.out.println("Salario do Professor: " + pr);
        
    }
}
