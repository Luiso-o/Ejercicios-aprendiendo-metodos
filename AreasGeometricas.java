package M_7_3;

import javax.swing.JOptionPane;

public class AreasGeometricas {

	public static void main(String[] args) {
	
	// Mostrar el menú hasta que el usuario seleccione "Salir"
		while (true) {
			
     // Mostrar las opciones del menú en una ventana de diálogo
         String[] opciones = {"Cuadrado", "Triangulo", "Rectangulo", "Circulo", "Salir"};
           int seleccion = JOptionPane.showOptionDialog(null, "Seleccione una opción:", "Calcula el area de :",
           JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);
            
      // Realizar la acción correspondiente a la opción seleccionada
        switch (seleccion) {
           case 0:      
        	 JOptionPane.showMessageDialog(null, "El area del cuadrado es " + areaCuadrado()); 
              break;
              
            case 1: 	
            	JOptionPane.showMessageDialog(null, "El area del triangulo es " + areaTriangulo());
              break;
              
            case 2:
            	JOptionPane.showMessageDialog(null, "El area del rectangulo es " + areaRectangulo());
              break;
              
             case 3:
            	 JOptionPane.showMessageDialog(null, "El area del rectangulo es " + areaCirculo());
              break;
              
             case 4:
              JOptionPane.showMessageDialog(null, "Saliendo del programa.");
                System.exit(0);
                
                default:
              JOptionPane.showMessageDialog(null, "Seleccione una opción válida.");
            }
        }
	}
	//Metodos para calcular areas.
	static double areaCuadrado() {
		
		String valor1=JOptionPane.showInputDialog("Introduce un lado");
		double lado=Integer.parseInt(valor1);
		
		double area=Math.pow(lado,2);
		
		return area;
		
	}
	
	static double areaTriangulo() {
		
		String valor1=JOptionPane.showInputDialog("Introduce la base del triangulo");
		double base=Integer.parseInt(valor1);
		String valor2=JOptionPane.showInputDialog("Introduce la altura del triangulo");
		double altura=Integer.parseInt(valor2);
		
		double area=base*altura/2;
		
		return area;
		
	}
	
	static double areaRectangulo() {
		
		String valor1=JOptionPane.showInputDialog("Introduce el largo del rectangulo");
		double largo=Integer.parseInt(valor1);
		String valor2=JOptionPane.showInputDialog("Introduce el ancho del rectangulo");
		double ancho=Integer.parseInt(valor2);
		
		if(largo==ancho) {
			valor2=JOptionPane.showInputDialog("El largo y el ancho no pueden ser iguales"
					+ " introduce un dato valido");
			ancho=Integer.parseInt(valor2);
		}
		
		double area=largo*ancho;
		
		return area;
		
	}
	
	static double areaCirculo() {
		String valor1=JOptionPane.showInputDialog("Introduce el radio del circulo");
		double radio=Integer.parseInt(valor1);
		
		double area = Math.PI * Math.pow(radio,2);
		
		return area;
	}

}
