package cuenta_Ej3_rel2;

public class CuentaBancaria {
	private int numCuenta;
	private int DNI;
	private double SaldoActual;
	private double intAnual;

	// Constructor por defecto
	public CuentaBancaria() {
		this.numCuenta = 111111111;
		this.DNI = 22222222;
		this.SaldoActual = 0000;
		this.intAnual = 5;
	}

	// Constructor para rellenar
	public CuentaBancaria(int numCuenta, int DNI, int SaldoActual, int intAnual) {
		this.numCuenta = numCuenta;
		this.DNI = DNI;
		this.SaldoActual = SaldoActual;
		this.intAnual = intAnual;

	}

	public int getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(int numCuenta) {
		this.numCuenta = numCuenta;
	}

	public int getDNI() {
		return DNI;
	}

	public void setDNI(int dNI) {
		DNI = dNI;
	}

	public double getSaldoActual() {
		return SaldoActual;
	}

	public void setSaldoActual(int saldoActual) {
		SaldoActual = saldoActual;
	}

	public double getIntAnual() {
		return intAnual;
	}

	public void setIntAnual(int intAnual) {
		this.intAnual = intAnual;
	}
	
	
	public void actualizarSaldo(int saldoAct) {
		this.SaldoActual=saldoAct*calcularInt(this.intAnual);
	}
	
	public double calcularInt(double intanual) {
		double resultado;
		resultado=(100-intanual)/100;
		return resultado;
	}	
	
	
	public void ingresar(double cantidad) {
		this.SaldoActual+=cantidad;
	}
	
	public void retirar(double cantidad) {
		if (this.SaldoActual>cantidad) {
			
			System.out.println("Su dinero ha sido retirado con exito: "+cantidad);
			double resultado=this.SaldoActual-cantidad;
			System.out.println("El saldo actual es de : "+resultado);
		}else {
			System.out.println("No tiene suficiente saldo para retirar esa cantidad");
		}
	}

	@Override
	public String toString() {
		return "CuentaBancaria Numero de Cuenta: " + numCuenta + ", DNI: " + DNI + ", Saldo actual: " + SaldoActual
				+ ", Interes anual: " + intAnual;
	}
	
	
	
}
