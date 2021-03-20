package javabasic;

import javax.swing.JOptionPane;

public class HolaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name= JOptionPane.showInputDialog("¿Cuál es tu nombre? ");
		JOptionPane.showMessageDialog(null, "Hola mundo Java soy yo de nuevo: "+ name);
	}

}
