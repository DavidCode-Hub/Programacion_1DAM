package relacion_1;

public class Libro_Ej5 {
	
	private int isbn;
	private String Titulo;
	private String Autor;
	private int Numpag;
	private String Editorial="Rama";
	
	//Contructor Vacio
	public Libro_Ej5() {
		
		
	}
		
	//Contructor lleno
	public Libro_Ej5(int Isbn, String titulo, String autor, int numpag) {
		
		
		isbn = Isbn;
		Titulo = titulo;
		Autor = autor;
		Numpag = numpag;
		Editorial= "Rama";
	}
	
	
	public int getISBN() {
		return isbn;
	}
	public void setISBN(int iSBN) {
		isbn = iSBN;
	}
	public String getTitulo() {
		return Titulo;
	}
	public void setTitulo(String titulo) {
		Titulo = titulo;
	}
	public String getAutor() {
		return Autor;
	}
	public void setAutor(String autor) {
		Autor = autor;
	}
	public int getNumpag() {
		return Numpag;
	}
	public void setNumpag(int numpag) {
		Numpag = numpag;
	}

	
	@Override
	public String toString() {
		return "El libro con ISBN" + isbn +" creado por el autor " + Autor + " tiene " + Numpag+ " páginas "+"y es de la"
				+ " editorial: " + Editorial;
	}
	
	public void numpag(Libro_Ej5 a) {
		if (this.Numpag<a.getNumpag()) {
			System.out.println("El libro "+this.Titulo+" tiene más páginas");
		}else {
			System.out.println("El libro ' "+a.getTitulo()+" ' tiene más páginas");
		}
	}	
	
	
	
	
	
}
