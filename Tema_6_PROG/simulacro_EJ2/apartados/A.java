package apartados;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		
		Scanner consola=new Scanner (System.in);
	
		String palabra,resultpalabra;
		
		System.out.println("Introduce la palabra");
		palabra=consola.nextLine();
		
		int tamanopalabra=palabra.length();
		
		int resultadotam=tamanopalabra/2;
		
		
		resultpalabra=palabra.substring(resultadotam);
		System.out.println("El resultado de la palabra es: "+resultpalabra);
	}

}
