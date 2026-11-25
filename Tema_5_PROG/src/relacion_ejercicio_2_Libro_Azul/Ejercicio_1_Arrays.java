package relacion_ejercicio_2_Libro_Azul;

public class Ejercicio_1_Arrays {

	public static void main(String[] args) {
		
		/*Define un array de 12 números enteros con nombre num y asigna los valores
		según la tabla que se muestra a continuación. Muestra el contenido de todos
		los elementos del array. ¿Qué sucede con los valores de los elementos que no
		han sido inicializados?*/
		
		int []numeros= new int[12];
		
		numeros[0]=32;
		numeros[1]=-2;
		numeros[4]=0;
		numeros[6]=14;
			for (int i = 0; i < numeros.length; i++) {
				System.out.println("Tus numeros son:"+numeros[i]+ " y la posicion de tu array es:"+i);
			}
			

		

	}

}
