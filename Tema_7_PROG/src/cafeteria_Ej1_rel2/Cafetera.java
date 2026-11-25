package cafeteria_Ej1_rel2;



public class Cafetera {
	private int capacidadMaxima;
	private int capacidadActual;
	private int id;
	
	//Constructores
	
	public Cafetera(int id1) {
		this.id=id1;
		this.capacidadMaxima=1000;
		this.capacidadActual=50;
		
	}
	//Constructor que pasa la capacidad que tiene la cafetera y ajusta la misma como Máxima
	public Cafetera(int capacidad, int id1) {
		this.id=id1;
		this.capacidadMaxima=capacidad;
		this.capacidadActual=capacidad;
	}
	
	public Cafetera(int capacidadmax, int capacidadactual, int id1) {
		
		if (capacidadactual>capacidadmax) {
			this.id=id1;
			this.capacidadActual=capacidadmax;
			this.capacidadMaxima=capacidadmax;
			
		}else {
			this.id=id1;
			this.capacidadActual=capacidadactual;
			this.capacidadMaxima=capacidadmax;
		}
	}
	
	//Getters and Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCapacidadMaxima() {
		return capacidadMaxima;
	}
	
	public void setCapacidadMaxima(int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}
	public int getCapacidadActual() {
		return capacidadActual;
	}
	public void setCapacidadActual(int capacidadActual) {
		this.capacidadActual = capacidadActual;
	}
	
	public void llenarCafetera(int cantidadactual) {
		this.capacidadActual=cantidadactual;
	}
	
	/**
	 * Evalua la acción de servir una taza con una cantidadaservir pedida por parametro.
	 * @param cantidadaservir int - Pedida al usuario.
	 */
	public void servirTaza(int cantidadaservir) {
		if (cantidadaservir>=this.capacidadActual) {
			System.out.println("La taza se ha llenado con "+this.capacidadActual);
		}else {
			System.out.println("La taza se ha rellenado con "+cantidadaservir);
		}
	}
	
	public void vaciarCafetera() {
		this.capacidadActual=0;
		
		System.out.println("La cantidad actual de la cafetera es 0. ");
	}
	
	/**
	 * Agrega café a la cafetera hasta su capacidad máxima.
	 * @param cantidad int - Cantidad de café a agregar.
	 */
	public void agregarCafe(int cantidad) {
		
		if (cantidad+this.capacidadActual< this.capacidadMaxima) {
			
			this.capacidadActual+=cantidad;
			System.out.println("La cafetera tiene la cantidad de "+ this.capacidadActual);
		}else {
			cantidad-=this.capacidadMaxima;
			System.out.println("La cantidad ha superado la capacidad de la cafetera ha quedado por rellenar "+cantidad);
		}
	}
	
	
	
	
	
	
}
