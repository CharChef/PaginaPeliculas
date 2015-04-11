package paginaPelicula.controlador.model;

import java.net.MalformedURLException;
import java.net.URL;

import TDALista.DoubleLinkedList;
import TDALista.PositionList;

public class ListaPeliculas {
	
	private ListaPeliculas(){}
	
	public boolean insertarPelicula(Pelicula P) {
        boolean ret = false;
        Manejador man = null;
        try{
        	man = new Manejador();
        	man.añadirLineaFinal(P.getNombre() + "\r\n");
        	man.añadirLineaFinal(P.getCalificacion()+ "\r\n");
        	man.añadirLineaFinal(P.getComentario()+ "\r\n");
        	man.añadirLineaFinal(P.getLinkTrailer()+ "\r\n");
        	man.close();
	        ret = true;}
        catch(Exception e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return ret;
    }
	
	public void Change(String nomv,String nomb, String coment ,int calif,URL lin){
        PositionList<Pelicula> pel = ListarPeliculas();
        for(Pelicula i : pel){
            if(i.getNombre().equals(nomv)){
                i.setNombre(nomb);
                i.setCalificacion(calif);
                i.setComentario(coment);
                i.setLinkTrailer(lin);
            }
        }
        setearPeliculas(pel);
       
	}

	public PositionList<Pelicula> ListarPeliculas() {
		
        Manejador aux = new Manejador();
        PositionList<Pelicula> pel = new DoubleLinkedList<Pelicula>();
        
    	String nombre = aux.leerLinea();
    	String comentario;
    	URL linkTrailer = null;
    	int calificacion;
    	
        while ((nombre = aux.leerLinea()) != null) {
        	
        	comentario = aux.leerLinea();
        	try {
				linkTrailer = new URL(aux.leerLinea());
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	calificacion = Integer.parseInt(aux.leerLinea());
        	pel.addLast(new Pelicula(nombre, comentario, linkTrailer, calificacion));
        	nombre = aux.leerLinea();
        }
        aux.close();

        return pel;
    }
	
	public boolean ExistePelicula(Pelicula P){
		boolean sal = false;
		PositionList<Pelicula> pel = ListarPeliculas();
		for(Pelicula i : pel){
		    if( (P.getNombre().equals(i.getNombre())))
		        sal = true;
		}
		return sal;
    }
	
	private void setearPeliculas(PositionList<Pelicula> pelis) {
		Manejador man = new Manejador();
		man.ReStart();
		for(Pelicula p : pelis){
		    //insertarPelicula(i);
		    man.añadirLineaFinal(p.getNombre() + "\r\n");
        	man.añadirLineaFinal(p.getCalificacion()+ "\r\n");
        	man.añadirLineaFinal(p.getComentario()+ "\r\n");
        	man.añadirLineaFinal(p.getLinkTrailer()+ "\r\n");
		}
		man.close();
	}
}
