package M_7_1;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class MediaClase {

	public static void main(String[] args) {
		
		//pido al usuario el numero de notas que quiere introducir
		int cantidadNotas=pideInt("introduce el numero de notas:");
		
		//introduzco las notas y calculo la media
		int media=introduceNotas(cantidadNotas);
		
		//Imprimo el mensaje con JOptionPane
		JOptionPane.showMessageDialog(null, "La nota media de la clase es " + media + ",\n" 
				+ imprimeMensaje(media));
	
	}
	
	//Pido un entero por medio de un mensaje que imprimo con JOptionPane
	static int pideInt(String mensaje) {
		String input=JOptionPane.showInputDialog(mensaje);
			int numero=Integer.parseInt(input);
				return numero;
	}
	
	//Pido las notas al usuario de acuerdo a la cantidad antes asignada, las almaceno en un array
	static int introduceNotas(int cantidad){
		ArrayList<Integer>lista=new ArrayList<Integer>();
				
			for(int i=0; i<cantidad; i++) {
				lista.add(verificaNotas(pideInt("introduce la nota " + (i+1))));
			}
			
			return calculaMedia(lista);
	}
	
	//calculo la media de las notas en el array
	static int calculaMedia(ArrayList<Integer>listaNotas) {
		
		int media=0;
		
			for(int i=0; i<listaNotas.size(); i++) {
				media+=listaNotas.get(i);
			}
				return media/listaNotas.size();
	}

	//Imprime un mensaje a partir de la media establecida por los alumnos
	static String imprimeMensaje(int media) {
		
		if(media < 5) {
			return "La nota media de la clase es muy baja,\nlos alumnos deberian"
					+ " preguntar sus dudas y trabajar mas.";
		}else if(media < 7) {
			return "La nota media de la clase es buena,\nlos alumnos deberian"
					+ " mejorar el trabajo personal.";
		}else {
			return "Enhorabuena! La nota media de la clase\ncorresponde al esfuerzo realizado.";
		}
		
	}
	
	//controlo que las notas esten establecidas entre 0 y 10, devuelvo una nota valida.
	static int verificaNotas(int nota) {
		
		while(nota < 0 || nota > 10) {
			nota=pideInt("Introduce una nota valida");
		}
		return nota;
	}
	
	
}


	


