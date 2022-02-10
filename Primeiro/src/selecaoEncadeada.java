import javax.swing.JOptionPane;

public class selecaoEncadeada {
	public static void main(String[] args) {
		int a, b, c;

		a = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor de A"));
		b = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor de B"));
		c = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor de C"));

		if ((a != 0) && (b != 0) && (c != 0)) {
			if ((a + b > c) && (a + c > b) && (b + c > a)) {
				if ((a != b) && (a != c) && (b != c)) {
					JOptionPane.showMessageDialog(null, "É um triângulo escaleno.");
				} else if ((a == b) || (b == c)) {
					JOptionPane.showMessageDialog(null, "É um triângulo equilátero.");
				} else {
					JOptionPane.showMessageDialog(null, "É um triângulo isóseles.");
				}
			} else {
				JOptionPane.showMessageDialog(null, "Os valores não formam um triângulo.");
			}
		} else {
			JOptionPane.showMessageDialog(null, "Os valores não formam um triângulo.");
		}
	}
}
