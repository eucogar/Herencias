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
public class Equipo {
    private int id, edad;
    private String Nombre, Apellido;

    public Equipo() {
    }

    public Equipo(int id, int edad, String Nombre,String Apellido) {
        this.id = id;
        this.edad = edad;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
    }

    public int getId() {
        return id;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }
    
    public String datos()
    {
        return "ID: "+this.id+", Nombre: "+this.Nombre+", Apellido: "+this.Apellido+", Edad: "+this.edad;
    }
   
}
