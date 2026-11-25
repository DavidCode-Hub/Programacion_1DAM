package simulacro_examen;

public class MaterialJuego{
	protected String material;
	protected int  numElemeny;
	protected double costeUnit;
	
	
	/**
	 * Constructor para pasar valores por parametro
	 * @param material
	 * @param numElemeny
	 * @param costeUnit
	 */
	public MaterialJuego(String material, int numElemeny, double costeUnit) {
		this.material = material;
		this.numElemeny = numElemeny;
		this.costeUnit = costeUnit;
	}
	
	
	// Constructor Vacio
	public MaterialJuego() {
		this.material="";
		this.numElemeny=0;
		this.costeUnit=0.0;
		
	}
	
	

	/**
	 * @return the material
	 */
	public String getMaterial() {
		return material;
	}

	/**
	 * @param material the material to set
	 */
	public void setMaterial(String material) {
		this.material = material;
	}

	/**
	 * @return the numElemeny
	 */
	public int getNumElemeny() {
		return numElemeny;
	}

	/**
	 * @param numElemeny the numElemeny to set
	 */
	public void setNumElemeny(int numElemeny) {
		this.numElemeny = numElemeny;
	}

	/**
	 * @return the costeUnit
	 */
	public double getCosteUnit() {
		return costeUnit;
	}

	/**
	 * @param costeUnit the costeUnit to set
	 */
	public void setCosteUnit(double costeUnit) {
		this.costeUnit = costeUnit;
	}
	/**
	 * 
	 * @return - double devuelve el valor del coste final del material de juego.
	 */
	public double costeJuego() {
		return this.costeUnit*this.numElemeny;
	}
	
	@Override
	public String toString() {
		return "MaterialJuego [material=" + material + ", numElemeny=" + numElemeny + ", costeUnit=" + costeUnit + "]";
	}
	
	
	
	
	
}
