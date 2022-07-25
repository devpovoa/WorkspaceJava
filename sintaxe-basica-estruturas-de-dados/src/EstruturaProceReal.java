import javax.swing.JOptionPane;

public class EstruturaProceReal {
	static void multiplicar(double a, double b) {
		double res;
		res = a * b;
		JOptionPane.showMessageDialog(null, "Resultado: " + res);
	}

	public static void main(String[] args) {
		double num1, num2;
		num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o primeiro valor: "));
		num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o segundo valor: "));
		multiplicar(num1, num2);
	}
}
