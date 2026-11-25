package matematicas;

public class Ejercicio_15 {

	public static void main(String[] args) {
		int numeros;
		System.out.println("Los números primos es:");
		
		for (int i = 0; i < 1000; i++) {
			numeros=i;
			if (Varias.esPrimo(numeros)) {
				System.out.println(numeros);
			}
		}

	}

}
