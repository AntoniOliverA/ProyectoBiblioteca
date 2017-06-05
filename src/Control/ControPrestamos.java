/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.Libros;
import Modelo.Prestamos;
import Modelo.Usuarios;
import java.util.HashSet;

/**
 *
 * @author Jorge Antonio OA
 */
public class ControPrestamos {
    private HashSet<Prestamos> pres;

    public ControPrestamos(HashSet<Prestamos> pres) {
        this.pres = pres;
    }
    
    
    
    public void agregar(Prestamos p){
        pres.add(p);
    }
    
    
}
