import javax.swing.JOptionPane;

//Programa para cálcular valor de compra e aplicar formula de negócio.
public class compraParcelada {
	public static void main(String[] args) {
		float valor, parcela;
		int opcao;

		valor = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o valor total da venda."));
		opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a opção de pagamento."));

		switch (opcao) {
		case 1:
			valor -= valor * 0.05f;
			JOptionPane.showInternalMessageDialog(null, "Pagamento de $ " + valor);
			break;
		case 2:
			parcela = valor / 3;
			JOptionPane.showInternalMessageDialog(null, "Pagamento de $" + valor + " em 3 parcelas de $ " + parcela);
			break;
		case 3:
			valor = valor * 1.02f;
			parcela = valor / 5;
			JOptionPane.showInternalMessageDialog(null, "Pagamento de $" + valor + " em 5 parcelas de $ " + parcela);
			break;
		case 4:
			valor = valor * 1.08f;
			parcela = valor / 10;
			JOptionPane.showInternalMessageDialog(null, "Pagamento de $" + valor + " em 10 parcelas de $ " + parcela);
			break;
		default:
			JOptionPane.showMessageDialog(null, "Opção incorreta.");
			break;
		}
	}
}
