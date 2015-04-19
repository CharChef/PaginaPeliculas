package paginaPelicula.controlador.model;

import java.net.MalformedURLException;
import java.net.URL;

import TDALista.BoundaryViolationException;
import TDALista.DoubleLinkedList;
import TDALista.EmptyListException;
import TDALista.InvalidPositionException;
import TDALista.Position;
import TDALista.PositionList;

public class ListaPeliculas {
	
	public ListaPeliculas(){}
	
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
	
	public boolean cambiarInsertar(String nombre, String comentario, URL linkTrailer ,int calificacion){
        PositionList<Pelicula> pel = listarPeliculas();
        boolean found = false;
        for(Pelicula i : pel){
            if(i.getNombre().equals(nombre)){
            	found = true;
                i.setNombre(nombre);
                i.setComentario(comentario);
                i.setLinkTrailer(linkTrailer);
                i.setCalificacion(calificacion);
                break;
            }
        }
        if(found){
        	setearPeliculas(pel);
        }else{
        	Manejador man = null;
            try{
            	man = new Manejador();
            	man.añadirLineaFinal(nombre + "\r\n");
            	man.añadirLineaFinal(comentario+ "\r\n");
            	man.añadirLineaFinal(linkTrailer+ "\r\n");
            	man.añadirLineaFinal(calificacion+ "\r\n");
            	man.close();
            }
            catch(Exception e){
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
        }
		return found;
	}

	public PositionList<Pelicula> listarPeliculas() {
		
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
	
	public boolean existePelicula(Pelicula P){
		boolean sal = false;
		PositionList<Pelicula> pel = listarPeliculas();
		for(Pelicula i : pel){
		    if( (P.getNombre().equals(i.getNombre())))
		        sal = true;
		    	break;
		}
		return sal;
    }

	public void borrarPelicula(String nombre){
		try{
			PositionList<Pelicula> pel = listarPeliculas();
			if(!pel.isEmpty()){
				Position<Pelicula> peliminar = pel.first();
				while(peliminar!=null){
					if(peliminar.element().getNombre().equals(nombre)){
						break;
					}
					peliminar = pel.last()==peliminar ? null : pel.next(peliminar);
				}
				pel.remove(peliminar);
			    setearPeliculas(pel);
			}
		}catch(InvalidPositionException | EmptyListException | BoundaryViolationException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
