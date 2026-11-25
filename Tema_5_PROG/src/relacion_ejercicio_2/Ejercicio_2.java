package relacion_ejercicio_2;

import java.util.Scanner;

public class Ejercicio_2 {

	public static void main(String[] args) 
		throws InterruptedException{
		/*Crear dos matrices de nxn y sumar sus valores, los resultados se deben almacenar en otra
		matriz. Los valores y la longitud, serán insertados por el usuario. Mostrar las matrices
		originales y el resultado.*/
		
		Scanner consola=new Scanner (System.in);
		
		int cant;
		System.out.println("Introduce la cantidad que quiere que tenga tu array");
		cant= consola.nextInt();
		
		Thread.sleep(1000);
		
		System.out.println("Tu array generado es de "+cant+" x "+cant);
		
		int [][]numero1 = new int [cant][cant];
		
		int [][]numero2 = new int [cant][cant];
		
		int [][]resultado= new int [cant][cant];
		
		System.out.println("Introduce el numerodel array 1: ");
		for (int i = 0; i < numero1.length; i++) {
			for (int j = 0; j < numero1.length; j++) {
				System.out.println("Posición ["+i+"] "+" ["+j+"]: " );
				numero1[i][j]=consola.nextInt();
					
			}
			
			
		}// Fin for
		System.out.println("Introduce el numero del array 2: ");
		for (int i = 0; i < numero1.length; i++) {
			for (int j = 0; j < numero1.length; j++) {
				
				System.out.print("Posición ["+i+"] "+" ["+j+"]: ");
				numero2[i][j]=consola.nextInt();
					
			}
			
			
		}// Fin for
		
		System.out.println("Resultado de tu suma ");
		System.out.println();
		for (int i = 0; i < resultado.length; i++) {
			for (int j = 0; j < resultado.length; j++) {
				
				
				resultado[i][j]=numero1[i][j]+numero2[i][j];
				System.out.println("Posición ["+i+"] "+" ["+j+"]: " + resultado[i][j]);
			}
			
			
		}// Fin for
		
		
		
		consola.close();

	}

}
