package paginaPelicula.controlador.model;

import java.net.URL;

public class Pelicula {
	
	private String nombre;
	private String comentario;
	private URL linkTrailer;
	private int calificacion;
	
	public Pelicula(){};

	public Pelicula(String nombre, String comentario, URL linkTrailer,	int calificacion) {
		this.nombre = nombre;
		this.comentario = comentario;
		this.linkTrailer = linkTrailer;
		this.calificacion = calificacion;
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
	
}
