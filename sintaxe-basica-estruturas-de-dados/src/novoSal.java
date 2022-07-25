import javax.swing.JOptionPane;

//programa que faz atualização de salário com 8,75%.
public class novoSal {
	public static void main(String[] args) {
		float sal_atual, novo_sal;
		String nome;

		nome = JOptionPane.showInputDialog(null, "Informe o nome do funcionário:");
		sal_atual = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe seu salário atutal:"));

		novo_sal = sal_atual * 1.0875f;
		JOptionPane.showInternalMessageDialog(null, "Funcionário: " + nome + "\n" + "Salário atutal: " + sal_atual
				+ "\n" + "Novo salário com reajuste de 8,75%: " + novo_sal);
	}

}
