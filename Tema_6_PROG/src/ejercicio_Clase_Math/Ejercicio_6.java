package ejercicio_Clase_Math;

public class Ejercicio_6 {

	public static void main(String[] args) {
		double resulfuncion,resultadogrados,grados; //Declaración de variables
		
		
		System.out.println("El resultado de la función es: ");
		for (int i = -100; i < 101; i++) {
			resultadogrados=Math.toRadians(i); // Hay que pasar los grados a radianes.
			
			resulfuncion=(Math.sin(4*i))+(Math.cos(2*i)); //Calculamos llamando a la función de coseno y seno.
			
			System.out.println("Número: "+i+" el resultado de al función es: "+resulfuncion);
		}

	}

}
