package relacion_ejercicios_3;

public class Ejercicio_18 {

	public static void main(String[] args) {
		int numero,nummulti,resultado,resmulti;
		
		for (numero= 1; numero<=10; numero++) {
			System.out.println("\nTabla: "+numero);
			for (nummulti= 1; nummulti<=10; nummulti++) {
				resmulti=numero*nummulti;
				System.out.println(numero+" X "+nummulti+ " = " +resmulti);
			}
		}

	}

}
