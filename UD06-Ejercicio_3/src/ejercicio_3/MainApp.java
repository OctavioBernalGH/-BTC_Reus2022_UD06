package ejercicio_3;

import javax.swing.JOptionPane;

public class MainApp {

	public static void main(String[] args) {

		/*
		 * @author Octavio Bernal
		 * 
		 * @fecha 07/04/2022
		 * 
		 * @version 0.0.0.1
		 * 
		 * Un n�mero primo es un n�mero natural que tiene solo dos divisores o factores:
		 * 1 y el mismo n�mero. Es decir, es primo aquel n�mero que se puede dividir por
		 * uno y por el mismo n�mero.
		 */

		/*
		 * FLUJO DEL PROGRAMA 1. Crear un m�todo que indique si un n�mero obtenido por
		 * par�metro es primo o no. El n�mero lo introduciremos por consola o por
		 * JOptionPane y se lo pasaremos por par�metro al m�todo.
		 */

		String numeroPrimoStr = JOptionPane.showInputDialog("Introduce un n�mero: ");
		int numeroPrimo = Integer.parseInt(numeroPrimoStr);

		detectorPrimos(numeroPrimo);
	}

	public static void detectorPrimos(int numeroPrimo) {

		if (((numeroPrimo % 2 == 0) && (numeroPrimo != 2)) || (numeroPrimo % 3 == 0) && (numeroPrimo != 3)
				|| (numeroPrimo == 1)) {
			JOptionPane.showMessageDialog(null, "El n�mero " + numeroPrimo + " no es primo.");
		} else if ((numeroPrimo == 2) || (numeroPrimo == 3)) {
			JOptionPane.showMessageDialog(null, "El n�mero " + numeroPrimo + " es primo.");
		} else {
			JOptionPane.showMessageDialog(null, "El n�mero " + numeroPrimo + " es primo.");
		}

	}

}
