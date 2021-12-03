/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8p2_gabrielgiron_12051024;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
/**
 *
 * @author Galex
 */
public class AdminJugador {
    public ArrayList<Jugador> listaJugadores = new ArrayList();
    private File archivo = null;
    
    public AdminJugador(String path) {
        archivo = new File(path);
    }

    public ArrayList<Jugador> getListaPartidas() {
        return listaJugadores;
    }

    public void setListaPersonas(ArrayList<Jugador> listaJugadores) {
        this.listaJugadores = listaJugadores;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void setPartida(Jugador a){
        listaJugadores.add(a);
    }
    
    
    public void cargarArchivo() {
        try {            
            listaJugadores = new ArrayList();
            Jugador temp;
            if (archivo.exists()) {
                FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Jugador) objeto.readObject()) != null) {
                        listaJugadores.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Jugador t : listaJugadores) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
}
