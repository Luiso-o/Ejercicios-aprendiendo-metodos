package M_7_1;

import javax.swing.JOptionPane;

public class figurasConCaracteres {

	public static void main(String[] args) {
	//pedimos el caracter y el numero con el que trabajaremos
		String caracter=JOptionPane.showInputDialog("Introduce un caracter:"); 
		
		String medida=verificaEntero(JOptionPane.showInputDialog("Introduce numero:")); 
		int numero=Integer.parseInt(medida);	
		
		//Creamos un menu donde trabajaremos con ventanas para opciones 
		int seleccione;
		
		do {
			String opcion=JOptionPane.showInputDialog("Seleccione una opcion:\n"+
				 "0.Salir\n"+"1.Cuadrado\n"+"2.Triangulo\n"+"3.Circulo\n"+"4.Rombo\n");
		 
				seleccione=Integer.parseInt(opcion);
		
		//usamos el numero para darle una opcion al usuario, 
		//el resultado se ver� por consola	
		} while (seleccione == 0 && seleccione > 4); 
	       
			switch (seleccione) {
				case 0:
					seleccione=0;
			            break;
			    case 1:
			        cuadrado(caracter,numero); 
			           	break;
			    case 2:
			        trinagulo(caracter,numero);
			            break;
			    case 3:
			        circulo(caracter,numero);
			        	break;
			    case 4:
			        rombo(caracter,numero);
			            break; 
			        default:
		                System.out.print("<<Opcion invalida>>");
		                seleccione=0;
		                break;
			           }	
				 
		 	JOptionPane.showMessageDialog(null, "Adios!");
	     }	
	//Opciones
	static void cuadrado(String caracter,int numero) {
		
		 // Imprimir cada fila del cuadrado
        for (int i = 0; i < numero; i++) {
            // Imprimir cada columna del cuadrado
            for (int j = 0; j < numero; j++) {
                System.out.print(caracter + " ");
            }
            // Imprimir una nueva l�nea al final de cada fila
            System.out.println();
        }
		
	}
	
	static void trinagulo(String caracter,int numero) {
		  // Imprimir cada fila del tri�ngulo
        for (int i = 0; i < numero; i++) {
            // Imprimir espacios en blanco para desplazar el tri�ngulo a la derecha
            for (int j = 0; j < numero - i; j++) {
                System.out.print(" ");
            }
            // Imprimir s�mbolos para formar el tri�ngulo
            for (int k = 0; k <= i; k++) {
                System.out.print(caracter + " ");
            }
            // Imprimir una nueva l�nea al final de cada fila
            System.out.println();
        }
	}
	
	static void circulo(String caracter,int numero) {
		 // Imprimir cada fila del c�rculo
        for (int i = -numero; i <= numero; i++) {
            // Imprimir cada columna del c�rculo
            for (int j = -numero; j <= numero; j++) {
                double distance = Math.sqrt(j * j + i * i);
                if (distance <= numero) {
                    System.out.print(caracter + " ");
                } else {
                    System.out.print("  ");
                }
            }
            // Imprimir una nueva l�nea al final de cada fila
            System.out.println();
        }
        
	}
	
	static void rombo(String caracter,int numero) {
		// Imprimir la parte superior del rombo
	        for (int i = 0; i < numero; i++) {
	            // Imprimir espacios en blanco para desplazar el rombo a la derecha
	            for (int j = 0; j < numero - i; j++) {
	                System.out.print(" ");
	            }
	            // Imprimir s�mbolos para formar la parte superior del rombo
	            for (int k = 0; k <= i; k++) {
	                System.out.print(caracter + " ");
	            }
	            // Imprimir una nueva l�nea al final de cada fila
	            System.out.println();
	        }
 
		// Imprimir la parte inferior del rombo
	        for (int i = numero - 2; i >= 0; i--) {
	            // Imprimir espacios en blanco para desplazar el rombo a la derecha
	            for (int j = 0; j < numero - i; j++) {
	                System.out.print(" ");
	            }
	            // Imprimir s�mbolos para formar la parte inferior del rombo
	            for (int k = 0; k <= i; k++) {
	                System.out.print(caracter + " ");
	            }
	            // Imprimir una nueva l�nea al final de cada fila
	            System.out.println();
	        }
     }
	
	//verifico que los datos que introduce el usuario es un entero
	static boolean esEntero(String mensaje) {
		
		try {
			Integer.parseInt(mensaje);
				return true;
		}catch (NumberFormatException e) {
			return false;
		}
	 
	}
		
	//pido al usuario que el dato introducido sea un entero
	static String verificaEntero(String mensaje) {

		while(!esEntero(mensaje)) {
			mensaje=JOptionPane.showInputDialog(mensaje + " no es un entero, introduce un dato v�lido");	
				esEntero(mensaje);
			}
			
		return mensaje;
	}
		
}
