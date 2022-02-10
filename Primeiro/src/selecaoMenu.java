import javax.swing.JOptionPane;

public class selecaoMenu {
	public static void main(String[] args) {
		int opcao;

		opcao = Integer.parseInt(JOptionPane.showInputDialog(null,
				" Para cadastrar cliente digite: 1\n Para excluir um cliente digite: 2\n Para alterar um cliente digite: 3\n Para sair digite: 4"));
		switch (opcao) {
		case 1:
			JOptionPane.showInternalMessageDialog(null, "Cadastrar cliente");
			break;
		case 2:
			JOptionPane.showInternalMessageDialog(null, "Excluir cliente");
			break;
		case 3:
			JOptionPane.showInternalMessageDialog(null, "Alterar cliente");
			break;
		case 4:
			JOptionPane.showInternalMessageDialog(null, "Sair do Programa");
			break;
		default:
			JOptionPane.showInternalMessageDialog(null, "Informe um código válido.");
			break;
		}
	}
}
