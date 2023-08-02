package M_7_3.CreaUnPalindromo;

import java.util.Scanner;

public class Palindromo {

	public static void main(String[] args) {
		esPalindromo(pideDatos());
	}
			
	static void esPalindromo(String cadena) {
		
		// Convertir a min�sculas y eliminar espacios y signos de puntuaci�n
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
		
	static String pideDatos() {
		Scanner input = new Scanner(System.in);
		System.out.println("Escribe una frase ");
		return input.nextLine();
			
	}
				
}
