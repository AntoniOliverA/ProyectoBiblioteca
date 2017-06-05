/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;

/**
 *
 * @author Jorge Antonio OA
 */
public class Usuarios implements Serializable {
      private String matricula;
    private String nombre;
    private Fecha nacimiento;

    public Usuarios(String matricula, String nombre, Fecha nacimiento) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.nacimiento = nacimiento;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNacimiento(Fecha nacimiento) {
        this.nacimiento = nacimiento;
    }

    public Fecha getNacimiento() {
        return nacimiento;
    }
    
    
}
