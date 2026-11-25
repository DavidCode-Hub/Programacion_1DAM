package supermercado_Ej6_Rel3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Main_Supermercado {

	public static void main(String[] args) {
		Scanner consola=new Scanner(System.in);
		HashMap<String, Double> producprecio= new HashMap<String, Double>();
		int opc;
		producprecio.put("avena", 2.21);
		producprecio.put("garbanzos", 2.39);
		producprecio.put("tomate", 1.59);
		producprecio.put("jengibre", 3.13);
		producprecio.put("quinoa", 4.5);
		producprecio.put("guisantes", 1.60);
		String nombre;
		int cantidad;
		
		
		ArrayList<Producto> listacompra= new ArrayList<Producto>();
		
		do {
			
			System.out.println("Indica el nombre del producto");
			nombre=consola.nextLine();
			
			System.out.println("Introduce la cantidad de producto");
			cantidad=consola.nextInt();
			
			
			listacompra.add(new Producto(nombre, cantidad));
			
			System.out.println("Indica si quiere continuar 0-Salir");
			opc=consola.nextInt();
			consola.next();
			
		} while (opc!=0);
		
		Iterator<Producto> producto= listacompra.iterator();
		double preciocompra=0;
		System.out.println(producto);
		
		while (producto.hasNext()) {
			Producto producto2 = (Producto) producto.next();
			
			if (producprecio.containsKey(producto2)) { // Si el producto que le pasamos por parametro esta dentro del HashMap entraria dentro del if
				
				preciocompra+=(producto2.getCantidad()*producprecio.get(producto2.getNombre())); 
				// Calculamos el precio de la compra total cogiendo la cantidad del objeto con Iterator (producto)
				// se l multiplicamos cogiendo el valor del HashMap diciendole que tiene que ser del producto que tiene el Iterator es decir
				//productprecio.get(avena).
				
			}
		}
		
		System.out.println(listacompra);
		System.out.println("El total de la compra es: " + preciocompra);
		
	}

}
