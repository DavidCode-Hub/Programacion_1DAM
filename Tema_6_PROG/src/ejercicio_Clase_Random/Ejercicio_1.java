package ejercicio_Clase_Random;

import java.util.Iterator;

public class Ejercicio_1 {

	public static void main(String[] args) {
		int tirada,suma=0;
	
		
		
		System.out.println("Su tirada tienen el número: ");
		for (int i = 1; i <=3; i++) {
			tirada=(int)(Math.random()*((6-1)+1)+1);
			
			System.out.println("Tirada"+i+" : "+tirada);
			
			suma+=tirada;
			
		}
		System.out.println("El total de números del dado es: "+suma);

	}

}
