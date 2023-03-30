//Crea un programa on l’usuari/ària introdueix tres notes i el programa 
//calcula la mitja.

//Si la mitja és inferior a 5 ha de mostrar el següent missatge per 
//pantalla: “No has superat el curs. Has de recuperar”.

//Si la mitja està entre 5 i 7 ha de mostrar: “Enhorabona! Has aprovat, 
//però hauries de continuar practicant”.

//Si la mitja és superior a 7 ha de mostrar: "Enhorabona! Has superat el curs!
//Passa ja al següent nivell!"	

//<<Luis>>

package M_7_1;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class CalculaMedia {

	public static void main(String[] args) {
	
		//pido las tres notas al usuario usando JOptionPane
		String texto1=JOptionPane.showInputDialog("Introduce la primera nota");
		int nota1=verificaNotas(Integer.parseInt(texto1));
		
		String texto2=JOptionPane.showInputDialog("Introduce la segunda nota");
		int nota2=verificaNotas(Integer.parseInt(texto2));
		
		String texto3=JOptionPane.showInputDialog("Introduce la tercera nota");
		int nota3=verificaNotas(Integer.parseInt(texto3));
		
//---------------------------------------------------------------------------------------
		//agrego las notas en un arrayList
		ArrayList<Integer> notas= new ArrayList<Integer>();
		notas.add(nota1);
		notas.add(nota2);
		notas.add(nota3);
		
		//Envío las notas al metodo calculaMedia();
		int media=calculaMedia(notas);
	
	/*Hago saber al usuario la media de sus notas y muestro un mensaje sobre el siguiente paso
	 que debe seguir para continuar con su formacion*/	
	JOptionPane.showMessageDialog(null, "La media de tus notas es " + media + ",\n" + imprimeMensaje(media));
	
	}
	
//Metodos
	//calculo la media tomando como parametro el array de notas y devuelvo un entero
	static int calculaMedia(ArrayList<Integer> notas) {
		int media=0;
		for(int i=0; i<notas.size(); i++) {
			media+=notas.get(i);
		}	
		return media/notas.size();
	}
	
	//imprimo un mensaje dependiendo de la media del alumno
	static String imprimeMensaje(int media) {
		
		if(media < 5) {
			return "No superaste el curso, deberás recuperar X_X";
		}else if(media >= 5 && media <= 7 ) {
			return "EnhoraBuena! Has aprovado, pero deberias fortalecer tus puntos debiles ;)";
		}else{
			return "EnhoraBuena! Has aprovado, pasa el siguiente nivel, sigue asi!! :D";
		}	
	}
	
//Controlo que las notas introducidas esten dentro del estandar permitido(max 10 puntos)
	static int verificaNotas(int nota) {	
		while(nota > 10 || nota < 0) {
			String Corrige=JOptionPane.showInputDialog("La nota introducida no es valida! Introduce una valida");
			nota=Integer.parseInt(Corrige);
		}
		
		return nota;
	}
	
}



