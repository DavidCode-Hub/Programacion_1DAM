package agroalimentaria_Ej3_Rel1;

public class Prod_conge extends Info_Comun{
	protected double temp_conge;

	/**
	 * @param fecha_Caducidad
	 * @param num_Lote
	 * @param temp_conge
	 */
	public Prod_conge(String fecha_Caducidad, int num_Lote, double temp_conge) {
		super(fecha_Caducidad, num_Lote);
		this.temp_conge = temp_conge;
	}
	
	public Prod_conge() {
		
	}

	/**
	 * @return the temp_conge
	 */
	public double getTemp_conge() {
		return temp_conge;
	}

	/**
	 * @param temp_conge the temp_conge to set
	 */
	public void setTemp_conge(double temp_conge) {
		this.temp_conge = temp_conge;
	}
	
	
	
	
	
	
	
	
	
	
	
}
