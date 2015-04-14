package paginaPelicula.controlador.action;

import java.net.URL;

import paginaPelicula.controlador.model.ListaPeliculas;
import paginaPelicula.controlador.model.Pelicula;
import TDALista.PositionList;

import com.opensymphony.xwork2.ActionSupport;

public class ManejadorAction extends ActionSupport {
	
	private Pelicula pelicula;
	private String nombre;
	private String comentario;
	private URL linkTrailer;
	private int calificacion;
	private PositionList<Pelicula> listaPeliculas;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String executeCambiarInsertarPelicula(){
		ListaPeliculas auxListaPeliculas = new ListaPeliculas();
		auxListaPeliculas.cambiarInsertar(nombre, comentario, linkTrailer, calificacion);
		return SUCCESS;
	}
}
