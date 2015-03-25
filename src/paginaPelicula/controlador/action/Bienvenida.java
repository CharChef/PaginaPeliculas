package paginaPelicula.controlador.action;

import com.opensymphony.xwork2.ActionSupport;
import paginaPelicula.controlador.model.MensajeBienvenida;

public class Bienvenida extends ActionSupport{
	
	
	private static final long serialVersionUID = 1L;
	
	private MensajeBienvenida mensajeA;
	
	public String execute() throws Exception{
		mensajeA = new MensajeBienvenida();
		return SUCCESS;
	}

	public MensajeBienvenida getMensajeA() {
		return mensajeA;
	}

	public void setMensajeA(MensajeBienvenida mensaje) {
		this.mensajeA = mensaje;
	}
	
	public void setMensajeA123(MensajeBienvenida mensaje) {
		this.mensajeA = mensaje;
	}
}
