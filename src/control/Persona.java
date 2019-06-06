package control;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class Persona  {
    ArrayList<String> dias = new ArrayList<String>();
    ArrayList<String> animodias = new ArrayList<String>();
    ArrayList<String> fisicodias = new ArrayList<String>();

    private String estadoAnimo;
    private String estadoFisico;
    private LocalDate diaActual;

    public Persona(){

    }

    public Persona(ArrayList<String> dias, String estadoAnimo, String estadoFisico, LocalDate diaActual) {
        this.dias = dias;
        this.estadoAnimo = estadoAnimo;
        this.estadoFisico = estadoFisico;
        this.diaActual = diaActual;
    }

    public ArrayList<String> getDias() {
        return dias;
    }

    public void setDias(ArrayList<String> dias) {
        this.dias = dias;
    }

    public String getEstadoAnimo() {
        return estadoAnimo;
    }

    public void setEstadoAnimo(String estadoAnimo) {
        this.estadoAnimo = estadoAnimo;
    }

    public String getEstadoFisico() {
        return estadoFisico;
    }

    public void setEstadoFisico(String estadoFisico) {
        this.estadoFisico = estadoFisico;
    }



}

