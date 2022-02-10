import javax.swing.JOptionPane;

public class Calculo {

	public static void main(String[] args) {
		float num, soma = 0f;
		String continuar = "";

		do {
			num = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite um número: "));
			soma += num;
			continuar = JOptionPane.showInputDialog(null, "Deseja continuar, digite S.");
		} while (continuar.toUpperCase().equals("S"));
		JOptionPane.showMessageDialog(null, "A soma é: " + soma);
	}
}
