package M_7_1;

import javax.swing.JOptionPane;

public class MultiplicaConRango {

	public static void main(String[] args) {
		//Ingresamos el numero que deseamos multiplicar
		String pideNumero=JOptionPane.showInputDialog("Introduce un numero entero");
		int numero=Integer.parseInt(pideNumero);
		
		//tambien hasta donde queremos parar la multiplicacion
		String pideRango=JOptionPane.showInputDialog("Hasta que numero deseas parar de Multiplicar?");
		int rango=Integer.parseInt(pideRango);
		
		//Imprime los resultados
		multiplica(numero,rango);

	}
	
	//usa los datos ingresados para realizar la operacion e imprimirla en pantalla
	static void multiplica(int numero, int rango) {
		
		int limite_Mult=rango;
		int multiplica=1;
		
		for(int i=1; i<=limite_Mult; i++) {
			multiplica=i*numero;
			System.out.println(i + " x " + numero + " = " + multiplica );
		}
		
	}
	
}
