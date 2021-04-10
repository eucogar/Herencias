/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author eucog
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Empleado E = new Empleado("Rafa");
        System.out.println(E);
        
        Directivo D = new Directivo("Mario");
        System.out.println(D);
        
        Operario O = new Operario("Alfonso");
        System.out.println(O);
        
        Oficial f = new Oficial("Luis");
        System.out.println(f);
        
        Tecnico T = new Tecnico("Pablo");
        System.out.println(T);
    }
    
}
