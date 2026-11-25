package ejercicio_repaso_1;


import java.util.Scanner;

public class Ejercicio_1 {

	public static void main(String[] args) {
		/*Leer 4 String introducidos por teclado y guárdalos en un array. Concatena los String
		separados por espacio y muéstralos por pantalla. Muestra los String que contengan la
		letra a.*/
		Scanner consola=new Scanner (System.in);
		
		String [] palabra=new String[4];
		
		System.out.println("Introduce 4 palabras: ");
		for (int i = 0; i < palabra.length; i++) {
			System.out.print("Palabra "+"["+i+"]: " );
			palabra[i]=consola.nextLine().toLowerCase();
		}
		
		
		for (int i = 0; i < palabra.length; i++) {
			System.out.print(palabra[i]+" ");
		}
		
		for (int i = 0; i < palabra.length; i++) {
			String evalpalabra=palabra[i];
			
			if (evalpalabra.indexOf('a')!=-1) {
				System.out.println("La palabra introducida con letra 'a' es: "+evalpalabra);
			}
			
		}
		consola.close();
		
	}

}
