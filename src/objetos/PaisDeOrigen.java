package objetos;

public class PaisDeOrigen {

	private String origen;
	private String pais;
	private String idioma;
	
	private String[][] origenes = { { "USA", "Estados Unidos", "Inglés" }, { "FR", "Francia", "Francés" },
			{ "AR", "Argentina", "Latino" }, { "CAN-EN", "Canadá", "Inglés" }, { "CAN-FR", "Canadá", "Francés" },
			{ "ESP", "España", "Español" }, { "UK", "Inglaterra", "Inglés" } };


	/**
	 * 
	 */
	public PaisDeOrigen() {
		super();
	}

	/**
	 * @param origen con solo poner el origen obtiene pais e idioma
	 */
	public PaisDeOrigen(String origen) {
		super();
		buscarPais(origen);
		
	}
	
	private void buscarPais(String origen) {
		this.origen = "NN";
		this.pais = "NN";
		this.idioma = "nn";
		for (int i = 0; i < origenes.length; i++) {
			if (origenes[i][0].equalsIgnoreCase(origen)) {
				this.origen = origen;
				this.pais = origenes[i][1];
				this.idioma = origenes[i][2];
			}
		}
	}

	/**
	 * @return the origen
	 */
	public String getOrigen() {
		return origen;
	}

	/**
	 * @param origen the origen to set
	 */
	public void setOrigen(String origen) {
		buscarPais(origen);
	}

	/**
	 * @return the pais
	 */
	public String getPais() {
		return pais;
	}


	/**
	 * @return the idioma
	 */
	public String getIdioma() {
		return idioma;
	}



	@Override
	public String toString() {
		return "Pais de Origen: " + pais + ", idioma=" + idioma ;
	}

	
	
}
