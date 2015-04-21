package paginaPelicula.controlador.model;

import java.net.URL;

public class Pelicula {

	private String nombre;
	private int anio;
	private int calificacion;
	private URL imdb;
	private double cal_imdb;
	private URL trailer;
	private String categoria;
	private String comentario;
	private String tapa;
	
	public Pelicula()
	{
		
	}
	
	public Pelicula(String nombre, int anio, int calificacion, URL imdb,
			double cal_imdb, URL trailer, String categoria, String comentario,
			String tapa) {
		super();
		this.nombre = nombre;
		this.anio = anio;
		this.calificacion = calificacion;
		this.imdb = imdb;
		this.cal_imdb = cal_imdb;
		this.trailer = trailer;
		this.categoria = categoria;
		this.comentario = comentario;
		this.tapa = tapa;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public int getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}

	public URL getImdb() {
		return imdb;
	}

	public void setImdb(URL imdb) {
		this.imdb = imdb;
	}

	public double getCal_imdb() {
		return cal_imdb;
	}

	public void setCal_imdb(double cal_imdb) {
		this.cal_imdb = cal_imdb;
	}

	public URL getTrailer() {
		return trailer;
	}

	public void setTrailer(URL trailer) {
		this.trailer = trailer;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public String getTapa() {
		return tapa;
	}

	public void setTapa(String tapa) {
		this.tapa = tapa;
	}
	
	
}
