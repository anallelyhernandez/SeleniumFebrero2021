package javabasic;

import javax.swing.JOptionPane;

public class HolaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name= JOptionPane.showInputDialog("¿Cuál es tu nombre? ");
		System.out.println("Hola Mundo Java con Selenium, You can");
		JOptionPane.showMessageDialog(null, "Hola mundo Java soy "+ name+" de nuevo: ");
	}

}
