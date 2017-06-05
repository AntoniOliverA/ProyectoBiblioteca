/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Control.ControlUsuarios;

import Modelo.Usuarios;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Jorge Antonio OA
 */
public class TablaUsuarios  extends AbstractTableModel {
    
      private ControlUsuarios c;
    private Object[] usuario;

    public TablaUsuarios(ControlUsuarios c1) {
        c = c1;
        usuario = c1.obtenerDatos();
    }
    
    
    

    @Override
    public int getRowCount() {
       usuario = c.obtenerDatos();                   
        return usuario.length;
    }

    @Override
    public int getColumnCount() {
      return 3;
    }

    @Override
    public Object getValueAt(int i, int i1) {
          usuario = c.obtenerDatos();           
        Usuarios l = (Usuarios)usuario[i];
        switch (i1) {
            case 0: return l.getNombre();
            case 1: return l.getMatricula();
            case 2: return l.getNacimiento();
           
            default:
                throw new AssertionError();
        }
    }
     @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0: return "Nombre";
            case 1: return "Matricula";
            case 2: return "Fecha de Nacimiento";
            
            default:
                throw new AssertionError();
        }
    }
}
