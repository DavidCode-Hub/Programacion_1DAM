package relacion_1;

import java.util.Scanner;

public class Main_Cuenta_Ej4 {

	public static void main(String[] args) {
		Scanner consola=new Scanner (System.in);
		
		System.out.println("Indica el nombre del primer titular: ");
		Cuenta_Ej4 cuenta_1=new Cuenta_Ej4(consola.nextLine());
		
		System.out.println("Intorduce el titular de la segunda cuenta");
		Cuenta_Ej4 cuenta_2=new Cuenta_Ej4(consola.nextLine(),1000);
		
		
		System.out.println("El dinero de la cuenta 1 es: "+cuenta_1.getDinero());
		
		System.out.println("El dinero de la cuenta 2 es: "+cuenta_2.getDinero());
		
		System.out.println("Dinero a ingresar para la cuenta del titular "+cuenta_1.getNombre() +" :");
		cuenta_1.ingresar(consola.nextDouble());
		
		System.out.println("Dinero a ingresar para la cuenta del titular "+cuenta_2.getNombre() +" :");
		cuenta_2.ingresar(consola.nextDouble());

		
		System.out.println("La cuenta de "+cuenta_1.getNombre()+" tiene de saldo: "+cuenta_1.getDinero());
		System.out.println("La cuenta de "+cuenta_2.getNombre()+" tiene de saldo: "+cuenta_2.getDinero());
		
	}

}
