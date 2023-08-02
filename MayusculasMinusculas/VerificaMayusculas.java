package M_7_3.MayusculasMinusculas;

import java.util.Scanner;

public class VerificaMayusculas {

	public static void main(String[] args) {

		String frase=pideDatos();
		
		if (esMayuscula(frase)) {
			System.out.println("Esta frase está escrita con mayúscula ");
			
		} else if (esMinuscula(frase)) {
			System.out.println("Esta frase est� escrita con minúscula ");
			
		} else {
			System.out.println("Esta frase está escrita con mayúsculas y minúsculas ");
		}
		
	}

		//Metodo que recibe una frase escrita por el usuario
		static String pideDatos() {
		Scanner input = new Scanner(System.in);
		System.out.println("introduce una frase: ");
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
