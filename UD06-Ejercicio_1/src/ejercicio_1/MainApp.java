package ejercicio_1;

import javax.swing.JOptionPane;

public class MainApp {

	public static void main(String[] args) {
		
		/* Crea una aplicaci�n que nos calcule el �rea de un circulo, cuadrado o triangulo.
		 * Pediremos que figura queremos calcular, y seg�n lo introducido los valores
		 * necesarios para su c�lculo. Crea un m�todo para cada figura. Este devolver�
		 * un n�mero real. Muestra el resultado por pantalla.
		 */
	
	/* Mediante toUpperCase paso el contenido a Mayusculas*/
	String selectorFigura = seleccionFigura().toUpperCase();

	/* Selecciono el primer caracter como filtro para evitar alg�n error*/
	char caracter = selectorFigura.charAt(0);
	
	/* Comparo el contenido de la variable caracter con la letra correspondiente */
	if (caracter == ('C')) {
		double resultado = calculoCirculo();
		JOptionPane.showMessageDialog(null, "El �rea del circulo es: " + resultado);
	} else if(caracter == ('Q')) {
		double resultado = calculoCuadrado();
		JOptionPane.showMessageDialog(null, "El �rea del cuadrado es: " + resultado);
	} else if(caracter == ('T')) {
		double resultado = calculoTriangulo();
		JOptionPane.showMessageDialog(null, "El �rea del triangulo es: " + resultado);
	} else {
		JOptionPane.showMessageDialog(null, "Error en la introducci�n de datos");
	}
	}
	
	/*
	 * 
	 *  M�TODOS
	 * 
	 */
	
	/* Selector de figura con JOptionPane */
	public static String seleccionFigura() {
		String seleccion = JOptionPane.showInputDialog("Figura a calcular �rea, introduce: \nC = Circulo\nQ = Cuadrado \nT = Triangulo");
		return seleccion;
	}
	
	/* C�lculo del �rea del circulo */
	public static double calculoCirculo() {
		String radioStr = JOptionPane.showInputDialog("Introduce radio");
		double resultado = (Math.pow(Double.parseDouble(radioStr), 2)) * 3.1415;
		return resultado;
	}
	
	/* C�lculo del �rea del cuadrado */
	public static double calculoCuadrado() {
		String ladoStr = JOptionPane.showInputDialog("Introduce longitud del lado");
		double resultado = (Double.parseDouble(ladoStr) * Double.parseDouble(ladoStr));
		return resultado;
	}
	
	/* C�lculo del �rea del triangulo */
	public static double calculoTriangulo() {
		String baseStr = JOptionPane.showInputDialog("Introduce la base");
		String alturaStr = JOptionPane.showInputDialog("Introduce la altura");
		double resultado = (Double.parseDouble(baseStr)*Double.parseDouble(alturaStr) / (2));
		return resultado;
	}

}
