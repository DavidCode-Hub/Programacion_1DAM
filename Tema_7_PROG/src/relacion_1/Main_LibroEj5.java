package relacion_1;

public class Main_LibroEj5 {

	public static void main(String[] args) {
		Libro_Ej5 libro1=new Libro_Ej5(192351,"El quijote","Miguel Cervantes", 450);
		
		Libro_Ej5 libro2=new Libro_Ej5(15798217,"El principito","Antoine de Saint-Exupéry", 100);
		
		libro1.numpag(libro2);
		
		System.out.println(libro1.toString());

	}

}
