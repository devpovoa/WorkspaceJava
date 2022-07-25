import javax.swing.JOptionPane;

public class terceira {

	public static void main(String[] args) {
		// o terceiro de muitos, exibição com entrada de dados.
		String nome;
		nome = JOptionPane.showInputDialog("Qual seu nome?");
		JOptionPane.showMessageDialog(null, "Seu nome é: " + nome);
	}

}
