/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Excepciones.LibroExistenteException;
import Modelo.Libros;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;

/**
 *
 * @author Jorge Antonio OA
 */
public class Controlador {
    private HashSet<Libros> libros;
    
     public Controlador() {
        File file = new File("Registrodelibros.dat");
        if (file.exists()) {
            libros = cargarProductos();
        } else {
            libros = new HashSet<>();
        }
    }
     
     
     
   public HashSet<Libros> cargarProductos() {
        try {
            File file = new File("Registrodelibros.dat");
            FileInputStream input = new FileInputStream(file);
            ObjectInputStream reader = new ObjectInputStream(input);

            HashSet<Libros> crear = (HashSet<Libros>) reader.readObject();

            reader.close();
            input.close();

            return crear;
        } catch (IOException ex) {
            
        } catch (ClassNotFoundException ex) {
            
        }
        return null;
    }  
   
    public void agregar(Libros l) throws LibroExistenteException  {
        if (!libros.add(l)) {
            throw new LibroExistenteException();
        }
    }
    
      public void guardar() {
        try {
            File file = new File("Registrodelibros.dat");
            FileOutputStream output = new FileOutputStream(file);
            ObjectOutputStream writer = new ObjectOutputStream(output);

           System.out.println("****");
            for (Libros l : libros) {
                System.out.println(l);
            }
            System.out.println("****");

            writer.writeObject(libros);
            writer.close();
            output.close();
        } catch (IOException ex) {

        }
    }
      
      public Object[] obtenerDatos(){        
        return libros.toArray();
    }
    
    public Libros buscar(int idx){
        Object[] objs = libros.toArray();
        Libros l = (Libros)objs[idx];
        return l;
    }
    
}
