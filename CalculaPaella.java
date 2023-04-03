package M_7_3;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class CalculaPaella {

	public static void main(String[] args) {
		
		final float cantidadFideos=0.500f;
		final float cantidadCalamares=0.400f;
		final float cantidadGambas=0.200f;
		
		String texto1=JOptionPane.showInputDialog("Cuantas personas vendran?");
		int personas=Integer.parseInt(texto1);
		
		String texto2=JOptionPane.showInputDialog("Introduce el precio del kilo de fideos: ");
		float precioFideos=Float.parseFloat(texto2);
		
		String texto3=JOptionPane.showInputDialog("Introduce el precio del kilo de calamares: ");
		float precioCalamares=Float.parseFloat(texto3);
		
		String texto4=JOptionPane.showInputDialog("Introduce el precio del kilo de gambas: ");
		float precioGambas=Float.parseFloat(texto4);	
			
		float cantidad1=calculaCantidad(personas,cantidadFideos);	
		float cantidad2=calculaCantidad(personas,cantidadCalamares);	
		float cantidad3=calculaCantidad(personas,cantidadGambas);	
		
		float precio1=calculoPrecio(cantidad1,precioFideos);
		float precio2=calculoPrecio(cantidad2,precioCalamares);
		float precio3=calculoPrecio(cantidad3,precioGambas);
		
		float suma=precio1+precio2+precio3;
		float media=Math.round(suma/personas);
		
		System.out.println("Una paella para " + personas + " personas necesitaras:\n");	
		System.out.println(cantidad1 + " Kilos de fideos, que rondan los " + precio1 + " euros.");	
		System.out.println(cantidad2 + " Kilos de calamares, que rondan los " + precio2 + " euros.");	
		System.out.println(cantidad3 + " Kilos de gambas, que rondan los " + precio3 + " euros.");		
		System.out.println("");
		System.out.println("Para hacer esta paella necesitaras " + suma);
		System.out.println("Cada persona debera aportar " + media + " euros.");
		
	}
	
	static float calculaCantidad(int personas,float cantidad) {
		return (cantidad*personas)/4;
	}
	
	static float calculoPrecio(float cantidad,float precio) {
		return precio*cantidad;
	}
		
	static int pideDatos(String mensaje) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
			System.out.println(mensaje);
				return input.nextInt();
			
		}
		
}
