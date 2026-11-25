package matematicas;

import java.util.Scanner;

public class Ejercicios_1_al_14 {

	public static void main(String[] args) {
		Scanner consola=new Scanner (System.in);
		
		// Ejercicio 1
		
		System.out.println("Ejercicio 1.- Mostrar un número si es capicua");
		
		int x;
		System.out.println("Introduce un número");
		x=consola.nextInt();
		
		boolean capicua= Varias.esCapicua(x);
		
		if (capicua) {
			System.out.println("El número "+ x+ " es capicua.");
		}else {
			System.out.println("El número introducido no es capicua: "+x);
		}
		System.out.println("\n");
		
		
		//Ejercicio 2
		
		System.out.println("Ejercicio 2.- Mostrar un número si es primo");
		
		int y;
		System.out.println("Introduce un número para evaluar si es primo:");
		y=consola.nextInt();
		
		
		boolean esprimo=Varias.esPrimo(y);
		
		if (esprimo) {
			System.out.println("El número "+ y+ "es primo.");
		}else {
			System.out.println("El número introducido no es primo: "+y);
		}
		
		System.out.println("\n");
		
		//Ejercicio 3
		
		System.out.println("Ejercicio 3.- Mostrar un número siguiente al número primo");
		
		int z;
		System.out.println("Introduce el número que queremos averiguar como siguiente primo: ");
		z=consola.nextInt();
		
		int siguienteprimo=Varias.siguientePrimo(z);
		
		System.out.println("El resultado es: "+z);
		
		System.out.println("\n");
		
		//Ejercicio 4
		
		System.out.println("Ejercicio 4.- Calcular un potencia.");
		
		int base, elevado;
		
		System.out.println("Introduce un número a elevar");
		base=consola.nextInt();
		
		System.out.println("Introduce un número al que elevaremos");
		elevado=consola.nextInt();
		
		double resultado=Varias.potencia(base, elevado);
		
		System.out.println("\n");
		
		//Ejercicio 5
		
		System.out.println("Ejercicio 5.- Cuenta el número de dígitos de un número entero.");
		
		int medidadigitos,resultadomed;
		
		System.out.println("Introduce un número a medir: ");
		medidadigitos=consola.nextInt();
		
		
		resultadomed=Varias.digitos(medidadigitos);
		
		System.out.println("La cantidad de dígitos del número es: "+resultadomed);
		
		System.out.println("\n");
		
		//Ejercicio 6
		
		System.out.println("Ejercicio 6.- Darle la vuelta a un número.");
		
		int volteanum,resultadovoltea;
		
		System.out.println("Introduce un número a medir: ");
		volteanum=consola.nextInt();
		
		
		resultadovoltea=Varias.digitos(volteanum);
		
		
		System.out.println("El resultado del número volteado es_ "+ resultadovoltea);
		
		System.out.println("\n");
		
		//Ejercicio 7 
		
		System.out.println("Ejercicio 7.- Devuelve el dígito que está en la posición n de un número entero.");
		
		int posiciondigito, numero, resultadonum;
		
		System.out.println("Introduce un número ");
		numero=consola.nextInt();
		
		System.out.println("Introduce la posición de un digito en especifico: ");
		posiciondigito=consola.nextInt();
		
		resultadonum=Varias.digitoN(numero, posiciondigito);
		
		System.out.println("El resultado de digito del numero: "+numero+" en la posición: "+posiciondigito+" es: "+resultadonum);
		
		System.out.println("\n");
		
		//Ejercicio 8 
		
		System.out.println("Ejercicio 8.- Da la posición de la primera ocurrencia de un dígito\n"
				+ "dentro de un número entero");
		
		int num1,resultadonum1,digitonum1;
		
		System.out.println("Introduce un número para buscar un digito:");
		num1=consola.nextInt();
		
		System.out.println("Introduce el digito a buscar: ");
		digitonum1=consola.nextInt();
		
		resultadonum1=Varias.posicionDeDigito(num1, digitonum1);
		
		System.out.println("El resultado de digito del numero: "+num1+" en la posición: "+digitonum1+" es: "+resultadonum1);
		
		System.out.println("\n");
		
		//Ejercicio 9
		
		System.out.println("Ejercicio 9.- Le quita a un número n dígitos por detrás (por la parte"
				+ "derecha).");
		
		int num2,resultadonum2,digitonum2;
		
		System.out.println("Introduce un número para retirarle un digito:");
		num2=consola.nextInt();
		
		System.out.println("Introduce la cantidad de digito a quitar: ");
		digitonum2=consola.nextInt();
		
		resultadonum2=Varias.quitaPorDetras(num2, digitonum2);
		
		System.out.println("El número es: "+num2+" la cantidad de digito que vamos a quitar es: "+digitonum2+" y el resultado es: "+resultadonum2);
		
		System.out.println("\n");
		
		//Ejercicio 10
		
		System.out.println("Ejercicio 10.- Le quita a un número n dígitos por delante (por la"
				+ "izquierda).");
		
		int num3,resultadonum3,digitonum3;
		
		System.out.println("Introduce un número para retirarle un digito:");
		num3=consola.nextInt();
		
		System.out.println("Introduce la cantidad de digito a quitar: ");
		digitonum3=consola.nextInt();
		
		resultadonum3=Varias.quitaPorDelante(num3, digitonum3);
		
		System.out.println("El número es: "+num3+" la cantidad de digito que vamos a quitar es: "+digitonum3+" y el resultado es: "+resultadonum3);
		
		System.out.println("\n");
		
		//Ejercicio 11
		
		System.out.println("Ejercicio 11.- Añade un dígito a un número por detrás.");
		
		int num4,resultadonum4,digitonum4;
		
		System.out.println("Introduce un número para pegarle un digito:");
		num4=consola.nextInt();
		
		System.out.println("Introduce la cantidad de digito a quitar: ");
		digitonum4=consola.nextInt();
		
		resultadonum4=Varias.pegaPorDetras(num4, digitonum4);
		
		System.out.println("El número es: "+num4+" la cantidad de digito es: "+digitonum4+" y el resultado es: "+resultadonum4);
		System.out.println("\n");
		
		//Ejercicio 12
		
		System.out.println("Ejercicio 12.- Añade un dígito a un número por delante.");
		
		
		int num5,resultadonum5,digitonum5;
		
		System.out.println("Introduce un número para pegarle un digito:");
		num5=consola.nextInt();
		
		System.out.println("Introduce la cantidad de digito a quitar: ");
		digitonum5=consola.nextInt();
		
		resultadonum5=Varias.pegaPorDelante(num5, digitonum5);
		
		System.out.println("El número es: "+num5+" la cantidad de digito es: "+digitonum5+" y el resultado es: "+resultadonum5); 
		System.out.println("\n");
		
		//Ejercicio 13 
		
		System.out.println("Ejercicio 13.- Toma como parámetros las posiciones inicial y final"
				+ "dentro de un número y devuelve el trozo correspondiente.");
		
		
		
		int num6,digitoinicial,digitofinal,resultadonum6;
		
		System.out.println("Introduce un número para coger un trozo de numero:");
		num6=consola.nextInt();
		
		System.out.println("Introduce el digito para poner al inicio del número");
		digitoinicial=consola.nextInt();
		
		System.out.println("Introduce el digito para poner al final del número");
		digitofinal=consola.nextInt();
		
		resultadonum6=Varias.trozoDeNumero(num6, digitoinicial, digitofinal);
		
		System.out.println("El número es: "+num6+" el digito del inicio es "+digitoinicial+" el digito del final es "+digitofinal+" y el resultado es: "+resultadonum6);
		
		System.out.println("\n");
		
		//Ejercicio 14
		
		System.out.println("Ejercicio 14.- Pega dos números para formar uno.");
		
		int num7,num8,resultadonum7;
		
		System.out.println("Introduce un número para retirarle un digito:");
		num7=consola.nextInt();
		
		System.out.println("Introduce el digito para poner al inicio del número");
		num8=consola.nextInt();
		
		
		
		resultadonum7=Varias.juntaNumeros(num7, num8);
		
		
		
		System.out.println("El número es: "+num7+" y "+num8+" y el resultado juntando los dos números es de: "+resultadonum7);
		
	}
	

}
