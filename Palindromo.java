package M_7_3;

import java.util.Scanner;

public class Palindromo {

	public static void main(String[] args) {
				
		esPalindromo(pideDatos("Escribe una frase "));
		
	}
			
	static void esPalindromo(String cadena) {
		
		// Convertir a minúsculas y eliminar espacios y signos de puntuación
		String minusculas=cadena.toLowerCase().replaceAll("[^a-z0-9]", "");
	    // Crear cadena invertida
		String alreves=new StringBuilder(minusculas).reverse().toString();
	    
		// Comparar cadenas
		if(minusculas.equals(alreves)){
			System.out.println( cadena + ", es un palindromo.");
	            
		}else{
			System.out.println(cadena + ", no es un palindromo.");
		}
			
	}
		
	static String pideDatos(String mensaje) {

		@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
				System.out.println(mensaje);
					return input.nextLine();
			
	}
				
}
