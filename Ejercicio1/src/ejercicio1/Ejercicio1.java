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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Jugador j = new Jugador(22,"Defensa",119272,22,"Andres","Iniesta");
        System.out.println(j.datos());
        
        Entrenador e = new Entrenador("FIFA",983311,45,"Zidane","Zinedine");
        System.out.println(e.datos());
        
        Masajista m = new Masajista(5,"Masajista",723398,26,"Maria","Lopez");
        System.out.println(m.datos());
    }
    
}
