package inventario_Simulacro_Examen;


public class Almacen {
	
	private Articulos[] almacen;
	
	
	//Constructores
	public Almacen() {
		this.almacen=new Articulos[10];
	}
	
	public Almacen(int tamano) {
		this.almacen=new Articulos[tamano];
	}
	
	
	public void alta(Articulos Art) {
		boolean introducido=false;
		
		for (int i = 0; i < almacen.length && !introducido; i++) {
			if (almacen[i]!=null) {
				
				if (existeArt(Art)) {
					suma(Art,almacen[i]);
					
					introducido=true;
					
				} else {
					almacen[i] = Art;
					introducido = true;
				}
			}else {
				introducido=false;
			}
		}
		
		if (introducido) {
			System.out.println("El articulo ha sido introducido con exito");
		}else {
			System.out.println("El articulo no ha podido ser añadido debe seleccionar otro");
		}
		
	}
	
	
	public void baja(int id) {
		
		boolean eliminado=false;
		
		for (int i = 0; i < almacen.length && !eliminado; i++) {
			if (existeid(id)) {
				System.out.println("El articulo existe en la base de datos.");
				almacen[i]=null;
				eliminado=true;
			}
		}if (eliminado) {
			System.out.println("El articulo se ha dado de baja correctamente");
		}else {
			System.out.println("El articulo no ha podido ser eliminado debe seleccionar otro");
		}
	}
	
	public void listatotal() {
		for (int i = 0; i < almacen.length; i++) {
			if (almacen[i]!=null) {
				System.out.println("Codigo: "+almacen[i].getCodigo());
			}
		}
	}
	
	
	//Funciones Añadidas para simplificar codigo
	
	
	
	public boolean existeArt(Articulos Art) {
		for (int i = 0; i < almacen.length; i++) {
			if (almacen[i].getCodigo()==Art.getCodigo()) {
				return true;
			}
		}return false;
	}
	
	public boolean existeid(int id) {
		for (int i = 0; i < almacen.length; i++) {
			if (almacen[i].getCodigo()==id) {
				return true;
			}
		}return false;
	}
	
	public void suma(Articulos Art, Articulos Art2) {
		
		
		Art.setStock(Art.getStock()+Art2.getStock());
		
	}
	
	public void resta(Articulos Art,int cantidad) {
		if ((Art.getStock()+cantidad)>0) {
			Art.setStock(Art.getStock()-Art.getStock());
		}
		
	}
}
