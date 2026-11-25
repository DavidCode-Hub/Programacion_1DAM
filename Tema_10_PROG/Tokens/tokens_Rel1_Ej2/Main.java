package tokens_Rel1_Ej2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		String empleado = null;
		String numHoras = null;
		String departamento = null;
		String cargo = null;
		String salario = null;
		String irpf = null;
		String social = null;

		String[] tokens = null;

		try {
			String filepath = "Tokens/tokens_Rel1_Ej2/empresaSamar.csv";

			BufferedReader br1 = new BufferedReader(new FileReader(filepath));

			BufferedWriter bw1 = new BufferedWriter(new FileWriter("Tokens/tokens_Rel1_Ej2/SalarioBase.txt", false));

			BufferedWriter bw2 = new BufferedWriter(new FileWriter("Tokens/tokens_Rel1_Ej2/nombres.txt", false));
			bw2.write("Los nombres con más de 40 horas son: ");

			bw1.write("Salario Base de Directivos de Informatica\n");
			
			while (br1.ready()) {
				String linea = br1.readLine();
				tokens = linea.split(";");

				if (tokens[2].equalsIgnoreCase("CONTABILIDAD")) {

					if (tokens[3].equalsIgnoreCase("DIRECTIVO")) {

						System.out.println("El sueldo de: " + tokens[0] + " sueldo base es: " + tokens[4]);
						bw1.write("El sueldo es: " + tokens[0] + " sueldo base es: " + tokens[4]);
					}
				}
				
			
				if (!tokens[1].equalsIgnoreCase("Nº de Horas")) {
					if (Integer.parseInt(tokens[1])>=40) {
						bw2.write(tokens[0]);
						bw2.newLine();
					}
					
					
					
				}
			}

			br1.close();
			bw1.close();
			bw2.close();
		} catch (FileNotFoundException e) {
			System.err.println("El archivo no se puede encontrar");
		} catch (IOException e) {
			System.err.println("Error");
		}

	}

}
