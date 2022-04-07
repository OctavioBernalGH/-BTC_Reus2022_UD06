package ejercicio_2;

import javax.swing.JOptionPane;

public class MainApp {

	public static void main(String[] args) {

		/*
		 * @author Octavio Bernal
		 * 
		 * @fecha 07/04/2022
		 * 
		 * @version 0.0.0.1
		 */

		/*
		 * FLUJO DEL PROGRAMA. 1. Seleccionar la cantidad de n�meros aleatorios a
		 * generar. 2. M�todo que recibir� la cantidad de n�meros aleatorios a generar.
		 */

		String numGenerarStr = JOptionPane.showInputDialog("Introduce la cantidad de n�meros  aleatorios a generar");
		int numGenerarInt = Integer.parseInt(numGenerarStr);
		generarNumeros(numGenerarInt);

	}

	public static void generarNumeros(int datoInt) {
		int[] numAleatorios = new int[datoInt];
		for (int i = 0; i < numAleatorios.length; i++) {
			numAleatorios[i] = (int) (Math.random() * 10 + 1);
			JOptionPane.showMessageDialog(null, "Posici�n: " + i + " valor: " + numAleatorios[i]);
		}

	}

}
