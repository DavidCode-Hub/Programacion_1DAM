package cuenta_Ej3_rel2;

public class Main_Cuenta_Ej3 {

	public static void main(String[] args) {
		CuentaBancaria cuenta1 = new CuentaBancaria();
		CuentaBancaria cuenta2 = new CuentaBancaria(548729921, 98765432, 1000, 3);
		System.out.println("------------------------");
		System.out.println(cuenta1);
		
		cuenta1.actualizarSaldo(120);
		cuenta1.ingresar(50.47);
		System.out.println("------------------------");
		System.out.println(cuenta1);
		cuenta1.retirar(200);
		cuenta1.retirar(100);
		System.out.println("------------------------");
		System.out.println(cuenta1);
		System.out.println("------------------------");
		
		
		System.out.println(cuenta2);

	}

}
