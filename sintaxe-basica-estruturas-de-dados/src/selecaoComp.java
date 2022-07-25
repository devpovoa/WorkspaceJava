import javax.swing.JOptionPane;

public class selecaoComp {
	public static void main(String[] args) {
		int numero;
		numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Número: "));

		if (numero == 0) {
			JOptionPane.showMessageDialog(null, "Valor neutro.");
		} else if (numero % 2 == 1) {
			JOptionPane.showInternalMessageDialog(null, "Número " + numero + " é impar.");
		} else {
			JOptionPane.showInternalMessageDialog(null, "Número " + numero + " é par.");
		}
	}
}
