package exercicios.exercicio01;

/**
 * Placar
 */
public class Placar {

    private String time1, time2;
    private int golsTime1, golsTime2;

    public Placar() {
        this.time1 = "Time da casa";
        this.time2 = "Time Visitante";

    }

    public Placar(String time1, String time2) {
        this.time1 = time1;
        this.time2 = time2;

     }

     public Placar(String time1, String time2, int golsTime1, int golsTime2) {
         this.time1 = time1;
         this.time2 = time2;
         this.golsTime1 = golsTime1;
         this.golsTime2 = golsTime2;

         @Override
         public String toString(){
            return time1 + " " + golsTime1 + " X " + golsTime2 + " " + time2;
         }
    }

}