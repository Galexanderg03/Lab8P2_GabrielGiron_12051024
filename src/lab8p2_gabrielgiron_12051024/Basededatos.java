/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8p2_gabrielgiron_12051024;
import java.util.ArrayList;
/**
 *
 * @author Galex
 */
public class Basededatos {
    public ArrayList<Partida> Partidas = new ArrayList();
    public ArrayList<Jugador> Jugadores = new ArrayList();
    public ArrayList<Estrella> Estrella = new ArrayList();
    public AdminPartida AP = new AdminPartida("./Partidas");
    public AdminJugador AJ = new AdminJugador("./Jugadores");
    public AdminEstrella AE = new AdminEstrella("./Estrella");

    public Basededatos() {
    }

    public ArrayList<Partida> getPartidas() {
        return Partidas;
    }

    public void setPartidas(ArrayList<Partida> Partidas) {
        this.Partidas = Partidas;
    }

    public ArrayList<Jugador> getJugadores() {
        return Jugadores;
    }

    public void setJugadores(ArrayList<Jugador> Jugadores) {
        this.Jugadores = Jugadores;
    }

    public ArrayList<Estrella> getEstrella() {
        return Estrella;
    }

    public void setEstrella(ArrayList<Estrella> Estrella) {
        this.Estrella = Estrella;
    }
    
}
