package empleado_ej4_rel2;

public class Empleado {
	
	private String NIF;
	private double sueldobase;
	private double precio_horaextra;
	private int horaextmes;
	private double IRPF;
	private boolean casado;
	private int num_hijos;
	private double totalhext;
	private double sueldobruto;
	
	
	//Constructor con NIF
	/**
	 * 
	 * @param NIF
	 * @param sueldobase
	 * @param precio_hraextra
	 * @param horaextmes
	 * @param IRPF
	 * @param casado
	 * @param num_hijos
	 */
	public Empleado(String NIF,double sueldobase, double IRPF,boolean casado,int num_hijos ){
		this.NIF=NIF;
		this.sueldobase=sueldobase;
		this.totalhext=calculoextra(this.horaextmes);
		this.IRPF=IRPF;
		this.casado=casado;
		this.num_hijos=num_hijos;
	}
	
	//Constructor sin NIF
	/**
	 * 
	 * @param sueldobase
	 * @param precio_hraextra
	 * @param horaextmes
	 * @param IRPF
	 * @param casado
	 * @param num_hijos
	 */
	public Empleado(double sueldobase, double precio_hraextra, int horaextmes, double IRPF,boolean casado,int num_hijos ){
		
		this.sueldobase=sueldobase;
		this.precio_horaextra=precio_hraextra;
		this.horaextmes=horaextmes;
		this.IRPF=IRPF;
		this.casado=casado;
		this.num_hijos=num_hijos;
	
	}
	
	
	public double calculoextra(int horaextmes) {
		double resultado=this.precio_horaextra*this.horaextmes;
		
		return this.totalhext=resultado;
		
	}
	
	
	/**
	 * 
	 * @return
	 */
	public double calculobruto() {
		double resultado=this.sueldobase+this.totalhext;
		return this.sueldobruto=resultado;
		
	}
	
	public
	
	
	
	
}
