import javax.swing.JOptionPane;

public class OutroFacaEnq {
	public static void main(String[] args) {
		float num, soma, media;
		int cont;
		soma = 0f;
		cont = 0;

		do {
			num = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe um número"));
			soma += num;
			cont++;
		} while (cont < 3);
		media = soma / cont;
		JOptionPane.showMessageDialog(null, "Média igual à: " + media);
	}
}
