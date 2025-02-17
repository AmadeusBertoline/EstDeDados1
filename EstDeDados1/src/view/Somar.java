package view;

import javax.swing.JOptionPane;
import controller.SomatorioController;

public class Somar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, soma;
		SomatorioController somar = new SomatorioController();

		n = Integer.parseInt(JOptionPane.showInputDialog("Digite o número misterioso:"));
		soma = somar.Somar(n);
		JOptionPane.showMessageDialog(null, soma);

	}

}
