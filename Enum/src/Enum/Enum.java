/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Enum;

/**
 *
 * @author fadillarizky
 */
public class Enum {

    /**
     * @param args the command line arguments
     */
    enum Flavors {
      SWEET,
      SOUR,
      SALTY,
      BITTER,
      SAVORY;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Flavors myFlavor = Flavors.SWEET;

    switch(myFlavor) {
      case SWEET:
        System.out.println("The Flavor is Sweet");
        break;
      case SOUR:
         System.out.println("The Flavor is Sour");
        break;
      case SALTY:
        System.out.println("The Flavor is Salty");
        break;
      case BITTER:
        System.out.println("The Flavor is Bitter");
        break;
      case SAVORY:
        System.out.println("The Flavor is Savory");
        break;
    }
  }
    
}
