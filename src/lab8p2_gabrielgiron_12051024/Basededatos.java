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
    public AdminPartida AP = new AdminPartida("./Partidas");
    public AdminJugador AJ = new AdminJugador("./Jugadores");
    public AdminEstrella AE = new AdminEstrella("./Estrella");
    public String NombrePartida;

    public String getNombrePartida() {
        return NombrePartida;
    }

    public void setNombrePartida(String NombrePartida) {
        this.NombrePartida = NombrePartida;
    }
    
}
