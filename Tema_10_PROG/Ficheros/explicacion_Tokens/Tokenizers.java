package explicacion_Tokens;

import java.util.StringTokenizer;

public class Tokenizers {

	public static void main(String[] args) {
		String file = "src/token/fichero1.txt";
		
		StringTokenizer tokens = new  StringTokenizer(file, ";");
		
		
		while (tokens.hasMoreTokens()) {
			String token = tokens.nextToken();
			System.out.println(token);
		}

	}

}
