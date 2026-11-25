package cuenta_EJ1_Rel2;

public class Cuenta {
	protected float saldo ;
	protected int numeroConsig=0 ;
	protected int numRetiros=0;
	protected float tasaAnual=0;
	protected float comisionmensual;
	
	/**
	 * @param saldo
	 * @param tasaAnual
	 */
	public Cuenta(float saldo, float tasaAnual) {
		this.saldo = saldo;
		this.tasaAnual = tasaAnual;
	}

	/**
	 * 
	 */
	public Cuenta() {
		
	}
	
	
	
	
	/**
	 * @return the saldo
	 */
	public float getSaldo() {
		return saldo;
	}

	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	/**
	 * @return the numeroConsig
	 */
	public int getNumeroConsig() {
		return numeroConsig;
	}

	/**
	 * @param numeroConsig the numeroConsig to set
	 */
	public void setNumeroConsig(int numeroConsig) {
		this.numeroConsig = numeroConsig;
	}

	/**
	 * @return the numRetiros
	 */
	public int getNumRetiros() {
		return numRetiros;
	}

	/**
	 * @param numRetiros the numRetiros to set
	 */
	public void setNumRetiros(int numRetiros) {
		this.numRetiros = numRetiros;
	}

	/**
	 * @return the tasaAnual
	 */
	public float getTasaAnual() {
		return tasaAnual;
	}

	/**
	 * @param tasaAnual the tasaAnual to set
	 */
	public void setTasaAnual(float tasaAnual) {
		this.tasaAnual = tasaAnual;
	}

	/**
	 * @return the comisionmensual
	 */
	public float getComisionmensual() {
		return comisionmensual;
	}

	/**
	 * @param comisionmensual the comisionmensual to set
	 */
	public void setComisionmensual(float comisionmensual) {
		this.comisionmensual = comisionmensual;
	}

	/**
	 * 
	 * @param cantidad
	 */
	
	public void consignar(float cantidad) {
		this.saldo=cantidad;
		numeroConsig++;
	}
	
	/**
	 * 
	 * @param cantidad
	 */
	public void retirar(float cantidad) {
		if (cantidad>this.saldo) {
			System.out.println("El la cantidad a retirar no puede ser mayor al saldo de la cuenta\nSaldo: "+this.saldo);
			
		} else {
			System.out.println("La cantidad en la cuenta es de "+this.saldo);
			this.saldo-=cantidad;
			System.out.println("La cantidad que queda en la cuenta es de: "+this.saldo);
		}
		numRetiros++;
	}
	
	/**
	 * 
	 */
	public float calculadoraInteres() {
		return this.saldo-=comisionmensual;
	}
	
	/**
	 * 
	 */
	public void extractoMensual() {
		float resultado;
		resultado=(this.saldo-comisionmensual)-calculadoraInteres();
		this.saldo=resultado;
	}

	@Override
	public String toString() {
		return "Cuenta [saldo=" + saldo + ", numeroConsig=" + numeroConsig + ", numRetiros=" + numRetiros
				+ ", tasaAnual=" + tasaAnual + ", comisionmensual=" + comisionmensual + "]";
	}
	
	
	
	
}
