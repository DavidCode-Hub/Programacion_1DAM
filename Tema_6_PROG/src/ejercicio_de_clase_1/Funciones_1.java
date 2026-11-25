package ejercicio_de_clase_1;

public class Funciones_1 {
	/**
	 * FUncion que devuelve una suma de 4 nuúmeros.
	 * 
	 * @param a Parametro tipo int el cual es un número por el que vamos a sumar
	 * @param b Parametro tipo int el cual es un número por el que vamos a sumar
	 * @param c Parametro tipo int el cual es un número por el que vamos a sumar
	 * @param d Parametro tipo int el cual es un número por el que vamos a sumar
	 * @return
	 */
	public static double suma(double a, double b, double c, double d) {

		double resultado = a + b + c + d;

		return resultado;

	}

	/**
	 * Devuelve el resultado de la multiplicación.
	 * 
	 * @param a Es de tipo int que es un número por el que vamos a multiplicar.
	 * @return
	 */
	public static double multiplica(double a) {
		double resultado = a * 2;

		return resultado;

	}

	/**
	 * Devuelve por pantalla un array en la que la guarda dentro de un array/tabla
	 * 
	 * @param a El parametro a es de tipo String que es la plabra a evaluar.
	 * @param b Parametro b es el array que nos da en tiemp de ejecución.
	 */
	public static char[] arraychar(String a, char b[]) {

		for (int i = 0; i < b.length; i++) {
			b[i] = a.charAt(i);
		}
		return b;

	}
	/**
	 * Devuelve la resta de la función suma(a,b,c,d) la multiplica por 3 y resta 
	 * el resultado de la suma con el resultado de la multiplicación.
	 * @param a Parametro int introducido por teclado.
	 * @param b Parametro int introducido por teclado.
	 * @param c Parametro int introducido por teclado.
	 * @param d Parametro int introducido por teclado.
	 * @return
	 */
	public static double resta(double a, double b, double c, double d) {
		double z = suma(a, b, c, d);
		double y = 3 * z;

		return z - y;

	}

}
