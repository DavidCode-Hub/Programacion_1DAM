package relacion_ejercicios_1;

import java.util.Iterator;
import java.util.Scanner;
public class Ejercicio_clase_2 {

	public static void main(String[] args) {
		Scanner consola=new Scanner(System.in);
		/*Genera 2 arrays A y B con String insertados por teclado, Recorre los Arrays y vuelca en un array auxiliar los String
		 * que estén duplicados en A y en B */
		
	
		
		System.out.println("Introduce el numero de cantidad de palabras a introducir:");
		int tamano= consola.nextInt();
		consola.nextLine();
	
		String []A= new String[tamano];
		String []B= new String[tamano];
		String []duplicado= new String[tamano];
		String []aux= {"A" ,"B" ,"Duplicado"};
		
		System.out.println("Introduce las palabras del Arrays A");
		
		for (int i = 0; i < A.length; i++) {
			System.out.println("Palabra"+"[ "+ (i+1)+ "]");
			A[i]=consola.nextLine();
			
			
		}
		
		System.out.println("Introduce las palabras del Arrays B");
		for (int i = 0; i < B.length; i++) {
			System.out.println("Palabra"+"[ "+ (i+1)+ "]");
			B[i]=consola.nextLine();
			
		}
		System.out.println("Arrays A es: ");
		for (int i = 0; i < A.length; i++) {
			System.out.print("Palabra "+"[ "+ (i+1)+ "]     ");
			System.out.println("' "+ A[i]+ "'");
			
			
		}
		System.out.println("Arrays B es: ");
		for (int i = 0; i <A.length; i++) {
			System.out.print("Palabra "+"["+ (i+1)+ "]     ");
			System.out.println("' "+ B[i]+ "'");
			
		}
		
		for (int i = 0; i < A.length; i++) {
			if (A[i].equalsIgnoreCase(B[i])) {
				duplicado[i]=A[i];
			}
				
		}
		System.out.printf("\n %10s %10s %12s \n", "Array A" , "Array B", "Array Duplicado");
			for (int i = 0; i < tamano; i++) {
				if (duplicado[i]!=null) {
					System.out.printf("\n %10s %10s %10s \n", A[i],B[i],duplicado[i]);
				}
				
			}
		
		
		consola.close();
	}

}
