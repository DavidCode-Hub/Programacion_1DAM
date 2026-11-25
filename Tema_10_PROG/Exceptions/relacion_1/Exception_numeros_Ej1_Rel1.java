package relacion_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_numeros_Ej1_Rel1 {

	public static void main(String[] args) {
		Scanner consola= new Scanner (System.in);
		
		
		
		for (int i = 0; i < 6; i++) {
			boolean numValido=false;
			int numero=0;
			
			do {
				try {
					System.out.println("Introduce 1 número");
					numero= Integer.parseInt(consola.nextLine());
					numValido=true;
					
					
				} catch (InputMismatchException e) {
					System.out.println("El dato introducidoo no es correcto, debe ser un numero entero");
				}
				catch (NumberFormatException e) {
					System.out.println("El dato introducidoo no es correcto, debe ser un numero entero");
				}
				
				
			} while (!numValido);
		}
		
		
		

	}

}
