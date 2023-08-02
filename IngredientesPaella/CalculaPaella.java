package M_7_3.IngredientesPaella;

import javax.swing.JOptionPane;

public class CalculaPaella {

	public static void main(String[] args) {
		float precioFideos, precioCalamares, precioGambas, cantidad1, cantidad2, cantidad3,
				precio1, precio2, precio3, suma, media;

		String texto1,texto2,texto3,texto4;

		int personas;
		
		final float cantidadFideos=0.500f;
		final float cantidadCalamares=0.400f;
		final float cantidadGambas=0.200f;
		
		texto1 = JOptionPane.showInputDialog("Cuantas personas vendrán?");
		personas=Integer.parseInt(texto1);
		
		texto2 = JOptionPane.showInputDialog("Introduce el precio del kilo de fideos: ");
		precioFideos=Float.parseFloat(texto2);
		
		texto3 = JOptionPane.showInputDialog("Introduce el precio del kilo de calamares: ");
		precioCalamares=Float.parseFloat(texto3);
		
		texto4 = JOptionPane.showInputDialog("Introduce el precio del kilo de gambas: ");
		precioGambas = Float.parseFloat(texto4);
			
		cantidad1 = calculaCantidad(personas,cantidadFideos);
		cantidad2 = calculaCantidad(personas,cantidadCalamares);
		cantidad3 = calculaCantidad(personas,cantidadGambas);
		
		precio1=calculoPrecio(cantidad1,precioFideos);
		precio2=calculoPrecio(cantidad2,precioCalamares);
		precio3=calculoPrecio(cantidad3,precioGambas);
		
		suma=precio1+precio2+precio3;
		media=Math.round(suma/personas);
		
		System.out.println("Una paella para " + personas + " personas necesitaras:\n");	
		System.out.println(cantidad1 + " Kilos de fideos, que rondan los " + precio1 + " euros.");	
		System.out.println(cantidad2 + " Kilos de calamares, que rondan los " + precio2 + " euros.");	
		System.out.println(cantidad3 + " Kilos de gambas, que rondan los " + precio3 + " euros.");		
		System.out.println();
		System.out.println("Para hacer esta paella necesitaras " + suma);
		System.out.println("Cada persona debera aportar " + media + " euros.");
		
	}
	
	static float calculaCantidad(int personas,float cantidad) {
		return (cantidad*personas)/4;
	}
	
	static float calculoPrecio(float cantidad,float precio) {
		return precio*cantidad;
	}
		

}
