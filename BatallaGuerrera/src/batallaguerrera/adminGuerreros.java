
package batallaguerrera;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class adminGuerreros extends Guerreros{
    private ArrayList<Guerreros> lista = new ArrayList(); //rom
    private File archivo = null;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    

    public adminGuerreros(String path) {
        archivo = new File(path);
    }

    public ArrayList<Guerreros> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Guerreros> lista) {
        this.lista = lista;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    
    
    //cargar el archivo binario. Pasar del ROM al RAM
    public void cargarArchivo(){
        try {
            lista = new ArrayList();
            Guerreros temp;
            if(archivo.exists()){
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Guerreros) objeto.readObject()) != null){
                        lista.add(temp);
                    }
                } catch (EOFException e) {//siempre ocuure
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    //escribir
    public void escribirArchivo(){
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Guerreros t : lista) {
                bw.writeObject(t);
            }
            bw.flush();
            
        } catch (Exception e) {
        }finally{
            try {
                bw.close();
                fw.close();
            } catch (Exception e) {
            }
        }
    }
}
