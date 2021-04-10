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
public class Entrenador extends Equipo {
    
    private String idFederacion;

    public Entrenador() {
    }

    public Entrenador(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    public Entrenador(String idFederacion, int id, int edad, String Nombre, String Apellido) {
        super(id, edad, Nombre, Apellido);
        this.idFederacion = idFederacion;
    }

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }
    
    @Override
    public String datos()
    {
        return "Entrenador (Federacion: "+this.idFederacion+", "+super.datos()+")";
    }
    
}
    
   