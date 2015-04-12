package paginaPelicula.controlador.action;

import java.net.URL;

import paginaPelicula.controlador.model.Pelicula;

import com.opensymphony.xwork2.ActionSupport;

public class ManejadorAction extends ActionSupport {
	
	private Pelicula pelicula;
	private String nombre;
	private String comentario;
	private URL linkTrailer;
	private int calificacion;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String executeInsertarPelicula(){
		Pelicula auxPelicula = new Pelicula();
		auxPelicula.setNombre(nombre);
		auxPelicula.setCalificacion(calificacion);
		auxPelicula.setComentario(comentario);
		auxPelicula.setLinkTrailer(linkTrailer);
		
		return null;
	}
}
