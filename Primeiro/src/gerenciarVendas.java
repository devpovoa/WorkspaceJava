import javax.swing.JOptionPane;

public class gerenciarVendas {
	public static void main(String[] args) {
		int codigo, quant;
		String nome;
		float preco, total;

		codigo = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o código do produto:"));
		nome = JOptionPane.showInputDialog(null, "Qual o nome do produto:");
		preco = Float.parseFloat(JOptionPane.showInputDialog(null, "Qual o preço:"));
		quant = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a quantidade desejada:"));

		total = quant * preco;
		JOptionPane.showInternalMessageDialog(null, "Código: " + codigo + "\n" + "Nome: " + nome + "\n" + "Preço: "
				+ preco + "\n" + "Quantidade: " + quant + "\n" + "Total: " + total);
	}
}
