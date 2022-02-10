import javax.swing.JOptionPane;

public class selecaosimples {
	public static void main(String[] args) {
		int numero;
		numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Número: "));

		if (numero % 2 == 1) {
			JOptionPane.showMessageDialog(null, "O número é impar");
		}
	}
}
