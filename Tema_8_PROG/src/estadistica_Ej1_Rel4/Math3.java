package estadistica_Ej1_Rel4;

public final class Math3 implements Extremos{

	@Override
	public int min(int[] a) {
		int valor=a[0];
		for (int i = 0; i < a.length; i++) {
			if (valor<a[i]) {
				valor=a[i];
			}
		}
		return valor;
	}

	@Override
	public int max(int[] a) {
		int valor=a[0];
		for (int i = 0; i < a.length; i++) {
			if (valor>a[i]) {
				valor=a[i];
			}
		}
		return valor;
	}

	@Override
	public double min(double[] a) {
		double valor=a[0];
		for (int i = 0; i < a.length; i++) {
			if (valor<a[i]) {
				valor=a[i];
			}
		}
		return valor;
	}

	@Override
	public double max(double[] a) {
		double valor=a[0];
		for (int i = 0; i < a.length; i++) {
			if (valor>a[i]) {
				valor=a[i];
			}
		}
		return valor;
	}
	
	public void resultados() {
		
	}
	
	
}
