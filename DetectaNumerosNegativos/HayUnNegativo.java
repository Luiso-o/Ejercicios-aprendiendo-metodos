package M_7_3.DetectaNumerosNegativos;

import javax.swing.JOptionPane;

public class HayUnNegativo {
	
	public static void main(String [] args ){
		
		//pido al usuario dos numeros
		String numero1 = JOptionPane.showInputDialog("Introduce un entero");
		int primerEntero = pideInt(numero1);

		String numero2 = JOptionPane.showInputDialog("Introduce un segundo entero");
		int segundoEntero = pideInt(numero2);
		
		//verifico si los numeros ingresados estan compuestos por positivos o positivo y negativo
			hayUnNegativo(primerEntero,segundoEntero);
			
		//hago operation basicas para verificar el resultado de estos numeros
			operaciones(primerEntero,segundoEntero);
			
			
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


	//pido los numeros
	static int pideInt(String mensaje) {
		int numero = 0;
		boolean esEntero = false;

		do{
			try{
				numero = Integer.parseInt(mensaje);
				esEntero = true;
			}catch (NumberFormatException e){
				mensaje = JOptionPane.showInputDialog("Introduce un dato valido");
			}
		}while(!esEntero);

		return numero;
	}
	
}
