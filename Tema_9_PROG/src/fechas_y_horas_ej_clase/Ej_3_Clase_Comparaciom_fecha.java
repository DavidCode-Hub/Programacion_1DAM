package fechas_y_horas_ej_clase;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Ej_3_Clase_Comparaciom_fecha {

	public static void main(String[] args) {
		LocalDate fecharuben= LocalDate.of(2007, Month.FEBRUARY, 21);
		
		LocalDate fechadavid=LocalDate.of(2000, Month.SEPTEMBER, 6);
		
		Period diferencia= fecharuben.until(fechadavid);
		
		System.out.println(diferencia);
		
		int dias,meses,ano;
		
		dias=diferencia.getDays();
		meses=diferencia.getMonths();
		ano=diferencia.getYears();
		
		System.out.println("Dias:"+dias+"Meses: "+meses+"Años:"+ano);

	}

}
