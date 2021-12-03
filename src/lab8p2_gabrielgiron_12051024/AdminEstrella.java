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
public class AdminEstrella {
    public ArrayList<Estrella> listaEstrella = new ArrayList();
    private File archivo = null;
    
    public AdminEstrella(String path) {
        archivo = new File(path);
    }

    public ArrayList<Estrella> getListaPartidas() {
        return listaEstrella;
    }

    public void setListaPersonas(ArrayList<Estrella> listaEstrella) {
        this.listaEstrella = listaEstrella;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void setPartida(Estrella a){
        listaEstrella.add(a);
    }
    
    
    public void cargarArchivo() {
        try {            
            listaEstrella = new ArrayList();
            Estrella temp;
            if (archivo.exists()) {
                FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Estrella) objeto.readObject()) != null) {
                        listaEstrella.add(temp);
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
            for (Estrella t : listaEstrella) {
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
