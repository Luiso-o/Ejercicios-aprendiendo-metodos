package M_7_3.CalculaMediaNotas;

import javax.swing.*;
import java.util.ArrayList;

public class Media {

    //Llamo la primera función de la clase Media al momento de instanciarla
    {
    ingresaCantidadNotas();
    }

    //Metodo que pide la cantidad de notas que se quieren ingresar
    public void ingresaCantidadNotas(){
        String cantidadNotas = JOptionPane.showInputDialog("Cuantas notas deseas ingresar?");
        int cantidad = controlaDato(cantidadNotas);
        limitePuntaje(cantidad);
        ingresaNotas(cantidad);
    }

    /*@Param int cantidad
    * pide las notas y las introduce en una arrayList<Integer> una por una*/
   private static void ingresaNotas(int cantidad){
        ArrayList<Integer> notas= new ArrayList<>();
        String texto;
        int nota;

        for (int i = 0; i < cantidad; i++) {
            texto=JOptionPane.showInputDialog("Introduce la nota # " + (i+1));
            int entero = controlaDato(texto);
            nota=limitePuntaje(entero);
            notas.add(nota);
        }

        sumaNotas(notas);
    }

    /*@Param ArrayList<Integer>
    *calcula la media de la suma de todas las notas */
    private static void sumaNotas(ArrayList<Integer> notas) {
        int media=0;
        for (Integer nota : notas) {
            media += nota;
        }
        media = media/notas.size();
        imprimeMensaje(media);
    }

    /*@Param int media
    * imprime un mensaje dependiendo de la media del alumno*/
    private static void imprimeMensaje(int media) {

        JOptionPane.showMessageDialog(null, "La media de tus notas es " + media + ",\n");

        if(media < 5) {
            JOptionPane.showMessageDialog(null,"No superaste el curso, deber�s recuperar X_X");
        }else if(media <= 7) {
            JOptionPane.showMessageDialog(null,"EnhoraBuena! Has aprovado, pero deberias fortalecer tus puntos debiles ;)");
        }else{
            JOptionPane.showMessageDialog(null,"EnhoraBuena! Has aprovado, pasa el siguiente nivel, sigue asi!! :D");
        }
    }

    /*@Param String nota
     * Verifica si la cadena introducida contiene numeros*/
    private static int controlaDato(String nota) {
        int entero = 0;
        boolean esEntero = false;

        do {
            try {
                entero = Integer.parseInt(nota);
                esEntero = true;
            } catch (NumberFormatException e) {
                String mensaje = "<html><h1>Dato no válido X-X:</h1></html>";
                nota = JOptionPane.showInputDialog(null, mensaje, "Ingresa un número entero", JOptionPane.ERROR_MESSAGE);
                if (nota == null) {
                    System.exit(0); // Si el usuario hace clic en "Cancelar", sale del programa
                }
            }
        } while (!esEntero);

        return entero;
    }

    /*@Param int nota
     * controla si la nota introducida cumple con el rango permitido*/
    public static int limitePuntaje(int nota) {
        while (nota > 10 || nota < 0) {
            String input = JOptionPane.showInputDialog("La nota debe estar entre 0 y 10. Ingrésala nuevamente:");
            if (input == null) {
                System.exit(0);// El usuario pulsó 'Cancelar', salimos del programa
            }
            try {
                nota = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingreso inválido. Por favor, ingresa un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        return nota;
    }

    //Clase prinipal, instanciamos un Objeto de la clase Media para arrancar el programa.
    public static void main(String[] args) {
        new Media();
    }

}
