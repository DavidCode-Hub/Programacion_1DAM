package simulacroTema9;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;

public class Ejercicio_3 {

	public static void main(String[] args) {
		System.out.println("Fecha de hoy" + LocalDate.now());
		System.out.println("Fecha por parametros: " + LocalDate.of(2000, 12, 27));

		String fecha = "2022-08-10";

		System.out.println(LocalDate.parse(fecha));
		LocalDate fechaformat = LocalDate.parse(fecha);
		
		
		DateTimeFormatter fechaformateada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(fechaformat.format(fechaformateada));
		
		LocalDate fechahoy= LocalDate.now();
		
	
		System.out.println("Fecha del dia de hoy mas 5 dias"+fechahoy.plusDays(5));
		
		System.out.println("Fecha del dia de hoy menos 1 dia"+fechahoy.minusDays(1));
		
		
		System.out.println("Fecha del dia de hoy mas 1 semana"+fechahoy.plusWeeks(1));
		
		
		String fecha2="2022-06-12";
		
		LocalDate fechasemana=LocalDate.parse(fecha2);
		
		System.out.println(fechasemana.getDayOfWeek());
		
		System.out.println(fechasemana.getDayOfMonth());
		
		System.out.println();
		
		LocalDate fecha12= LocalDate.parse("2022-06-12");
		LocalDate fecha11= LocalDate.parse("2022-06-11");
		
		if (fecha12.isAfter(fecha11)) {
			System.out.println("Fecha anterior");
		}else {
			System.out.println("Fecha posterior");
		}
		
		LocalDateTime horayfecha=LocalDateTime.now();
		
		String fechayhora="2022-06-12T10:00";
		LocalDateTime parsefecha=LocalDateTime.parse(fechayhora);
		
		System.out.println("Fecha y hora"+parsefecha);
		
		DateTimeFormatter fechayhoraformt= DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
		
	
		System.out.println("Fecha con hora formateada"+parsefecha.format(fechayhoraformt));
		
	}

}
