package objetos;

public class Clasificacion {

	private String calificacion;
	private String descripcion;
	
	private String[][] calificaciones = { { "G", "APROPIADO PARA TODAS LAS EDADES." },
			{ "PG", "PARTE DEL MATERIAL PUEDE NO SER ADECUADO PARA LOS NIŃOS" },
			{ "PG-13", "ALGUNOS MATERIALES PUEDEN SER INAPROPIADOS PARA NIÑOS MENORES DE 13." },
			{ "R", "MENORES DE 17 AÑOS REQUIERE DE ACOMPAÑAMIENTO DE PADRES O TUTOR ADULTO" },
			{ "NC-17", "SIN ADMITIR AUDIENCIAS DE MENOR DE EDAD Y 17." },
			{ "D", "Películas para adultos, con sexo explícito, lenguaje procaz o alto grado de violencia." } };
	
	/**
	 * 
	 */
	public Clasificacion() {
		super();
	}
	/**
	 * @param calificacion
	 */
	public Clasificacion(String calificacion) {
		super();
		buscarDescri(calificacion);

	}
	
	private void buscarDescri(String calificacion) {
		this.calificacion = "NN";
		this.descripcion = "";
		for (int i = 0; i < calificaciones.length; i++) {
			if (calificaciones[i][0].equalsIgnoreCase(calificacion)) {
				this.calificacion = calificacion;
				this.descripcion = calificaciones[i][1];
			}
		}
	}
	
	/**
	 * @return the calificacion
	 */
	public String getCalificacion() {
		return calificacion;
	}
	/**
	 * @param calificacion the calificacion to set
	 */
	public void setCalificacion(String calificacion) {
		this.calificacion = calificacion;
	}
	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	@Override
	public String toString() {
		return calificacion + ": " + descripcion ;
	}
	

	

	
}
