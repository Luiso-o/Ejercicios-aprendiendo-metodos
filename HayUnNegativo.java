package M_7_1;

import javax.swing.JOptionPane;

public class HayUnNegativo {
	
	public static void main(String [] args ){
		
		//pido al usuario dos numeros
		int numero1=pideInt("Introduce un numero");
		
		int numero2=pideInt("Introduce otro numero");
		
		//verifico si los numeros ingresados estan compuestos por positivos o positivo y negativo
			hayUnNegativo(numero1,numero2);
			
		//hago operaciones basicas para verificar el resultado de estos numeros	
			operaciones(numero1,numero2);
			
			
	}
	//verifica los numeros y imprime el resultado
	static void hayUnNegativo(int num1, int num2) {
		
		if (num1 > 0 && num2 > 0) {
		      System.out.println("Ambos numeros son positivos\n");
		    } else if (num1 < 0 && num2 < 0) {
		      System.out.println("Ambos numeros son negativos\n");
		    } else {
		      System.out.println("Uno de los numeros es positivo y el otro es negativo\n");
		    }
		
	}
	//imprime si las operaciones son positivas o negativas
	static void operaciones(int num1, int num2) {
		
		if(num1+num2<0) {
			System.out.println("-La diferencia de la suma de estos numeros es negativa");
		}else {
			System.out.println("-La diferencia de la suma de estos numeros es positiva");
		}
		
		if(num1-num2<0) {
			System.out.println("-El resultado de la resta de estos numeros es negativa");
		}else {
			System.out.println("-El resultado de la resta de estos numeros es positiva");
		}
		
		if(num1*num2<0) {
			System.out.println("-El producto de la Multiplicacion de estos numero es negativa");
		}else {
			System.out.println("-El producto de la Multiplicacion de estos numero es positiva");
		}
		
		if(num1%num2<0) {
			System.out.println("-El residuo de la division de estos numero es negativa");
		}else {
			System.out.println("-El residuo de la division de estos numero es positiva");
		}
	}
	
	//verifico que los datos que introduce el usuario son numeros
	static boolean esEntero(String mensaje) {
		 try {
		     Integer.parseInt(mensaje);
		      return true;
		    } catch (NumberFormatException e) {
		      return false;
		    }
	}
	
	//pido al usuario un dato válido
	static String verificaEntero(String mensaje) {
		
		String nuevo="";
		
			while(!esEntero(mensaje)) {
				nuevo=JOptionPane.showInputDialog(mensaje + " no es un entero, introduce un dato válido");	
					mensaje=nuevo;
						esEntero(nuevo);
			}
			return nuevo;
		}
	
	//pido los numeros
	static int pideInt(String mensaje) {
		String input=verificaEntero(JOptionPane.showInputDialog(mensaje));
			int numero=Integer.parseInt(input);
				return numero;
	}
	
}
