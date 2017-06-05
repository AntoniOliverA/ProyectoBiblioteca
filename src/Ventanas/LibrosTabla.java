/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Control.Controlador;
import Modelo.Libros;
import javax.swing.event.EventListenerList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Jorge Antonio OA
 */
public class LibrosTabla extends AbstractTableModel {

    private Controlador oController;
    private Object[] libros;


    
    
    public LibrosTabla(Controlador c) {
        oController = c;
        libros = c.obtenerDatos();
    }

    public LibrosTabla() {

    }

    @Override
    public int getRowCount() {
        if (libros != null) {
//            System.out.println("tengo libros");
            libros = oController.obtenerDatos();
            return libros.length;
        } else {
//            System.out.println("no tengo libros");
            return 0;
        }

    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public Object getValueAt(int i, int i1) {
        libros = oController.obtenerDatos();
        Libros l = (Libros) libros[i];
        switch (i1) {
            case 0:
                return l.getTitulo();
            case 1:
                return l.getAutor();
            case 2:
                return l.getEdicion();
            case 3:
                return l.getEditorial();
            case 4:
                return l.getIsbn();
            case 5:
                return l.getNpaginas();
            case 6:
                return l.getCantidad();
            default:
                throw new AssertionError();
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Titulo";
            case 1:
                return "Autor";
            case 2:
                return "Edicion";
            case 3:
                return "Editorial";
            case 4:
                return "ISBN";
            case 5:
                return "Paginas";
            case 6:
                return "Existencia";
            default:
                throw new AssertionError();
        }
    }

}
