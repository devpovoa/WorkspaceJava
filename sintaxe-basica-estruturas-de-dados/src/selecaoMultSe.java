import javax.swing.JOptionPane;

public class selecaoMultSe {
	public static void main(String[] args) {
		int codigo;
		codigo = Integer.parseInt(JOptionPane.showInputDialog("Insira o código:"));

		if (codigo == 001) {
			JOptionPane.showMessageDialog(null, "O produto é carderno");
		} else if (codigo == 002) {
			JOptionPane.showInternalMessageDialog(null, "O produto é lápis");
		} else if (codigo == 003) {
			JOptionPane.showInternalMessageDialog(null, "O produto é borracha");
		} else {
			JOptionPane.showInternalMessageDialog(null, "Diversos.");
		}
	}

}
