package instalacion_deportiva_Ej4_Rel5;

public class Oficina extends Edificio implements Edificio_cubierto{
	
	protected int numOficinas;

	
	
	/**
	 * @param numOficinas
	 */
	public Oficina(int numOficinas) {
		this.numOficinas = numOficinas;
	}
	
	public Oficina() {
		
	}
	
	

	/**
	 * @return the numOficinas
	 */
	public int getNumOficinas() {
		return numOficinas;
	}

	/**
	 * @param numOficinas the numOficinas to set
	 */
	public void setNumOficinas(int numOficinas) {
		this.numOficinas = numOficinas;
	}

	@Override
	public double getSuperficieEdificio() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return "Oficina [numOficinas=" + numOficinas + "]";
	}
	
	
	
}
