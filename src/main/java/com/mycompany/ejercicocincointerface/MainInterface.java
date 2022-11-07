
package com.mycompany.ejercicocincointerface;

/**
 *
 * @author HP
 */

public class MainInterface {
    public static void main(String[] args) {
        
        cocheCRUD ImplementacionUno = new CocheCRUDImpl();
        
        
        ImplementacionUno.save();
        ImplementacionUno.findall();
        ImplementacionUno.delete();
     }    
    }
   
    