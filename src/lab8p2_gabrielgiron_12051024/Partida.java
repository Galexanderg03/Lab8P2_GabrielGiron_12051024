/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8p2_gabrielgiron_12051024;
import java.io.Serializable;
import java.util.ArrayList;
/**
 *
 * @author Galex
 */
public class Partida implements Serializable{
    private String Nombre;
    public ArrayList<Jugador> Jugadores = new ArrayList();
    public ArrayList<Estrella> Estrellas = new ArrayList();
    private static final long SerialVersionUID = 777L;
    
    public Partida(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public ArrayList<Jugador> getJugadores() {
        return Jugadores;
    }

    public void setJugadores(ArrayList<Jugador> Jugadores) {
        this.Jugadores = Jugadores;
    }

    public ArrayList<Estrella> getEstrellas() {
        return Estrellas;
    }

    public void setEstrellas(ArrayList<Estrella> Estrellas) {
        this.Estrellas = Estrellas;
    }

    @Override
    public String toString() {
        return Nombre;
    }
    
    
}
