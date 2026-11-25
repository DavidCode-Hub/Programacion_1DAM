package relacion_ejercicio_2_Libro_Azul;

public class Ejercicio_4_Arrays {

	public static void main(String[] args) {
		/*Define tres arrays de 20 números enteros cada una, con nombres "numero", "cuadrado"
			y "cubo". Carga el array numero con valores aleatorios entre 0 y 100. 
			En el array cuadrado se deben almacenar los cuadrados de los valores que hay en el array
			numero. En el array cubo se deben almacenar los cubos de los valores que hay en
			numero. A continuación, muestra el contenido de los tres arrays dispuesto en tres
			columnas.*/
		
		int[]numero= new int[20];
		double[]cuadrado= new double[20];
		double[]cubo= new double[20];
		
		
		for (int i = 0; i < numero.length; i++) {
			int numeroAleatorio=(int)(Math.random()*((100-0)+1)+0);
			numero[i]=numeroAleatorio;
			
			cuadrado[i]=Math.pow(numero[i],2);
			
			cubo[i]=Math.pow(numero[i],3);
		}
		
		System.out.printf("%s %15s %10s","Numeros","Cuadrados","Cubo");
		
		for (int i = 0; i < numero.length; i++) {
			System.out.printf("\n  %-13d %-13.0f %.0f ", numero[i], cuadrado[i], cubo[i]);
		}

	}

}
