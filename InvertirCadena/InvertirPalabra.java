package M_7_3.InvertirCadena;

import java.util.Scanner;

public class InvertirPalabra {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Escribe lo que desees invertir");
	
		invertir(input.nextLine());

	}
	
	static void invertir(String palabra) {
		StringBuilder palabraInvertida = new StringBuilder();
		// Primero recorremos la palabra normal
		for (int indice = palabra.length() - 1; indice >= 0; indice--) {
			// vamos conectando cada letra desde hasta acabar con la primera
			palabraInvertida.append(palabra.charAt(indice));
		}
		System.out.println("La cadena de texto : " + palabra +
				" Invertida, se lee de esta manera : " + palabraInvertida);
		
	}
	
}
