package objetos;

import java.time.LocalDate;
import java.util.ArrayList;


public class Principal {

	private static ArrayList<Pelicula> allPelis = new ArrayList<>();

	private String[][] pelis = {
			{ "1", "Dune", "Dune", "2021-09-17", "156", "true", "Drama, Ciencia ficción", "PG", "USA" },
			{ "2", "Shang-Chi y la leyenda de los Diez Anillos", "Shang-Chi y la leyenda de los Diez Anillos",
					"2021-09-03", "132", "true", "Acción, Fantasía", "G", "USA" },
			{ "3", "Sin tiempo para morir", "Sin tiempo para morir", "2021-10-01", "163", "true",
					"Acción, Espionaje, Suspense", "R", "USA" },
			{ "4", "After. Almas perdidas", "After. Almas perdidas", "2021-09-03", "99", "true",
					"Drama, Erótico, Romántico", "D", "USA" },
			{ "5", "No respires 2", "Don't Breathe 2", "2021-09-24", "99", "true", "Terror, Suspense", "R", "UK" },
			{ "6", "La canción de los nombres olvidados", "The Song Of Names", "2020-03-13", "114", "false", "Drama",
					"PG-13", "USA" },
			{ "7", "Culpable", "The Guilty", "2021-10-01", "90", "true", "Suspense, Drama", "R", "FR" },
			{ "8", "Maixabel", "Maixabel", "2021-09-24", "115", "true", "Drama, Biografía", "PG", "ESP" },
			{ "9", "Benedetta", "Benedetta", "2021-10-01", "127", "true", "Drama, Histórico, Romántico", "PG-13",
					"UK" },
			{ "10", "Venom", "Venom", "2018-10-05", "112", "false", "Ciencia ficción, Acción", "PG", "UK" },
			{ "11", "Cry Macho", "Cry Macho", "2021-09-24", "104", "true", "Drama, Western", "PG-13", "UK" },
			{ "12", "La patrulla canina. La película", "Paw Patrol: The Movie", "2021-08-27", "86", "false",
					"Animación, Familia, Aventuras", "G", "CAN-EN" },
			{ "13", "La familia Addams 2: La gran escapada", "The Addams Family 2", "2021-10-08", "93", "true",
					"Animación, Familia, Comedia", "G", "USA" } };

	public static void main(String[] args) {

		Principal inicio = new Principal();
		inicio.cargarPelis();
		for (Pelicula peli: allPelis) {
			System.out.println(peli);			
		}

	}

	private void cargarPelis() {

		for (int i = 0; i < pelis.length; i++) {
			// Define un objeto Pelicula y le carga los datos
			Pelicula peli1 = new Pelicula();

			// Pone los datos de las peliculas.
			peli1.setNombre(pelis[i][1].toUpperCase()); // Nombre
			peli1.setTituloOriginal(pelis[i][2].toString()); // tituloOriginal
			peli1.setDuracion(Integer.parseInt(pelis[i][4].toString())); // duración
			peli1.setFechaIngreso(LocalDate.parse(pelis[i][3].toString())); // Fecha Estreno
			peli1.setGenero(pelis[i][6].toString());
			peli1.setOrigen(pelis[i][8].toString());
			peli1.setClasificacion(pelis[i][7].toString());
			
			if (pelis[i][5].equals("true")) {
				peli1.setDisponible(true);
			} else {
				peli1.setDisponible(false);
			}

			allPelis.add(peli1);
		}
		

	}
}
