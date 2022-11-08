/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GenericClass;

/**
 *
 * @author fadillarizky
 */
public class GenericClass <T> {
    private T t;
    public void set(T t) {
        this.t = t;}
    
    public T get(){
        return t;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        GenericClassMain<Integer> persegi = new GenericClassMain<Integer>();
        GenericClassMain<Double> lingkaran = new GenericClassMain<Double>();
        
        persegi.set(100);
        lingkaran.set(21.7);
        System.out.println(persegi.get());
        System.out.println(lingkaran.get());
}
}