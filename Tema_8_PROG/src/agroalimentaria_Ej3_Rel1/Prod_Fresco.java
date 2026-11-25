package agroalimentaria_Ej3_Rel1;

public class Prod_Fresco extends Info_Comun{
	protected String fecha_envasado;
	protected String Pais_origen;
	
	public Prod_Fresco(String fecha_Caducidad, int num_Lote, String fecha_envasado, String pais_origen) {
		super(fecha_Caducidad, num_Lote);
		this.fecha_envasado = fecha_envasado;
		this.Pais_origen = pais_origen;
	}
	
	public Prod_Fresco() {
		
	}

	public String getFecha_envasado() {
		return fecha_envasado;
	}

	public void setFecha_envasado(String fecha_envasado) {
		this.fecha_envasado = fecha_envasado;
	}

	public String getPais_origen() {
		return Pais_origen;
	}

	public void setPais_origen(String pais_origen) {
		Pais_origen = pais_origen;
	}
	
	
	
	
}
