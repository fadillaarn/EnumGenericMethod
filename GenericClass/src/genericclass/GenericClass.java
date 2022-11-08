/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package genericclass;

/**
 *
 * @author fadillarizky
 */
public class GenericClass<T> {

    /**
     * @param args the command line arguments
     */
    private T t;
    public void set(T t) {
        this.t = t;}
    
    public T get(){
        return t;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        GenericClass<Integer> persegi = new GenericClass<Integer>();
        GenericClass<Double> lingkaran = new GenericClass<Double>();
        
        persegi.set(100);
        lingkaran.set(21.7);
        System.out.println(persegi.get());
        System.out.println(lingkaran.get());
    }  
}
