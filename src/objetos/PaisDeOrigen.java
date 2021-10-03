package objetos;

public class PaisDeOrigen {

	private String origen;
	private String pais;
	private String idioma;
	
	private String[][] origenes = { { "USA", "Estados Unidos", "Ingl�s" }, { "FR", "Francia", "Franc�s" },
			{ "AR", "Argentina", "Latino" }, { "CAN-EN", "Canad�", "Ingl�s" }, { "CAN-FR", "Canad�", "Franc�s" },
			{ "ESP", "Espa�a", "Espa�ol" }, { "UK", "Inglaterra", "Ingl�s" } };


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
