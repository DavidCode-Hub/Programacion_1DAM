package cuenta_EJ1_Rel2;

public class CuentaAhorro extends Cuenta {
	protected boolean activa;
	
	
	public boolean cuentaActiva() {
		if (super.saldo>10000) {
			 return this.activa=true;
		} else {
			return this.activa=false;
		}
	}
	/**
	 * Constructor
	 * @param saldo
	 * @param tasaAnual
	 * @param activa
	 */
	public CuentaAhorro(float saldo, float tasaAnual, boolean activa) {
		super(saldo, tasaAnual);
		this.activa = activa;
	}


	/**
	 * @param saldo
	 * @param tasaAnual
	 */
	public CuentaAhorro() {
		
	}


	/**
	 * @return the activa
	 */
	public boolean isActiva() {
		return activa;
	}


	/**
	 * @param activa the activa to set
	 */
	public void setActiva(boolean activa) {
		this.activa = activa;
	}
	
	
	/**
	 * 
	 * @param cantidad
	 */
	
	public void consignar(float cantidad) {
		super.consignar(cantidad);
	}
	
	/**
	 * 
	 * @param cantidad
	 */
	public void retirar(float cantidad) {
		
		if (activa) {
			super.retirar(cantidad);
		}else {
			System.out.println("No se puede retirar dinero");
		}
		
	}
	
	/**
	 * 
	 */
	public float calculadoraInteres() {
		return super.calculadoraInteres();
	}
	
	/**
	 * 
	 */
	public void extractoMensual() {
		super.extractoMensual();
		if (super.numRetiros>=4) {
			super.comisionmensual+=1000;
		}
		
		if (cuentaActiva()) {
			System.out.println("La cuenta sigue activa");
		}else {
			System.out.println("Lo sentimos pero su cuenta no sigue activa");
		}
	}
	
	
	
	@Override
	public String toString() {
		return super.toString()+"Cuenta activa: "+activa;
		
	}
	
	
	
	
	
}
