package ejercicio_5;

import javax.swing.JOptionPane;

public class MainApp {

	public static void main(String[] args) {

		/*
		 * @author Octavio Bernal
		 * 
		 * @fecha 07/04/2022
		 * 
		 * @version 0.0.0.2
		 * 
		 * Flujo del programa 1. Crear un m�todo que convierta un n�mero base decimal a
		 * binario. Le pasaremos una variable entera como par�metro y nos devolver� un
		 * String.
		 * 
		 */

		/*
		 * Mediante un selector podremos realizar la conversi�n mediante una funci�n
		 * corta o mediante bucles for.
		 */

		String selector = JOptionPane.showInputDialog("Introduce A para conversi�n mediante m�todo .toBinary "
				+ "\nIntroduce B para conversi�n mediante bucles").toUpperCase();

		/* Introducci�n n�mero base decimal */
		String datoDecimalStr = JOptionPane.showInputDialog("Introduce un n�mero base decimal ");
		int datoDecimalInt = Integer.parseInt(datoDecimalStr);

		/* Aplicaci�n selector */
		if (selector.charAt(0) == 'A') {
			devolverBinario(datoDecimalInt);
		} else if (selector.charAt(0) == 'B') {
			devolverBinarioFor(datoDecimalInt);
		}

	}

	/* Conversi�n mediante funci�n corta */
	public static void devolverBinario(int datoDecimalInt) {

		String binario = Integer.toBinaryString(datoDecimalInt);
		JOptionPane.showMessageDialog(null, binario);

	}

	/* Conversi�n mediante bucle for */
	public static void devolverBinarioFor(int datoDecimalIntFor) {

		String numeroBinario = "";

		/* String sin invertir */
		while (datoDecimalIntFor > 0) {
			numeroBinario += datoDecimalIntFor % 2;
			datoDecimalIntFor = datoDecimalIntFor / 2;
		}

		/* String correcto */
		String variableInvertida = "";
		for (int i = numeroBinario.length() - 1; i >= 0; i--) {
			variableInvertida += numeroBinario.charAt(i);
		}
		JOptionPane.showMessageDialog(null, variableInvertida);
	}
}
