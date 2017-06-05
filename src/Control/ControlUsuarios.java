/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Excepciones.LibroExistenteException;
import Modelo.Usuarios;
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
public class ControlUsuarios {

    private HashSet<Usuarios> personas;

    public ControlUsuarios() {
        File file = new File("Registrodelibros.dat");
        if (file.exists()) {
            personas = cargarProductos();
        } else {
            personas = new HashSet<>();
        }
    }

    private HashSet<Usuarios> cargarProductos() {
        try {
            File file = new File("Usuarios.dat");
            FileInputStream input = new FileInputStream(file);
            ObjectInputStream reader = new ObjectInputStream(input);

            HashSet<Usuarios> crear = (HashSet<Usuarios>) reader.readObject();

            reader.close();
            input.close();

            return crear;
        } catch (IOException ex) {

        } catch (ClassNotFoundException ex) {

        }
        return null;
    }

    public void agregar(Usuarios p) throws LibroExistenteException {
        if (!personas.add(p)) {
            throw new LibroExistenteException();
        }
    }

    public void guardar() {
        try {
            File file = new File("Usuarios.dat");
            FileOutputStream output = new FileOutputStream(file);
            ObjectOutputStream writer = new ObjectOutputStream(output);

//            System.out.println("****");
//            for (Libros l : libros) {
//                System.out.println(l);
//            }
//            System.out.println("****");
            writer.writeObject(personas);
            writer.close();
            output.close();
        } catch (IOException ex) {

        }
    }

    public Object[] obtenerDatos() {
        return personas.toArray();
    }

    
    public Usuarios buscar(int idx){
        Object[] objs = personas.toArray();
        Usuarios l = (Usuarios)objs[idx];
        return l;
    }
}
