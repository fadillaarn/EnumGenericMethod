/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GenericMethod;

/**
 *
 * @author fadillarizky
 */
class GenericsMethodMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        GenericMethod GM = new GenericMethod();
        
        GM.<String>genericMethod("Halo semua");
        GM.<Double>genericMethod(3.14);
    }
}
