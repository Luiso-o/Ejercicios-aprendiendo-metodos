package M_7_3.CalculaAreasFormas.model;

import javax.swing.*;

public class Menu {
    public Menu() {

        int seleccion;

        /* Creamos un bucle para que el programa arranque el menu y no se detenga hasta que el usuario quiera salir. */
        while (true) {

            // interfaz donde mostramos las opciones al usuario
            String[] opciones = {"Cuadrado", "Triangulo", "Rectangulo", "Circulo", "Salir"};
            seleccion = JOptionPane.showOptionDialog(null, "Seleccione una opción:", "Calcula el area de :",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);

            // Realizar la accion correspondiente a la opcion seleccionada
            switch (seleccion) {
                case 0 -> JOptionPane.showMessageDialog(null, "El area del cuadrado es " + MetodosCalculo.areaCuadrado());
                case 1 -> JOptionPane.showMessageDialog(null, "El area del triangulo es " + MetodosCalculo.areaTriangulo());
                case 2 -> JOptionPane.showMessageDialog(null, "El area del rectangulo es " + MetodosCalculo.areaRectangulo());
                case 3 -> JOptionPane.showMessageDialog(null, "El area del rectangulo es " + MetodosCalculo.areaCirculo());
                case 4 -> {JOptionPane.showMessageDialog(null, "Saliendo del programa.");
                    System.exit(0);
                }
                default -> JOptionPane.showMessageDialog(null, "Seleccione una opción válida.");
            }
        }
    }
}