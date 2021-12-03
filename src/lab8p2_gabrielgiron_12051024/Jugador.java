/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8p2_gabrielgiron_12051024;

import java.io.Serializable;
/**
 *
 * @author Galex
 */
public class Jugador implements Serializable {
    private String Nombre;
    private int Velocidad;
    
    private static final long SerialVersionUID = 777L;
    public Jugador(String Nombre, int Velocidad) {
        this.Nombre = Nombre;
        this.Velocidad = Velocidad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getVelocidad() {
        return Velocidad;
    }

    public void setVelocidad(int Velocidad) {
        this.Velocidad = Velocidad;
    }

    @Override
    public String toString() {
        return Nombre;
    }
    
}
