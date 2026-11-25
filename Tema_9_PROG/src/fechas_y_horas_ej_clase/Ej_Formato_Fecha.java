package fechas_y_horas_ej_clase;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ej_Formato_Fecha {

	public static void main(String[] args) {
		DateTimeFormatter esDateFormat= DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
		LocalDateTime fechaHora = LocalDateTime.now();
		
		System.out.println("Formato español: "+ fechaHora.format(esDateFormat));
		
		
	

	}

}
