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
public class Masajista extends Equipo{
    
    private int años;
    private String titulacion;

    public Masajista() {
    }

    public Masajista(int años, String titulacion) {
        this.años = años;
        this.titulacion = titulacion;
    }

    public Masajista(int años, String titulacion, int id, int edad, String Nombre, String Apellido) {
        super(id, edad, Nombre, Apellido);
        this.años = años;
        this.titulacion = titulacion;
    }

    public int getAños() {
        return años;
    }

    public void setAños(int años) {
        this.años = años;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }
    
    @Override
    public String datos()
    {
        return "Masajista (Experiencia: "+this.años+", Titulacion: "+this.titulacion+", "+super.datos()+")";
    }
    
}
