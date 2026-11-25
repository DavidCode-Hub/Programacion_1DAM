package relacion_ejercicio_2_Libro_Azul;

public class Ejercicio_2_Arrays {

	public static void main(String[] args) {
		/*Define un array de 10 caracteres con nombre simbolo y asigna valores a los
		elementos según la tabla que se muestra a continuación. Muestra el contenido
		detodos los elementos del array. ¿Qué sucede con los valores de los elementos
		que no han sido inicializados?*/
		int contador=0;
		char []letras= new char[12];
		
		letras[0]='a';
		letras[1]='x';
		letras[4]='@';
		letras[6]=' ';
		
			for (int i = 0; i < letras.length; i++) {
				System.out.println("Tus numeros son:"+letras[i]+ " y la posicion de tu array es:"+i);
				
				
			}


	}

}
