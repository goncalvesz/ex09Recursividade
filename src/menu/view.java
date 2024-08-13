package menu;

import javax.swing.JOptionPane;

import controller.RecursividadecController;

public class view {
	
	public static void main(String[] args) {
		RecursividadecController recursiva = new RecursividadecController();
		
		int numero = 0;
		
		while (numero > 19 || numero < 0 || numero%2 == 0) {
			try {
				numero = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor para ter seu fatorial duplo calculado"));
			} catch (NumberFormatException nfe) {
				JOptionPane.showMessageDialog(null, "Insira um numero inteiro!!!");
			}
			if (numero > 19) {
				JOptionPane.showMessageDialog(null, "O valor maximo que esse progama calcula é 19!!");
			}
			if (numero < 0 || numero%2==0) {
				JOptionPane.showMessageDialog(null, "Ese programa so calcula numeros impares maiores que 0");
			}
		}
		
		
		
		JOptionPane.showMessageDialog(null, "O fatorial duplo de " + numero + " é: " + recursiva.fatorialDuplo(numero));

	}

}
