package ejercicio;

import java.util.Scanner;

public class Llamada_Funciones {

	public static int menu(Scanner b){
		int x=b.nextInt();
		System.out.println("1.-Calcular la raíz cuadrada de un número\n"
				+ "2. Contar vocales en una cadena\n"
				+ "3. Generar un número aleatorio\n"
				+ "4. Calcular el factorial de un número\n"
				+ "5. Comprobar si una cadena es un palíndromo. (Se lee igual de izq a derecha que de\n"
				+ "6. Encontrar el máximo común divisor (MCD).\n"
				+ "7. Calcular la potencia de un número.\n"
				+ "8. Invertir una cadena.\n"
				+ "9. Calcular la distancia entre dos puntos en un plano.\n"
				+ "10. Encontrar el número mayor de un array.\n"
				+ "11. Generar un array de números aleatorios.\n"
				+ "12. Contar caracteres en una cadena.\n"
				+ "13. Calcular la suma de los dígitos de un número.\n"
				+ "14. Realizar una búsqueda lineal en un array.\n"
				+ "15. Salir\n");
		return x;
		
	}
	
	public static int contarvocales(char a[]) {
		int cont=0;
		for (char c : a) {
			if (c=='a') {
				cont++;
			}else if (c=='e') {
				cont++;
			}else if (c=='i') {
				cont++;
			}else if (c=='o') {
				cont++;
			}else if (c=='u') {
				cont++;
			}
		}
		return cont;
	}
	

	
	
	
	

}
