
package com.mycompany.ejercicocincointerface;

import java.util.List;

/**
 *
 * @author HP
 */
public class CocheCRUDImpl implements cocheCRUD{

    @Override
    public void save() {
        
        System.out.println("SE GUARDO CAMBIOS");
    }

    @Override
    public void findall() {
        System.out.println("findall SE AGREGO FIMDALL");
    }
    

    @Override
    public void delete() {
        System.out.println("DELETE::::ELIMINAR");
        
    }

    
}
