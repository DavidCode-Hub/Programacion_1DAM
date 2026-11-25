package inventario_Simulacro_Examen;

public class Articulos {
	
	private int Codigo;
	private String Descripcion;
	private double Precio_compra;
	private double Precio_venta;
	private int Stock;
	private int contid=1;
	
	
	//Constructor por defeto a 0
	public Articulos() {
		this.Codigo=contid;
		this.Descripcion=" ";
		this.Precio_compra=0000;
		this.Precio_venta=0000;
		this.Stock=0;
		contid+=1;
		
	}
	
	//Cpnstructor para rellenar.
	public Articulos(int cod, String desc, double prec_compra, double prec_venta, double stock) {
		this.Codigo=cod;
		this.Descripcion=desc;
		this.Precio_compra=prec_compra;
		this.Precio_venta=prec_venta;
		this.Stock=0;
		this.contid+=1;
	}

	
	//Getters And Setters
	public int getCodigo() {
		return Codigo;
	}

	public void setCodigo(int codigo) {
		Codigo = codigo;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public double getPrecio_compra() {
		return Precio_compra;
	}

	public void setPrecio_compra(double precio_compra) {
		Precio_compra = precio_compra;
	}

	public double getPrecio_venta() {
		return Precio_venta;
	}

	public void setPrecio_venta(double precio_venta) {
		Precio_venta = precio_venta;
	}

	public int getStock() {
		return Stock;
	}

	public void setStock(int stock) {
		Stock = stock;
	}

	@Override
	public String toString() {
		return "Articulos [Codigo=" + Codigo + ", Descripcion=" + Descripcion + ", Precio_compra=" + Precio_compra
				+ ", Precio_venta=" + Precio_venta + ", Stock=" + Stock + "]";
	}
	
	
	
	

}
