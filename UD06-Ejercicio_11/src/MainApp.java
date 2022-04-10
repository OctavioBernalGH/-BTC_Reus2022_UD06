import java.util.Arrays;
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
		 * Flujo del programa
		 * 1. Crea dos arrays de n�meros con la dimensi�n pasada por teclado.
		 * 2. Uno de ellos estar� rellenado con n�meros aleatorios y el otro apuntar� al anterior
		 * reasignar� los valores del segundo array con valores aleatorios.
		 */
		System.out.print("Introduce la dimensi�n: ");
		Scanner sc = new Scanner(System.in);
		int tama�o = sc.nextInt();
		int [] arr1 = new int[tama�o];
		
		rellenarArr(arr1,tama�o);

	}
	
	public static void rellenarArr(int[]arr1,int tama�o) {
		
		/* Primero relleno el array 1 mediante Math.random y lo casteo a integer. */
		for(int i=0; i<arr1.length; i++) {
			arr1[i] = (int)(Math.random()*10);
		}
		
		/* Mediante copyof de la clase Arrays clono arr1 en arr2 */
		int [] arr2 = Arrays.copyOf(arr1, arr1.length);

		/* Relleno el arr2 con otros valores*/
		for(int i=0; i<arr2.length; i++) {
			arr2[i] = (int)(Math.random()*10);
		}
			
		multiplcarArr(arr1, arr2, tama�o);
		}
	
	public static void multiplcarArr(int [] arr1, int [] arr2, int tama�o) {
		int [] arrResult = new int [tama�o];
		/* Muestro el resultado de la multiplicaci�n  de 2 arrays*/
		System.out.println("MULTIPLICO 2 ARRAYS DE ENTEROS");
		
		for(int i=0; i<arr1.length; i++) {
			System.out.println("Arr1-Posici�n " + i + " valor " + arr1[i]);
		}
		System.out.println("----- Fin array 1 -----");
		
		for(int i=0; i<arr2.length; i++) {
			System.out.println("Arr2-Posici�n " + i + " valor " + arr2[i]);
		}
		System.out.println("----- Fin array 2 -----");
		for(int i=0; i<arr1.length; i++) {
			arrResult[i] = arr1[i] * arr2[i];
			System.out.println("ArrResultado-posici�n " + i + " valor " + arrResult[i]);
		}
		System.out.println("----- Fin arrResult -----");
		
	}

}
