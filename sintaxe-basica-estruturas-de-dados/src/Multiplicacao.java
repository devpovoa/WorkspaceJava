import javax.swing.JOptionPane;

public class Multiplicacao {
	public static void multiplicacao(float v1, float v2) {
		v1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o primeiro valor:"));
		v2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o segundo valor:"));
		float res = v1 * v2;
		JOptionPane.showInternalMessageDialog(null, "A Multiplicação entre: " + v1 + " * " + v2 + " = " + res);
	}
}
