
//Estrutura que chama um método a partir da escolha do usuário.
import javax.swing.JOptionPane;

public class EstrutaraDeDados {

	public static void main(String[] args) {
		int opcao;
		opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Informa o cálculo desejado: \n" + "Opções:\n"
				+ " 1 - Adição             2 - Subtração\t\n 3 - Multiplicação\t  4 - Divisão"));

		switch (opcao) {
		case 1:
			Soma.soma(opcao, opcao);
			break;
		case 2:
			Subracao.subracao(opcao, opcao);
			break;
		case 3:
			Multiplicacao.multiplicacao(opcao, opcao);
			break;
		case 4:
			Divisao.divisao(opcao, opcao);
			break;
		default:
			JOptionPane.showMessageDialog(null, "Valor incorreto.");
			break;
		}
	}
}
