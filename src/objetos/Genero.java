package objetos;

public class Genero {

	private String genero;
	private String descripcion;

	private String[][] generos = { { "Acci�n",
			"En este g�nero prevalecen altas dosis de adrenalina con una buena carga de movimiento, fugas, acrobacias, peleas, guerras, persecuciones y una lucha contra el mal." },
			{ "Aventuras", "Similares a las de acci�n, predominan las nuevas experiencias y situaciones." },
			{ "Ciencia Ficci�n",
					"�Basados en fen�menos imaginarios, en la ciencia ficci�n son usuales los extraterrestres, sociedades inventadas, otros planetas�" },
			{ "Comedia", "Dise�adas espec�ficamente para provocar la risa o la alegr�a entre los espectadores." },
			{ "Drama",
					"Los dramas se centran en desarrollar el problema o problemas entre los diferentes protagonistas. Este es quiz�s uno de los g�neros cinematogr�ficos m�s amplios de la lista. No predominan las aventuras o la acci�n, aunque pueden aparecer puntualmente Generalmente se basan en desarrollar la interacci" },
			{ "Fantas�a",
					"En ellas se incluyen personajes irreales o totalmente inventados, inexistentes en nuestra realidad. Tambi�n podemos conocer este g�nero de cine como �fant�stico. No se basa en ideas que puedan llegar a materializarse." },
			{ "Musical",
					"Las pel�culas que cortan su desarrollo natural con fragmentos musicales son protagonistas de este g�nero." },
			{ "Documental", "Este g�nero analiza un hecho o situaci�n real sin ficcionarlo." },
			{ "Suspenso",
					"�Conocido tambi�n como intriga, estas pel�culas se desarrollan r�pidamente, y todos sus elementos giran entorno un mismo elemento intrigante." },
			{ "Terror", "Su principal objetivo es causar miedo, horror, incomodidad o preocupaci�n." },
			{ "Rom�ntico", "Un desenvolvimiento rom�ntico, cari�oso o amoroso entre dos personas." },
			{ "Melodrama�",
					"tiene una carga emocional o moral muy fuerte o emotiva, atendiendo al gusto de cada persona." },
			{ "Er�tico",
					"Contiene escenas de desnudos, pero centra su atenci�n en lo amoroso o en lo art�stico y filos�fico, no en lo genital." },
			{ "Animaci�n", "Peliculas de dibujos animados."},
			{ "Familia", "Contiene argumentos que describen aspectos de la familia."},
			{ "Western", "Son las pelis de lejano oeste. De vaqueros y pistoleros. !!"},
	};

	/**
	 * 
	 */
	public Genero() {
		super();
	}

	/**
	 * @param genero se asigna al genero y la descripci�n se pone sola
	 */
	public Genero(String genero) {
		super();
		buscarGenero(genero);
	}

	private void buscarGenero(String genero) {
		this.genero = "NN";
		this.descripcion = "";
		for (int i = 0; i < generos.length; i++) {
			if (generos[i][0].equalsIgnoreCase(genero)) {
				this.genero = genero;
				this.descripcion = generos[i][1];
			}
		}
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		buscarGenero(genero);
	}
	
	public String getDescripcion() {
		return "\n" + genero + ": " + descripcion;
	}

	@Override
	public String toString() {
		return "<" + genero + "> ";
	}

}
