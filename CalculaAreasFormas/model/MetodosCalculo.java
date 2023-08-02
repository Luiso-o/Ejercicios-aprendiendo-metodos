package M_7_3.CalculaAreasFormas.model;

import javax.swing.*;

public class MetodosCalculo {

    //variables globales
    static String valor1,valor2;
    static double lado,base,altura,largo,ancho,radio;

    /**
     * Calcula el área de un cuadrado.
     * @return El área del cuadrado.
     */
    static double areaCuadrado() {
        valor1 = JOptionPane.showInputDialog("Introduce un lado");
        lado=Integer.parseInt(valor1);
        return Math.pow(lado,2);
    }

    /**
     * Calcula el área de un triangulo.
     * @return El área del triangulo.
     */
    static double areaTriangulo() {
        valor1=JOptionPane.showInputDialog("Introduce la base del triangulo");
        base=Integer.parseInt(valor1);
        valor2=JOptionPane.showInputDialog("Introduce la altura del triangulo");
        altura=Integer.parseInt(valor2);
        return base*altura/2;
    }

    /**
     * Calcula el área de un rectangulo.
     * @return El área del rectangulo.
     */
    static double areaRectangulo() {
        valor1=JOptionPane.showInputDialog("Introduce el largo del rectangulo");
        largo=Integer.parseInt(valor1);
        valor2=JOptionPane.showInputDialog("Introduce el ancho del rectangulo");
        ancho=Integer.parseInt(valor2);

        if(largo==ancho) {
            valor2=JOptionPane.showInputDialog("El largo y el ancho no pueden ser iguales"
                    + " introduce un dato valido");
            ancho=Integer.parseInt(valor2);
        }

        return largo*ancho;

    }

    /**
     * Calcula el área de un circulo
     * @return El área del circulo.
     */
    static double areaCirculo() {
        valor1=JOptionPane.showInputDialog("Introduce el radio del circulo");
        radio=Integer.parseInt(valor1);
        return Math.PI * Math.pow(radio,2);
    }

    //Puedes agregar mas métodos si lo deseas :)

}
