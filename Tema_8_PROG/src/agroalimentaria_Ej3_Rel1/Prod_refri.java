package agroalimentaria_Ej3_Rel1;

public class Prod_refri extends Info_Comun {
	protected int cod_org_super;

	/**
	 * @param fecha_Caducidad
	 * @param num_Lote
	 * @param cod_org_super
	 */
	public Prod_refri(String fecha_Caducidad, int num_Lote, int cod_org_super) {
		super(fecha_Caducidad, num_Lote);
		this.cod_org_super = cod_org_super;
	}
	
	public Prod_refri() {
		
	}

	
	public int getCod_org_super() {
		return cod_org_super;
	}

	public void setCod_org_super(int cod_org_super) {
		this.cod_org_super = cod_org_super;
	}
	
	

	

	
}
