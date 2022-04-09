package ejercicio_9;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		
		/*
		 * @author Octavio Bernal
		 * 
		 * @fecha 09/04/2022
		 * 
		 * @version 0.0.0.1
		 */

		/*
		 * Flujo del programa
		 * 1. Crear un array , le pasaremos por teclado el tama�o.
		 * 2. Crear un m�todo para llenarlo con n�meros aleatorios.
		 * 3. Crear otro m�todo para recorrerlo y mostrar los valores.
		 * 4. Dentro del m�todo anterior sumaremos los valores.
		 */

		crearArray();
	}
	
	public static void crearArray() {
		System.out.print("Introduce el tama�o del array: ");
		Scanner sc = new Scanner(System.in);
		int tama�o = sc.nextInt();
		int [] basicArray = new int [tama�o];
		
		for(int i=0; i<basicArray.length;i++) {
			basicArray[i]= (int) (Math.random()*10);
		}
		
		recorrerArray(basicArray);
	}
	
	public static void recorrerArray(int[]arrNumerico) {
		int totalizador = 0;
		for(int i=0; i<arrNumerico.length; i++) {
			System.out.println("Posici�n " + i + " valor " + arrNumerico[i]);
			totalizador += arrNumerico[i];
		}
		System.out.println("La suma de todos es: " + totalizador);
	}
}
