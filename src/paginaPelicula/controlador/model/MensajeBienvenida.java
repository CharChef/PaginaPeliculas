package paginaPelicula.controlador.model;

public class MensajeBienvenida {
	
	private String mensajeM;
	
	public MensajeBienvenida() {
		setMensajeM("Espere unos segundos y será redireccionado...");
	}

	public String getMensajeM() {
		return mensajeM;
	}

	public void setMensajeM(String mensaje) {
		this.mensajeM = mensaje;
	}
}
