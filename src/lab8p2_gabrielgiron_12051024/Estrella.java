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
public class Estrella implements Serializable{
    private String Descripcion;
    private int Distancia;
    private String Nombre;
    private static final long SerialVersionUID = 777L;
    
    public Estrella(String Descripcion, int Distancia, String Nombre) {
        this.Descripcion = Descripcion;
        this.Distancia = Distancia;
        this.Nombre = Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getDistancia() {
        return Distancia;
    }

    public void setDistancia(int Distancia) {
        this.Distancia = Distancia;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    @Override
    public String toString() {
        return "Estrella{" + "Descripcion=" + Descripcion + ", Distancia=" + Distancia + ", Nombre=" + Nombre + '}';
    }
    
}
