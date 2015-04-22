package paginaPelicula.controlador.model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



public class Manejador {

	private File archivo;
    private BufferedWriter escritor;
    private BufferedReader lector;
    
    public Manejador(){
    	archivo = new File(this.getClass().getResource("Manejador.class").getFile());
    	String aux = archivo.getAbsolutePath();
        aux= aux.replace("Manejador.class", "Peliculas.txt"); 
        aux= aux.replace("%20", " ");
        archivo = new File(aux);
        
        if(!archivo.exists()){
        	try {
				archivo.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            archivo = new File(aux);
        }
        try {
			escritor = new BufferedWriter(new FileWriter(aux, true));
	        lector = new BufferedReader(new FileReader(aux));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    public String leerLinea() {
        String linea = null;
        try {
            linea = lector.readLine();
        } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        return linea;
    }
    
    public void aniadirLineaFinal(String dato) {
        try {
            escritor.append(dato);
        } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    public void close() {
        try {
            escritor.close();
            lector.close();
        } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    public void ReStart() {
        archivo = new File(this.getClass().getResource("Peliculas.txt").getFile());
        String aux = archivo.getAbsolutePath();
        aux = aux.replace("%20", " ");
        try {
            escritor = new BufferedWriter(new FileWriter(aux, false));
        } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    public int Logitud() {
        return (int) (archivo.length()/8);
    }
    
}
