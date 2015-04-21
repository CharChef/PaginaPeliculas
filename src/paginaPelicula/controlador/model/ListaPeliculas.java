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
	
	public boolean insertarPelicula(Pelicula p) {
        boolean ret = false;
        Manejador man = null;
        try{
        	man = new Manejador();
        	man.aniadirLineaFinal(p.getNombre() + "\r\n");
        	man.aniadirLineaFinal(p.getAnio() + "\r\n");
        	man.aniadirLineaFinal(p.getCalificacion() + "\r\n");
        	man.aniadirLineaFinal(p.getImdb() + "\r\n");
        	man.aniadirLineaFinal(p.getCal_imdb() + "\r\n");
        	man.aniadirLineaFinal(p.getTrailer()+ "\r\n");
        	man.aniadirLineaFinal(p.getCategoria() + "\r\n");
        	man.aniadirLineaFinal(p.getComentario()+ "\r\n");
        	man.aniadirLineaFinal(p.getTapa()+ "\r\n");
        	man.close();
	        ret = true;}
        catch(Exception e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return ret;
    }
	
	public boolean cambiarInsertar(String nombre, int anio, int calificacion, URL imdb,
			double cal_imdb, URL trailer, String categoria, String comentario,
			String tapa){
        PositionList<Pelicula> pel = listarPeliculas();
        boolean found = false;
        for(Pelicula i : pel){
            if(i.getNombre().equals(nombre)){
            	found = true;
                i.setNombre(nombre);
                i.setAnio(anio);
                i.setCalificacion(calificacion);
                i.setImdb(imdb);
                i.setCal_imdb(cal_imdb);
                i.setTrailer(trailer);
                i.setCategoria(categoria);
                i.setComentario(comentario);
                i.setTapa(tapa);
                break;
            }
        }
        if(found){
        	setearPeliculas(pel);
        }else{
        	Manejador man = null;
            try{
            	man = new Manejador();
            	man.aniadirLineaFinal(nombre + "\r\n");
            	man.aniadirLineaFinal(anio + "\r\n");
            	man.aniadirLineaFinal(calificacion + "\r\n");
            	man.aniadirLineaFinal(imdb + "\r\n");
            	man.aniadirLineaFinal(cal_imdb + "\r\n");
            	man.aniadirLineaFinal(trailer+ "\r\n");
            	man.aniadirLineaFinal(categoria + "\r\n");
            	man.aniadirLineaFinal(comentario+ "\r\n");
            	man.aniadirLineaFinal(tapa+ "\r\n");
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
    	int anio = 0;
    	int calificacion = 0;
    	URL imdb = null;
		double cal_imdb = 0;
		URL trailer = null;
		String categoria = "";
    	String comentario = "";
    	String tapa = "";
    	
        while (nombre != null) {
        	
        	try {
        		anio = Integer.parseInt(aux.leerLinea());
            	calificacion = Integer.parseInt(aux.leerLinea());
        		imdb = new URL(aux.leerLinea());
        		cal_imdb = Double.parseDouble(aux.leerLinea());
        		trailer = new URL(aux.leerLinea());
        		categoria = aux.leerLinea();
            	comentario = aux.leerLinea();
            	tapa = aux.leerLinea();
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			pel.addLast(new Pelicula(nombre, anio, calificacion, imdb, cal_imdb, trailer, categoria, comentario, tapa));
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
			man.aniadirLineaFinal(p.getNombre() + "\r\n");
        	man.aniadirLineaFinal(p.getAnio() + "\r\n");
        	man.aniadirLineaFinal(p.getCalificacion() + "\r\n");
        	man.aniadirLineaFinal(p.getImdb() + "\r\n");
        	man.aniadirLineaFinal(p.getCal_imdb() + "\r\n");
        	man.aniadirLineaFinal(p.getTrailer()+ "\r\n");
        	man.aniadirLineaFinal(p.getCategoria() + "\r\n");
        	man.aniadirLineaFinal(p.getComentario()+ "\r\n");
        	man.aniadirLineaFinal(p.getTapa()+ "\r\n");
		}
		man.close();
	}
	
	
}
