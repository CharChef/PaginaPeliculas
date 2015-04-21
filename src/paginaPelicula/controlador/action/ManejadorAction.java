package paginaPelicula.controlador.action;

import java.net.URL;

import paginaPelicula.controlador.model.ListaPeliculas;
import paginaPelicula.controlador.model.Pelicula;
import sun.util.locale.provider.AuxLocaleProviderAdapter;
import TDALista.DoubleLinkedList;
import TDALista.PositionList;

import com.opensymphony.xwork2.ActionSupport;

public class ManejadorAction extends ActionSupport {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Pelicula pelicula;
	private String nombre;
	private String comentario;
	private URL linkTrailer;
	private int calificacion;
	private PositionList<PositionList<Pelicula>> listaPeliculas;

	public String executeCambiarInsertar(){
		new ListaPeliculas().cambiarInsertar(nombre, comentario, linkTrailer, calificacion);
		return SUCCESS;
	}
	
	public String executeListarPeliculas(){
		PositionList<PositionList<Pelicula>> auxList = new DoubleLinkedList<PositionList<Pelicula>>();
		PositionList<Pelicula> auxList2 = null;
		PositionList<Pelicula> auxList3 = new ListaPeliculas().listarPeliculas();
		int i = 0;
		for(Pelicula p : auxList3){
			if(i==0){
				auxList2 = new DoubleLinkedList<Pelicula>();
				auxList.addLast(auxList2);
			}
			auxList2.addLast(p);
			i = (i+1) % 4;
		}
		listaPeliculas = auxList;
		return SUCCESS;
	}
	
	// TODO Auto-generated getters and setters block
	
	public String executeBorrarPelicula(){
		new ListaPeliculas().borrarPelicula(nombre);
		return SUCCESS;
	}

	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public URL getLinkTrailer() {
		return linkTrailer;
	}

	public void setLinkTrailer(URL linkTrailer) {
		this.linkTrailer = linkTrailer;
	}

	public int getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}

	public PositionList<PositionList<Pelicula>> getListaPeliculas() {
		return listaPeliculas;
	}

	public void setListaPeliculas(
			PositionList<PositionList<Pelicula>> listaPeliculas) {
		this.listaPeliculas = listaPeliculas;
	}
	
	
}
