package objetos;

public class Genero {

	private String genero;
	private String descripcion;

	private String[][] generos = { { "Acción",
			"En este género prevalecen altas dosis de adrenalina con una buena carga de movimiento, fugas, acrobacias, peleas, guerras, persecuciones y una lucha contra el mal." },
			{ "Aventuras", "Similares a las de acción, predominan las nuevas experiencias y situaciones." },
			{ "Ciencia Ficción",
					" Basados en fenómenos imaginarios, en la ciencia ficción son usuales los extraterrestres, sociedades inventadas, otros planetas…" },
			{ "Comedia", "Diseñadas específicamente para provocar la risa o la alegría entre los espectadores." },
			{ "Drama",
					"Los dramas se centran en desarrollar el problema o problemas entre los diferentes protagonistas. Este es quizás uno de los géneros cinematográficos más amplios de la lista. No predominan las aventuras o la acción, aunque pueden aparecer puntualmente Generalmente se basan en desarrollar la interacci" },
			{ "Fantasía",
					"En ellas se incluyen personajes irreales o totalmente inventados, inexistentes en nuestra realidad. También podemos conocer este género de cine como “fantástico. No se basa en ideas que puedan llegar a materializarse." },
			{ "Musical",
					"Las películas que cortan su desarrollo natural con fragmentos musicales son protagonistas de este género." },
			{ "Documental", "Este género analiza un hecho o situación real sin ficcionarlo." },
			{ "Suspenso",
					" Conocido también como intriga, estas películas se desarrollan rápidamente, y todos sus elementos giran entorno un mismo elemento intrigante." },
			{ "Terror", "Su principal objetivo es causar miedo, horror, incomodidad o preocupación." },
			{ "Romántico", "Un desenvolvimiento romántico, cariñoso o amoroso entre dos personas." },
			{ "Melodrama ",
					"tiene una carga emocional o moral muy fuerte o emotiva, atendiendo al gusto de cada persona." },
			{ "Erótico",
					"Contiene escenas de desnudos, pero centra su atención en lo amoroso o en lo artístico y filosófico, no en lo genital." },
			{ "Animación", "Peliculas de dibujos animados."},
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
	 * @param genero se asigna al genero y la descripción se pone sola
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
