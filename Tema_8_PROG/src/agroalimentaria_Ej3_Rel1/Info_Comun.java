package agroalimentaria_Ej3_Rel1;

public class Info_Comun {
	protected String fecha_Caducidad;
	protected int Num_Lote;
	
	
	
	public Info_Comun(String fecha_Caducidad, int num_Lote) {
		this.fecha_Caducidad = fecha_Caducidad;
		this.Num_Lote = num_Lote;
	}
	
	
	public Info_Comun() {

	}


	public String getFecha_Caducidad() {
		return fecha_Caducidad;
	}


	public void setFecha_Caducidad(String fecha_Caducidad) {
		this.fecha_Caducidad = fecha_Caducidad;
	}


	public int getNum_Lote() {
		return Num_Lote;
	}


	public void setNum_Lote(int num_Lote) {
		Num_Lote = num_Lote;
	}
	
	
	
	
	
}
