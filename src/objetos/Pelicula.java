package objetos;

import java.time.*;
import java.util.ArrayList;

public class Pelicula {

	private LocalDate fechaIngreso = LocalDate.now(); // Pone fecha hoy
	private int anoEstreno = fechaIngreso.getYear();
	private boolean disponible = false; // por lo general está disponible
	private long duracion = 6000; // 100 minutos de duración
	private String nombre;
	private String tituloOriginal;

	ArrayList<Genero> generosLista = new ArrayList<>();
	PaisDeOrigen paisOrigen;
	Clasificacion clasifica;

	public Pelicula() {
		super();
	}

	/**
	 * @param anoEstreno
	 * @param disponible
	 * @param duración
	 * @param fechaIngreso
	 * @param nombre
	 * @param tituloOriginal
	 * @param pais           Coloca el String<pais> y la clase determina el resto.
	 * @param clasificacion  Coloca el String<String> y la clase determina el resto.
	 */
	public Pelicula(String nombre, String tituloOriginal, LocalDate fechaIngreso, long duracion, String pais,
			String clasificacion, String generos) {
		super();

		this.nombre = nombre;
		this.tituloOriginal = tituloOriginal;

		this.fechaIngreso = fechaIngreso;

		this.duracion = duracion;

		anoEstreno = fechaIngreso.getYear();

		this.paisOrigen = new PaisDeOrigen(pais);

		this.clasifica = new Clasificacion(clasificacion);

		asignarGeneros(generos);

	}

	/****************
	 * Recibe los generos separados por "," Y los convierte en un array para
	 * integrarlos a la lista generosLista.
	 */
	private void asignarGeneros(String generos) {
		// Separa la cadena en una array
		String[] listageneros = generos.split(", ");

		if (listageneros.length > 0) {
			for (String elm : listageneros) {
				Genero gene1 = new Genero(elm);
				generosLista.add(gene1);
			}
		} else {
			System.out.println("No elements to display!");
		}
	}

	public void setGenero(String generos) {
		asignarGeneros(generos);
	}

	public void setOrigen(String pais) {
		this.paisOrigen = new PaisDeOrigen(pais);
	}

	public void setClasificacion(String clasificacion) {
		this.clasifica = new Clasificacion(clasificacion);
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public long getDuracion() {
		return duracion;
	}

	public void setDuracion(long duracion) {
		this.duracion = duracion;
	}

	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(LocalDate fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTituloOriginal() {
		return tituloOriginal;
	}

	public void setTituloOriginal(String tituloOriginal) {
		this.tituloOriginal = tituloOriginal;
	}

	@Override
	public String toString() {
		String rta="";
		String dispo = "ACTIVA";
		if (!disponible) {
			dispo = "INACTIVA";
		}
		rta+=
			   "\n  Película clase " + clasifica.getCalificacion() + " : " 
		     + nombre + " ("+ tituloOriginal + ")  " + dispo
		     + "\n  Estreno: " + anoEstreno + " (" + duracion + " min)"
		     + "\n  Origen : " + paisOrigen.getOrigen() + " <" + paisOrigen.getIdioma() + ">" 
		     + "\n  Generos: " + generosLista 
		     + "\n\n . . . . . . . . . . . . . . . . . . . . . . . . . . ."
		     + "\n Caracteristicas:"
		     + "\n  (*) Clase " + clasifica.getCalificacion() + " : "  + clasifica.getDescripcion()
		     + "\n  (*) Generos: ";
		     
		for (Genero gen: generosLista) {
			if (!gen.getGenero().equals("NN")) {
				rta+= gen.getDescripcion();
			}
		}
		rta+= "\n________________________________________________________\n\n";
		return rta;
	}

}
