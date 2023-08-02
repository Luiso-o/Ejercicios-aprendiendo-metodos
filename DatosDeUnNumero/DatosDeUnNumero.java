package M_7_3.DatosDeUnNumero;

import java.util.Scanner;

public class DatosDeUnNumero {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);

		System.out.println("Introduce un numero que sea mayor o igual a 10");
		int numero=input.nextInt();
		
		int fibonacci=fibonacci(numero);
		
		long sumarNumeros=sumadigitos(fibonacci);
		
		System.out.println("\nLa suma de los digitos de " + fibonacci + " es " + sumarNumeros);
		
		long operacion=esPrimo(sumarNumeros);
		
		int cuatroNumeros=tomaUltimosDigitos(operacion);
		
		System.out.println("Los ultimos digitos del numero anterior son: " + cuatroNumeros);
		
		bisiesto(cuatroNumeros);
		
		
	}

	/*@Param int numero
	* recibe un numero entero y devuelve la sucesion de fibonacci de ese numero*/
	static int fibonacci(int numero) {
		
		 int a = 0, b = 1, c;
	     System.out.print("La sucesion de Fibonacci de "+ numero + " es " + a + " " + b);
	      
	      for (int i = 2; i < numero; i++) {
	         c = a + b;
	         System.out.print(" " + c);
	         a = b;
	         b = c;
	      }
	      
	      return b;
	    
	}
	// devuelve el factorial del @param Long que recibe
	static long esPrimo(long factorial) {
	    
		long operacion;
		if (factorial % 2==0) {
			operacion=factorial*factorial;
		    System.out.println(factorial + " es un numero par,\n" 
		    		+ factorial + " X " + factorial +" = "+ operacion);

        }else {
			  operacion=factorial*factorial*factorial;
			  System.out.println(factorial + " es un numero primo,\n"
					  + factorial + " X " + factorial + " X " + factorial + " = " + operacion);
        }
        return operacion;

    }

	//Devuelve los ultimos dos digitos del @param Long que se ingreso
	static int tomaUltimosDigitos(long numero) {
		return  (int) (numero % 10000L);
	}

	//Revisa si el numero que recoge como parametro corresponde a un año bisiesto o no
	static void bisiesto(int cuatroNumeros) {
		
		if((cuatroNumeros % 4 == 0 && cuatroNumeros % 100 != 0) || cuatroNumeros % 400 == 0) {
			System.out.println( cuatroNumeros + " es un año bisiesto ");

		}else {
			System.out.println( cuatroNumeros + " no es un año bisiesto ");
		
		}
		
	}

	//suma cada digito que se recibe como parametro de una variable Long
	static int sumadigitos(long numero) {
		
		int suma=0;	
		while (numero != 0) {
            int digito = (int) (numero % 10); // obtener el ultimo digito del numero
            suma += digito; // sumar el digito al total
            numero /= 10; // eliminar el ultimo digito del n�mero
		}
		
		return suma;
		
	}
	
}
