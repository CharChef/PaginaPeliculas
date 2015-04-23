package paginaPelicula.controlador.action;

import java.net.URL;
import paginaPelicula.controlador.model.ListaPeliculas;
import paginaPelicula.controlador.model.Pelicula;
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
	private int anio;
	private URL imdb;
	private double cal_imdb;
	private URL trailer;
	private String categoria;
	private String tapa;
	private PositionList<PositionList<Pelicula>> listaDeListaPeliculas;
	private PositionList<Pelicula> listaPeliculas;
	private PositionList<String> listaNombresPeliculas;
	
	public String executeCambiarInsertar(){
		new ListaPeliculas().cambiarInsertar(nombre, anio, calificacion, imdb, cal_imdb, trailer, categoria, comentario, tapa);
		return SUCCESS;
	}
	
	public String executeListarPeliculas(){
		listaDeListaPeliculas = new DoubleLinkedList<PositionList<Pelicula>>();
		PositionList<Pelicula> auxList = null;
		listaPeliculas = new ListaPeliculas().listarPeliculas();
		listaNombresPeliculas = new DoubleLinkedList<String>();
		int i = 0;
		for(Pelicula p : listaPeliculas){
			listaNombresPeliculas.addLast(p.getNombre());
			if(i==0){
				auxList = new DoubleLinkedList<Pelicula>();
				listaDeListaPeliculas.addLast(auxList);
			}
			auxList.addLast(p);
			i = (i+1) % 4;
		}
		return SUCCESS;
	}
		
	public PositionList<String> getListaNombresPeliculas() {
		return listaNombresPeliculas;
	}

	public void setListaNombresPeliculas(PositionList<String> listaNombresPeliculas) {
		this.listaNombresPeliculas = listaNombresPeliculas;
	}

	public String executeBuscarPelicula(){
		pelicula = new ListaPeliculas().buscarPelicula(nombre);
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

	public PositionList<PositionList<Pelicula>> getListaDeListaPeliculas() {
		return listaDeListaPeliculas;
	}

	public void setListaDeListaPeliculas(
			PositionList<PositionList<Pelicula>> listaDeListaPeliculas) {
		this.listaDeListaPeliculas = listaDeListaPeliculas;
	}

	public PositionList<Pelicula> getListaPeliculas() {
		return listaPeliculas;
	}

	public void setListaPeliculas(PositionList<Pelicula> listaPeliculas) {
		this.listaPeliculas = listaPeliculas;
	}
}
