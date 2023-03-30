package M_7_1;

import javax.swing.JOptionPane;
import java.math.BigInteger;

public class Par_Impar {

	public static void main(String[] args) {

		/*Imprimo un mensaje para que el usuario me dé un número, el numero puede ser de 
		la longitud que el desee, gracias a que uso el objeto BigInteger, también es indiferente
		de si el numero es positivo o negativo*/
		BigInteger numero=pideEntero("Ingresa un numero: ");
		
		//Verifico si el numero Introducido es par o impar.
		String mensaje= par_Impar(numero);
		
		//Imprimo el resultado con un mensaje
		JOptionPane.showMessageDialog(null,numero + mensaje);
	
		
	}
	
	//Calculo si el numero es par o impar con BigInteger
	static String par_Impar(BigInteger numero) {
	    if (numero.mod(BigInteger.TWO).equals(BigInteger.ZERO)) {
	       return " es par.";
	    } else {
	       return " es impar.";
	    }
	}
	
	//Pido un numero al usuario como cadena y lo convierto a BigInteger
	static BigInteger pideEntero(String mensaje) {
		String input=JOptionPane.showInputDialog(mensaje);
			String cadenaVerificada=verificaCadena(input);
				BigInteger entero=new BigInteger(cadenaVerificada);
					return entero;
	}
	
	//Verifico si el numero ingresado como cadena es un entero usando un bloque try-catch
	//el resultado me lo devolvera en boolean
	static Boolean esEntero(String cadena) {
		try {
		    new BigInteger(cadena);
		    	return true;
		} catch (NumberFormatException e) {
		    	return false;
		}
	}
	
	//pido al usuario un dato válido
	static String verificaCadena(String cadena) {
		
		String cambiaCadena="";
		
			while(!esEntero(cadena)) {
				cambiaCadena=JOptionPane.showInputDialog(cadena + " no es un entero, introduce un numero válido");
				cadena=cambiaCadena;
				esEntero(cadena);
			}
			return cadena;
		}
	
}
