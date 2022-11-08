/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package genericmethod;

/**
 *
 * @author fadillarizky
 */
class Test {
    static <T> void genericDisplay(T element)
    {
        System.out.println(element.getClass().getName()
                           + " = " + element);
    }
  
    public static void main(String[] args)
    {
        genericDisplay(5);
        genericDisplay("Fadilla");
        genericDisplay(10.0);
    }
}
