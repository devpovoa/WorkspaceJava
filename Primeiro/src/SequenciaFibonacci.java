import javax.swing.JOptionPane;

public class SequenciaFibonacci {
	public static void main(String[] args) {
		int anterior, atual, proximo, i, n;
		String s = "";

		n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de termos, maior que zero"));
		i = 1;
		anterior = 0;
		atual = 1;

		while (i <= n) {
			s = s + atual + ", ";
			proximo = atual + anterior;
			anterior = atual;
			atual = proximo;
			i++;
		}
		JOptionPane.showInternalMessageDialog(null, "Séries: " + s);
	}
}
