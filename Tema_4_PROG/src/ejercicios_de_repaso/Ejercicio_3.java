package ejercicios_de_repaso;

import java.util.Scanner;

public class Ejercicio_3 {

	public static void main(String[] args) {
		
		//El codigo esta sin terminar por falta de datos en el enunciado del problema
		
		/* Realiza un programa que calcule la compra de videojuegos de dos tipos de consola:
			1. PSP 5
			2. Nintendo Switch
			3. Otros
		Elección de la primera opción PSP 5
		Si el usuario elige la primera opción, le saldrá un submenú con las siguientes
		opciones:
			a. Juegos de terror – Slitterhead PS5
			b. Juegos de terror - Little Nightmares 3 PS5
		Si el usuario elige el primer juego, tendrá un descuento de un 10% sobre la cantidad total.
		Si el usuario elige el segundo juego, tendrá un descuento de un 15% sobre la cantidad
		total.
		Elección de la segunda opción Nintendo Switch
		Los juegos de la Nintendo Switch están en promoción y se les aplicará un 25% de
		descuento a cualquier juego.
		Todos los juegos de la Nintendo Switch tienen un precio de 30 €.
		Elección de la tercera opción Nintendo Switch
		Al elegir esta opción le saldrá la información de poder comprar:
			- Juegos de mesa
			- Muñecos
		Ninguna de las dos opciones está en promoción.
		A tener en cuenta:
		- Al usuario se le pedirá por teclado la cantidad de juegos o muñecos que desee
		comprar.
		
		- El precio final se le calculará teniendo como referencia la siguiente tabla:
		PSP5 Juegos de terror - Slitterhead PS5 50 €
		Juegos de terror - Little Nightmares 3 PS5 45 €
		Nintendo Switch
		Cualquier juego 30 €
		Otros Juegos de mesa 20 €
		Muñeco 15 € */
		
		Scanner consola = new Scanner(System.in);
		
		int tipocons,cantjuego;
		double descuento1=0.90,descuento=0.85,descuento3=0.70, sumadescuento=0,cuenta=0,sumajuego=0;
		String tipojuego;
		
		System.out.println("Introduce el tipo de compra siendo: 1- PS5 2- Nintendo Switch 3-Otros (debe seleccionar con numeros del 1 al 3)");
		
		tipocons=consola.nextInt();
		consola.nextLine();
		
		switch (tipocons) {
		case 1:
			System.out.println("Has seleccionado PS5.\n\nHay 2 juegos disponibles:\n a- Juegos de Terror - Slitterhead PS5\nb-Juegos de Terror - Little NightMare 3 PS5 debe introducirlo con numeros:");
			tipojuego=consola.nextLine();
			
			switch (tipojuego) {
			case "a":
				System.out.println("Has elegido el primer juego y tienes un descuento de: 15% en la cantidad total");
				sumadescuento+=0.90;
			
				System.out.println("¿Que cantidad de juegos necesitas?");
				
				break;
				
			case "b":
				System.out.println("Has elegido el segundo juego y tienes un descuento de: 15% en la cantidad total");
				sumadescuento+=0.85;
				sumajuego+=45;
				break;

			default:
				break;
			}
			
			break;
		case 3:
			System.out.println("Has seleccionado Nintendo Switch y todos los juego tienen un 35% a cualquier juego");
			System.out.println("Has seleccionado 'Otros'.\n\nHay 2 tipos disponibles:\nJuegos de Mesa y Muñecos (debe ser introducido con letras)");
			tipojuego=consola.nextLine().toUpperCase();
			
			switch (tipojuego) {
			case "JUEGOS DE MESA":
				System.out.println("Has elegido el primer juego y tienes un descuento de: 15% en la cantidad total");
				sumadescuento+=0.90;
				sumajuego+=50;
				break;
				
			case "MUÑECOS":
				System.out.println("Has elegido el segundo juego y tienes un descuento de: 15% en la cantidad total");
				sumadescuento+=0.85;
				sumajuego+=45;
				break;

			default:
				break;
			}
			
			break;
			
			
			

		default:
			System.out.println("El tipo de compra introducida no es valida");
			break;
		}
		
		

	}

}
