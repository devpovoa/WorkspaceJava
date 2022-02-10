import javax.swing.JOptionPane;

public class calculadoraSoma {
	public static void main(String[] args) {
		int valor1, valor2, soma;

		valor1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o primeiro valor?"));
		valor2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o segundo valor?"));

		soma = valor1 + valor2;
		JOptionPane.showMessageDialog(null, "Resultado: " + soma);

	}
}
