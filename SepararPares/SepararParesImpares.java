package M_7_3.SepararPares;

import java.util.ArrayList;

import javax.swing.JOptionPane;
//<<Luis>>
public class SepararParesImpares {

	public static void main(String[] args) {
		//creo un ArrayList de ArrayList donde guardar� los numeros pares e impares en listas diferentes
		ArrayList<ArrayList<Integer>>misListas= new ArrayList<>();
		
		//Pido al usuario que agrege un numero entero
			String pide=JOptionPane.showInputDialog("Ingresa un numero entero");
			int numero=Integer.parseInt(pide);
		
		//clasifico los numero comprendidos entre el 0 y el numero que ingreso el usuario
			clasificaNumeros(numero,misListas);
		
		//Imprimo la informacion por consola	
			System.out.println("Los numeros pares comprendidos entre 0 y " + numero
					+ " son:\n" + misListas.get(0).toString()+".\n");
			
			System.out.println("Los numeros primos comprendidos entre 0 y " + numero
					+ " son:\n" + misListas.get(1).toString()+".\n");
			
			System.out.println("El resultado de la suma de los numeros pares es: " + suma(misListas.get(0))+".\n");
		
			System.out.println("El resultado de la suma de los numeros impares es: " + suma(misListas.get(1))+".\n");
	 }
//recibe el numero que ingresa el usuario y clasifica los pares e impares, los guarda en una Lista de Integer
	static void clasificaNumeros(int numero, ArrayList<ArrayList<Integer>>misListas) {
		ArrayList<Integer>listaPares= new ArrayList<>();
		ArrayList<Integer>listaImpares= new ArrayList<>();
		
		for(int i=0; i<numero; i++) {
			if (i % 2==0) {
				listaPares.add(i);
			}else {
				listaImpares.add(i);
			}
		}
		
		misListas.add(listaPares);
		misListas.add(listaImpares);
	}

	//suma los numero pares
	static int suma(ArrayList<Integer>misListas) {
		int sumar=0;
        for (Integer misLista : misListas) {
            sumar += misLista;
        }
		return sumar;
	}
	
}
