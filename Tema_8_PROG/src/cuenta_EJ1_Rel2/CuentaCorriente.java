package cuenta_EJ1_Rel2;

public class CuentaCorriente extends Cuenta{
	protected float sobregiro=0;
	
	/**
	 * Constructor
	 * @param saldo
	 * @param tasaAnual
	 * @param sobregiro
	 */
	public CuentaCorriente(float saldo, float tasaAnual, int sobregiro) {
		super(saldo, tasaAnual);
		this.sobregiro = sobregiro;
	}
	
	public void retirarCC(float cantidad) {
		if (cantidad<this.saldo) {
			super.saldo-=cantidad;
			
		} else if ((cantidad-super.saldo)<super.saldo) {
			sobregiro= cantidad-super.saldo;
		}
	
	}
	
	public void consignarCC(float cantidad) {
		super.consignar(cantidad);
		
		if (sobregiro>=0) {
			this.sobregiro-=cantidad;
		}
	}
	
	public void extractoCC() {
		super.extractoMensual();
	}

	@Override
	public String toString() {
		return super.toString()+"Numero de transacciones: "+(super.numeroConsig+super.numRetiros)+"Valor Sobregiro: "+this.sobregiro;
	}

	

	
	
	
	
}
