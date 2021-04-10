/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author eucog
 */
public class Jugador extends Equipo {
    private int dorsal;
    private String demarcacion;

    public Jugador() {
    }

    public Jugador(int dorsal, String demarcacion) {
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public Jugador(int dorsal, String demarcacion, int id, int edad, String Nombre, String Apellido) {
        super(id, edad, Nombre, Apellido);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }
    
    @Override
    public String datos()
    {
        return "Jugador (Dorsal: "+this.dorsal+", Demarcacion: "+this.demarcacion+", "+super.datos()+")";
    }
    
}
