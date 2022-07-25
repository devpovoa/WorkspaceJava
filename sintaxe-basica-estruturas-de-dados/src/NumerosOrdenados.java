
/*Escreva um algoritmo para ordenar três nú­meros fornecidos pelo usuário, utilizando a
passagem de parâmetros formais.*/
import javax.swing.JOptionPane;

public class NumerosOrdenados {
	public static void main(String[] args) {
		int num1, num2, num3;
		try {
			num1 = Integer.parseInt(
					JOptionPane.showInputDialog(null, "Informe três números inteiros.\n " + "Digite o primeiro."));
			num2 = Integer.parseInt(
					JOptionPane.showInputDialog(null, "Informe três números inteiros.\n " + "Digite o segundo."));
			num3 = Integer.parseInt(
					JOptionPane.showInputDialog(null, "Informe três números inteiros.\n " + "Digite o terceiro."));
			ordenar(num1, num2, num3);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Ocorrência de erro na leitura!.");
		}
	}

	static void ordenar(int a, int b, int c) {
		int aux;
		if (a > b) {
			aux = a;
			a = b;
			b = aux;
		}
		if (a > c) {
			aux = a;
			a = c;
			c = aux;
		}
		if (b > c) {
			aux = b;
			b = c;
			c = aux;
		}
		JOptionPane.showMessageDialog(null, "Números ordenados:\n" + a + ", " + b + ", " + c);
	}
}
