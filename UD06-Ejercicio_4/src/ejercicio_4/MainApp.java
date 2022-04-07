package ejercicio_4;

import javax.swing.JOptionPane;

public class MainApp {

	public static void main(String[] args) {
		
		/*
		 * @author Octavio Bernal
		 * @version 0.0.0.1
		 * 
		 * Flujo del programa
		 * 1. Introducci�n n�mero por teclado para calcular el factorial.
		 * 2. M�todo para crear el factorial del n�mero recibido por par�metro.
		 */

		String factorial = JOptionPane.showInputDialog("Introduce un n�mero para generar factorial");
		int factorialInt = Integer.parseInt(factorial);
		generarFactorial(factorialInt);
		
	}

	public static void generarFactorial (int numeroFactorial) {
		
		int numBase = 1;
		for (int i = 1; i <= numeroFactorial; i++)
		{
			numBase *= i;
		}
		
		JOptionPane.showMessageDialog(null, "El factorial es: " + numBase);
		}
}
	

