package apartados;

import java.util.Scanner;

public class E {

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);

		String palabra;

		System.out.println("Introduce la palabra");
		palabra = consola.nextLine().toLowerCase();
		

		char resultpalabra[] = new char[palabra.length()];

		for (int i = 0; i < palabra.length(); i++) {  		//Me almacena los caracteres.
			resultpalabra[i]=palabra.charAt(i);
		
		}//Fin for
		int cont=0;
		for (int i = 0; i < resultpalabra.length; i++) {
			
			if (resultpalabra[i]=='a') {
				cont++;
			}if (resultpalabra[i]=='e') {
				cont++;
			}if (resultpalabra[i]=='i') {
				cont++;
			}if (resultpalabra[i]=='o') {
				cont++;
			}if (resultpalabra[i]=='u') {
				cont++;
			}
			
		}//Fin for
		
		System.out.println("La cantidad de vocales que cotiene esta palabra es: "+cont);
	}
}
