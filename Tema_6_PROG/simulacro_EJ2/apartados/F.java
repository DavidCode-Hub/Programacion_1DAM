package apartados;

import java.util.Scanner;

public class F {

	public static void main(String[] args) {

		Scanner consola = new Scanner(System.in);

		String palabra;
		String caracternuevo;
		String palabraresult;

		int posicioncarac;

		System.out.println("Introduce la palabra");
		palabra = consola.nextLine().toLowerCase();

		System.out.println("Introduce la posición del caracter a cambiar: ");
		posicioncarac = consola.nextInt();

		System.out.println("Introduce el caracter nuevo: ");
		caracternuevo = consola.next();
		

		palabraresult=palabra.substring(0, posicioncarac) + caracternuevo + palabra.substring(posicioncarac + 1);

		System.out.println(palabraresult);
		/*
		char caracteres[i]=new char[palabra.length()];
		
		for (int i = 0; i < palabra.length(); i++) {
			caracteres[i]+=palabra.charAt(i);
		}
		
		
		for (int i = 0; i < caracteres.length; i++) {
			if (i==posicioncarac) {
				caracteres[i]=caracternuevo;
			}
		}
		*/
	
		
	}

}
