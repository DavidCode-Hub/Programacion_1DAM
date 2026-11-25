package relacion_1;

import java.util.Scanner;

public class Main_Fraccion {

	public static void main(String[] args) {
		Scanner consola=new Scanner (System.in);
		
		Fraccion fac1=new Fraccion();
		
		
		fac1.setNumerador(consola.nextInt());
		fac1.setSigno(consola.nextInt());
		fac1.setDenominador(consola.nextInt());
		
		
		
	}

}
