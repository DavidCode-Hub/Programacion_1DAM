package apartados;

import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		Scanner consola=new Scanner (System.in);
		
		String palabra;
		char resultpalabra;
		
		System.out.println("Introduce la palabra");
		palabra=consola.nextLine();
		
		int tamanopalabra=palabra.length();
		
		System.out.println("");
		
		int resultadotam=tamanopalabra-2;
		
		resultpalabra=palabra.charAt(resultadotam);
		System.out.println("El resultado de la palabra es: "+resultpalabra);
	}

}
