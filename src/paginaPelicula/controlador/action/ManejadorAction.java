package paginaPelicula.controlador.action;

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
	private int calificacion;
	private int anio;
	private String imdb;
	private double cal_imdb;
	private String trailer;
	private String categoria;
	private String tapa;
	private PositionList<PositionList<Pelicula>> listaDeListaPeliculas;
	private PositionList<Pelicula> listaPeliculas;
	private PositionList<String> listaNombresPeliculas;
	
	//Metodos de acciones
	public String executeCambiarInsertar()
	{
		ListaPeliculas aux = new ListaPeliculas();
		aux.cambiarInsertar(nombre, anio, calificacion, imdb, cal_imdb, trailer, categoria, comentario, tapa);
		return INPUT;		
	}
	
	public String executeListarPeliculas()
	{
		listaPeliculas = new ListaPeliculas().listarPeliculas();
		if (listaPeliculas.isEmpty())
		{
			addActionError(getText("error.listas"));
			this.addActionMessage("Hola pipi");
			return ERROR;
		}
		listaDeListaPeliculas = new DoubleLinkedList<PositionList<Pelicula>>();
		PositionList<Pelicula> auxList = null;
		listaNombresPeliculas = new DoubleLinkedList<String>();
		int i = 0;
		for(Pelicula p : listaPeliculas)
		{
			listaNombresPeliculas.addLast(p.getNombre());
			if(i==0)
			{
				auxList = new DoubleLinkedList<Pelicula>();
				listaDeListaPeliculas.addLast(auxList);
			}
			auxList.addLast(p);
			i = (i+1) % 4;
		}
		return SUCCESS;
	}
		
	public String executeBuscarPelicula()
	{
		pelicula = new ListaPeliculas().buscarPelicula(nombre); 
		return SUCCESS;
	}
	
	public String executeBorrarPelicula()
	{
		new ListaPeliculas().borrarPelicula(nombre);
		return SUCCESS;
	}
	
	// TODO Auto-generated getters and setters block
	
	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public String getImdb() {
		return imdb;
	}

	public void setImdb(String imdb) {
		this.imdb = imdb;
	}

	public double getCal_imdb() {
		return cal_imdb;
	}

	public void setCal_imdb(double cal_imdb) {
		this.cal_imdb = cal_imdb;
	}

	public String getTrailer() {
		return trailer;
	}

	public void setTrailer(String trailer) {
		this.trailer = trailer;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getTapa() {
		return tapa;
	}

	public void setTapa(String tapa) {
		this.tapa = tapa;
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

	public int getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}

	public PositionList<String> getListaNombresPeliculas() {
		return listaNombresPeliculas;
	}

	public void setListaNombresPeliculas(PositionList<String> listaNombresPeliculas) {
		this.listaNombresPeliculas = listaNombresPeliculas;
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
