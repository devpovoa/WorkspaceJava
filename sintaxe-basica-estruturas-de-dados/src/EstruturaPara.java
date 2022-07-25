import javax.swing.JOptionPane;

public class EstruturaPara {
	public static void main(String[] args) {
		float soma = 0f, num, media;
		int cont = 0;

		for (cont = 0; cont < 3; cont++) {
			num = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe um número"));
			soma += num;
		}
		media = soma / cont;
		JOptionPane.showInternalMessageDialog(null, "Média igual a: " + media);
	}
}
