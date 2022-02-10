import javax.swing.JOptionPane;

public class ConsultaCalculo {

	public static void main(String[] args) {
		int n;
		n = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número diferente de zero"));

		while (n != 1) {
			if (n % 2 == 0) {
				n = n / 2;
			} else {
				n = n * 3 + 1;
			}
		}
	}
}