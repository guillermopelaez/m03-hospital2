package control;

import java.time.LocalDate;
import java.time.Period;

public class Persona  {
    private int estadoAnimo ;
    private int estadoFisico;

    public String[] getComida() {
        return comida;
    }

    public void setComida(String[] comida) {
        this.comida = comida;
    }

    private String[] comida ;


    public int getEstadoAnimo() {
        return estadoAnimo;
    }

    public void setEstadoAnimo(int estadoAnimo) {
        this.estadoAnimo = estadoAnimo;
    }

    public int getEstadoFisico() {
        return estadoFisico;
    }

    public void setEstadoFisico(int estadoFisico) {
        this.estadoFisico = estadoFisico;
    }

}

