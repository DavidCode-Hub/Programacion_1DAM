package compra_Ej7_Rel1;

import java.util.ArrayList;
import java.util.Iterator;

public class Carrito {
	protected ArrayList<Elemento> carrito;

	/**
	 * @param carrito
	 */
	public Carrito(ArrayList<Elemento> carrito) {

		this.carrito = carrito;
	}

	/**
	 * @param carrito
	 */
	public Carrito() {

		this.carrito = new ArrayList<Elemento>();
	}

	/**
	 * @return the carrito
	 */
	public ArrayList<Elemento> getCarrito() {
		return carrito;
	}

	/**
	 * @param carrito the carrito to set
	 */
	public void setCarrito(ArrayList<Elemento> carrito) {
		this.carrito = carrito;
	}

	@Override
	public String toString() {
		return "Carrito [carrito=" + carrito + "]";
	}

	/**
	 * 
	 * @param e
	 */
	public void agrega(Elemento e) {
		Iterator<Elemento> it = carrito.iterator();
		if (carrito.indexOf(e)!=-1) { // Preguntar porque aun asi añade el producto
			
			while (it.hasNext()) {
				Elemento elemento = (Elemento) it.next();
				if (elemento.getProducto().equalsIgnoreCase(e.getProducto())) {
					elemento.setCantidad(elemento.getCantidad() + e.getCantidad());
				}
			}
			
		} else {
			carrito.add(e);
		}

	}

	public int numeroDeElementos() {
		return carrito.size();
	}

	public double importeTotal() {
		double total = 0;
		Iterator<Elemento> it = carrito.iterator();
		it = carrito.iterator();

		while (it.hasNext()) {
			Elemento elemento = (Elemento) it.next();
			total += (elemento.getPrecio() * elemento.cantidad);
		}

		return total;
	}

}
