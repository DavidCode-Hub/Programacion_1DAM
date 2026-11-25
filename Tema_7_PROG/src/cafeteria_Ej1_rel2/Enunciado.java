package cafeteria_Ej1_rel2;

public @interface Enunciado {
	
	/*
	 * 1. Desarrolla una clase Cafetera con atributos capacidadMáxima (la cantidad máxima de café que
		puede contener la cafetera) y cantidadActual (la cantidad actual de café que hay en la cafetera).
		Implementa además los siguientes métodos:
		- Constructor por defecto: establece la capacidad máxima en 1000ml y la actual en cero (cafetera
		vacía).
		- Constructor con la capacidad máxima de la cafetera; inicializa la cantidad actual de café a la
		capacidad máxima.
		- Constructor con la capacidad máxima y la cantidad actual. Si la cantidad actual es mayor que la
		capacidad máxima de la cafetera, la ajustará al máximo.
		- getters y setters.
		- llenarCafetera(): Hace que la cantidad actual sea igual a la capacidad.
		- servirTaza(int cantidad): Simula la acción de servir una taza con la capacidad indicada. Si la
		cantidad actual de café no alcanza para llenar la taza, se sirve lo que quede. Devolverá la cantidad
		de café servida.
		- vaciarCafetera(): Pone la cantidad de café actual en cero.
		- agregarCafe(int cantidad): Añade a la cafetera la cantidad de café indicada.*/
}
