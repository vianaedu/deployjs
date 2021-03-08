package exercicios.exercicio04;

public class Relogio {
    // atributos
    private int hora, minuto, segundo;

    // métodos contrutor
    public Relogio(int h, int m, int s){
        setHora(h);
        setMinuto(m);
        setSegundo(s);

    }
    public void apresentar(){
        System.out.println("Hora Atual " + hora + ":" + minuto + ":" + segundo);
    }
    public void setHora(int hora) {
        if (hora >= 0 && hora < 24){
            this.hora = hora;
        }
    }
    public void setMinuto(int minuto) {
        if (minuto >= 0 && minuto < 60){
            this.minuto = minuto;
        }
        }
    public void setSegundo(int segundo) {
        if (segundo >=0 && segundo < 60){
            this.segundo = segundo;
        }

    }
    }