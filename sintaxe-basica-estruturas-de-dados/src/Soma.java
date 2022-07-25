import javax.swing.JOptionPane;

public class Soma {
	public static void soma(float v1, float v2) {
		v1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o primeiro valor:"));
		v2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o segundo valor:"));
		float res = v1 + v2;
		JOptionPane.showInternalMessageDialog(null, "A soma entre: " + v1 + " + " + v2 + " = " + res);
	}
}
