package biblioteca;

public class Publicacion extends Biblioteca{
	public enum estado{PRESTADO,NOPRESTADO}
	
	protected estado Estado;

	/**
	 * @param estado
	 */
	public Publicacion(estado estado) {
		super();
		this.Estado = estado.NOPRESTADO;
	}

	/**
	 * @param isbn
	 * @param titulo
	 * @param anopubli
	 * @param estado
	 */
	public Publicacion(int isbn, String titulo, int anopubli) {
		super(isbn, titulo, anopubli);
		this.Estado = estado.NOPRESTADO;
	}
	
	
	
	
	
	

	
	
	
}
