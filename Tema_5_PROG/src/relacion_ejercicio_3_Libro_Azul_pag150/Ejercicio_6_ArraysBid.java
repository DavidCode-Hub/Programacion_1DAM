package relacion_ejercicio_3_Libro_Azul_pag150;

public class Ejercicio_6_ArraysBid {

	public static void main(String[] args) {
		int[][] numeros = new int[6][10];

		for (int i = 0; i < numeros.length; i++) {
		    for (int j = 0; j < numeros[i].length; j++) {

		        int numAleatorio;
		        boolean repetido;

		        do {
		            numAleatorio = (int) (Math.random() * ((1000 - 0) + 1) + 0);
		            repetido = false;

		            // Comprobamos si el número ya existe en la matriz
		            for (int x = 0; x < numeros.length; x++) {
		                for (int y = 0; y < numeros[x].length; y++) {
		                    if (numeros[x][y] == numAleatorio) {
		                        repetido = true;
		                        break;
		                    }
		                }
		                if (repetido) break;
		            }

		        } while (repetido);

		        numeros[i][j] = numAleatorio;
		    }
		}
		int maximo = numeros[0][0];
		int minimo = numeros[0][0];
		int posicionmaxi = 0;
		int posicionmaxj = 0;
		int posicionmini = 0;
		int posicionminj = 0;

		System.out.println("------------------------");
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				System.out.println(numeros[i][j] + " ");

			}
			System.out.println();
		}
		System.out.println("------------------------");

		

		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				if (maximo <= numeros[i][j]) {
					maximo = numeros[i][j];
					posicionmaxi = i;
					posicionmaxj = j;
				}
				if (minimo >= numeros[i][j]) {
					minimo = numeros[i][j];
					posicionmini = i;
					posicionminj = j;

				}
				System.out.printf("%5s", numeros[i][j]);

			}
			System.out.println();
		}

		System.out.println("Cordenadas del numero maximo [" + posicionmaxi + "] " + " [" + posicionmaxj + "]");
		System.out.println("Cordenadas del numero minimo [" + posicionmini + "] " + " [" + posicionminj + "]");

	}

}
