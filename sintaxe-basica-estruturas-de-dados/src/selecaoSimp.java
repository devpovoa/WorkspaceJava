import javax.swing.JOptionPane;

public class selecaoSimp {
	public static void main(String[] args) {
		int numero;

		numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor maior zero."));

		if (numero % 3 == 0)
			JOptionPane.showInternalMessageDialog(null, "Número " + numero + " é multiplo de 3.");
		if (numero % 7 == 0)
			JOptionPane.showInternalMessageDialog(null, "Número " + numero + " é multiplo de 7.");
		if ((numero % 3 != 0) && (numero % 7 != 0))
			JOptionPane.showInternalMessageDialog(null, "Número " + numero + " não é multiplo de 3 ou 7.");
	}
}
