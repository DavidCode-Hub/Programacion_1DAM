package discos_Ej_Clase;

public class Discos {
	protected int codigo;
	protected String autor;
	protected String titulo;
	protected String sexo;
	protected int duracion;
	
	/**
	 *Constructor vacio.
	 */
	public Discos() {
		
	}
	
	/**
	 * Constructor para rellenar por parametros
	 * @param codigo
	 * @param autor
	 * @param titulo
	 * @param sexo
	 * @param duracion
	 */
	public Discos(int codigo, String autor, String titulo, String sexo, int duracion) {
		this.codigo = codigo;
		this.autor = autor;
		this.titulo = titulo;
		this.sexo = sexo;
		this.duracion = duracion;
	}

	@Override
	public String toString() {
		return "Discos [codigo=" + codigo + ", autor=" + autor + ", titulo=" + titulo + ", sexo=" + sexo + ", duracion="
				+ duracion + "]";
	}

	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the autor
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * @param autor the autor to set
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return the sexo
	 */
	public String getSexo() {
		return sexo;
	}

	/**
	 * @param sexo the sexo to set
	 */
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	/**
	 * @return the duracion
	 */
	public int getDuracion() {
		return duracion;
	}

	/**
	 * @param duracion the duracion to set
	 */
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
	
	
	
	
	
	
	
}
