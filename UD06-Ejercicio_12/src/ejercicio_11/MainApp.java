package ejercicio_11;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {

		/*
		 * @author Octavio Bernal
		 * 
		 * @fecha 10/04/2022
		 * 
		 * @version 0.0.0.1
		 */

		/*
		 * 1. Crea un array de n�meros con tama�o definido por teclado. 
		 * El array contendr� n�meros aleatorios del 1 al 300 y mostrar�
		 * aquellos que acaben en un d�gito que nosotros indiquemos por teclado. 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce el tama�o del array: ");
		int tama�o = sc.nextInt();
		
		System.out.print("Filtra n�meros que acaben en: ");
		int filtro = sc.nextInt();
		
		int [] arr = new int[tama�o];

		generarArr(arr,filtro);
	}
	
	public static void generarArr(int [] arr, int filtro) {

		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()* 300);
			
			
			if(arr[i] % 10 == filtro) {
				System.out.println("Posici�n " + i + " valor " + arr[i]);
			}

		}
	}
}
