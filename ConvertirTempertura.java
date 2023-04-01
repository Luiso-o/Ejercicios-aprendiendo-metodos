package M_7_1;

import javax.swing.JOptionPane;

public class ConvertirTempertura {

	public static void main(String[] args) {
		/*pedimos una temperatura, el rango será de -273 hasta 373 de acuerdo a 
		 *a tablas de temperaturas en internet */
		String texto=JOptionPane.showInputDialog("Introduce la temperatura");
		int temperatura=Integer.parseInt(texto);
		
		/*Dependiendo del dato ingresado el programa interpretará 
		si se habla de celcius, fahrenheit o kelvin */
		calculaTemperatura(temperatura);
		
		//imprime un mensaje de despedida :D
		if(temperatura < 0) {
			JOptionPane.showMessageDialog(null,"Hasta pronto! Recuerda usar jersey ;)");
		}else if(temperatura<20) {
			JOptionPane.showMessageDialog(null,"Hasta pronto! Disfruta el buen tiempo ;)");
		}else {
			JOptionPane.showMessageDialog(null,"Hasta pronto! Recuerda usar bloqueador solar ;)");
		}
		
	}
	//arrojará un mensaje con los datos de las tablas
	static void calculaTemperatura(int temperatura) {
		final int ceroAbsoluto=-273;
		
		if(temperatura < ceroAbsoluto) {//cero absoluto 
			JOptionPane.showMessageDialog(null, "Estas por debajo del cero absoluto, la temperatura mas baja conocida!");
		
		}else if(temperatura <= 100 ) {//celcius (de -273 hasta 100)
			JOptionPane.showMessageDialog(null, temperatura + " grados celsius equivalen a "+ celsiusAFahrenheit(temperatura) + " grados Fahrenheit.\n"
					+ " y "+ celciusAKelvin(temperatura) + " grados Kelvin.");
		
		}else if(temperatura <= 212) {//fahrenheit (de 101 hasta 212)
			JOptionPane.showMessageDialog(null, temperatura + " grados fahrenheit equivalen a "+ fahrenheitACelsius(temperatura) + " grados Celsius.\n"
					+ " y " + fahrenheitAKelvin(temperatura) + " grados Kelvin.");
		
		}else if(temperatura <= 374) {//kelvin (de 213 hatsa 374)
			JOptionPane.showMessageDialog(null, temperatura + " grados Kelvin equivalen a "+ kelvinACelsius(temperatura) + " grados Celsius.\n"
					+ " y " + kelvinAFahrenheit(temperatura) + " grados Fahrenheit.");
		
		}else {//Si el numero introducido es mayor a 373
			JOptionPane.showMessageDialog(null,"141 millones de billones de billones de °C es la temperatura mas alta conocida por el hombre :D");
			
		}
	}
	
	//formulas para convertir temperaturas en sus respectivas tablas
	
	
	static int fahrenheitACelsius(int fahrenheit) {		
		return (int)(1.8f * fahrenheit) + 32;
	}
	
	
	static int celsiusAFahrenheit(int celsius) {
		return (celsius * 9/5) + 32;
	}
	  
    static int kelvinACelsius(int Kelvin){
        return (int) (Kelvin - 273.15);
    }
    
    
    static int kelvinAFahrenheit(int Kelvin){
        return (int) ((Kelvin - 273.15) * 9/5 + 32);
    }
    
    
    static int celciusAKelvin(int Celcius){
        return (int) (Celcius + 273.15);
    }
  
    static int fahrenheitAKelvin(int Fahrenheit) {
        return (int) ((Fahrenheit - 32) * 5/9 + 273.15);
    }
    
}

