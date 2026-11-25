package matematicas;

public class Ejercicio_16 {

	public static void main(String[] args) {
		int numeros;
		System.out.println("Los números capicua son:");
		for (int i = 0; i < 99999; i++) {
			numeros=i;
			if (Varias.esCapicua(numeros)) {
				System.out.println(numeros);
			}
		}

	}

}
