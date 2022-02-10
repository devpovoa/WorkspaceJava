import javax.swing.JOptionPane;

public class selecaoComposta {
	public static void main(String[] args) {
		int numero;
		numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Número: "));

		if (numero % 2 == 1) {
			JOptionPane.showMessageDialog(null, "O número digitado foi: " + numero + "\n" + "Logo ele é impar.");
		} else {
			JOptionPane.showMessageDialog(null, "O número digitado foi: " + numero + "\n" + "Logo ele é par.");
		}
	}
}