package biblioteca;

public class Libro extends Biblioteca{

	protected int numerorevis;

	/**
	 * @param isbn
	 * @param titulo
	 * @param anopubli
	 * @param numerorevis
	 */
	public Libro(int isbn, String titulo, int anopubli, int numerorevis) {
		super(isbn, titulo, anopubli);
		this.numerorevis = numerorevis;
	}
	
	
}
