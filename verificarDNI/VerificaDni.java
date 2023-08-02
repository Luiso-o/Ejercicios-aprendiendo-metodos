package M_7_3.verificarDNI;

import javax.swing.JOptionPane;

public class VerificaDni {
	public static void main(String[] args) {
		
		String pideDni=JOptionPane.showInputDialog("Introduce tu Dni");
		
		if(!verificaDni(pideDni)) {
			JOptionPane.showMessageDialog(null, "Dni incorrecto", pideDni, JOptionPane.ERROR_MESSAGE, null);
		}else {
			JOptionPane.showMessageDialog(null, "Dni correcto", pideDni, JOptionPane.INFORMATION_MESSAGE, null);
		}	
		
	}	
	
	static boolean verificaDni(String dni) {
		
		boolean valido = false;
		
		 try {
		      // Comprobar que la longitud del DNI es correcta
		      if (dni.length() == 9) {
		    	  
		        // Extraer el n�mero y la letra del DNI
		        int numero = Integer.parseInt(dni.substring(0, 8));
		        char letra = dni.charAt(8);

		        // Calcular el resto de la divisi�n del n�mero entre 23
		        int resto = numero % 23;

		        // Comparar la letra obtenida con la letra correspondiente seg�n la tabla
		        if ("TRWAGMYFPDXBNJZSQVHLCKE".charAt(resto) == letra) {
		          valido = true;
		        }
		      }
		    } catch (NumberFormatException e) {
		      // El DNI no es un n�mero v�lido
		    }

		    return valido;
		  
	}
}
    

