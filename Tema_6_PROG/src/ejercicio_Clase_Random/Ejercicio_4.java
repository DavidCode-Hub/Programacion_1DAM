package ejercicio_Clase_Random;

public class Ejercicio_4 {

	public static void main(String[] args) {
		int numAleatorio, max=Integer.MAX_VALUE, min=Integer.MAX_VALUE,suma=0;
		double media;
		
		for (int i = 0; i < 50; i++) {
			numAleatorio=(int)(Math.random()*((199-100)+1)+100);
			suma+=numAleatorio;
			
			if (numAleatorio>=max) {
				max=numAleatorio;
			}
			if (numAleatorio<=min) {
				min=numAleatorio;
			}
		}//Fin for
		
		media=(int)suma/50;
		
		System.out.println("La suma de todos los números aleatorios es: "+suma+"\nSu media es: "+media+"\nEl número máximo es: "+max+"\nEl número minimo es: "+min);
	}

}
