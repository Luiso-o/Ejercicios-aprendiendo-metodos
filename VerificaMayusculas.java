package M_7_3;

import java.util.Scanner;

public class VerificaMayusculas {

	public static void main(String[] args) {

		String frase=pideDatos("introduce una frase: ");	
		
		if (esMayuscula(frase)) {
			System.out.println(" Esta frase est� escrita con may�scula ");
			
		} else if (esMinuscula(frase)) {
			System.out.println(" Es frase est� escrita con min�scula ");
			
		} else {
			System.out.println(" Es frase est� escrita con may�sculas y min�sculas ");
		}
		
	}
		static String pideDatos(String mensaje) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println(mensaje);
		return input.nextLine();
		
		}
		
		static boolean esMayuscula(String frase) {
			// devuelve toda la frase en Mayuscula
			return frase.equals(frase.toUpperCase());
		}
		
		static boolean esMinuscula(String s) {
			// devuelve toda la fras en Minuscula
			return s.equals(s.toLowerCase());
				}
		
		
}
