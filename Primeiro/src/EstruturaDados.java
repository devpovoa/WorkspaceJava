import javax.swing.JOptionPane;

public class EstruturaDados {
	public static void main(String[] args) {
		int opcao;
		opcao = Integer.parseInt(JOptionPane.showInputDialog(null,
				"Escolha a sua opção:\n" + "1 - Adição\n" + "2 - Subtração\n" + "3 - Multiplicação\n" + "4 - Divisão"));

		switch (opcao) {
		case 1:
			modAdicao();
			break;
		case 2:
			modSubtr();
			break;
		case 3:
			modMultipl();
			break;
		case 4:
			modDiv();
			break;
		default:
			JOptionPane.showMessageDialog(null, "Valor incorreto.");
			break;
		}
	}

	static void modAdicao() {
		double vl;
		double v2;
		double res;
		vl = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor"));
		v2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor"));
		res = vl + v2;
		JOptionPane.showMessageDialog(null, "Soma = " + res);
	}

	static void modSubtr() {
		double vl;
		double v2;
		double res;
		vl = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor"));
		v2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor"));
		res = vl - v2;
		JOptionPane.showMessageDialog(null, "Subtração = " + res);
	}

	static void modMultipl() {
		double vl;
		double v2;
		double res;
		vl = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor"));
		v2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor"));
		res = vl * v2;
		JOptionPane.showMessageDialog(null, "Multiplicação = " + res);
	}

	static void modDiv() {
		double vl;
		double v2;
		double res;
		vl = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor"));
		v2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor"));
		res = vl / v2;
		JOptionPane.showMessageDialog(null, "Divisão = " + res);
	}
}
