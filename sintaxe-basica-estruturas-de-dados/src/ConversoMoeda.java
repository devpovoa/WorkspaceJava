import javax.swing.JOptionPane;
import java.text.NumberFormat;
import java.util.Currency;

public class ConversoMoeda {

	public static void main(String[] args) {
		Currency moedaUS = Currency.getInstance("USD");
		NumberFormat formatUS = NumberFormat.getCurrencyInstance();
		formatUS.setCurrency(moedaUS);
		Currency moedaBRL = Currency.getInstance("BRL");
		NumberFormat formatBRL = NumberFormat.getCurrencyInstance();
		formatBRL.setCurrency(moedaBRL);
		Currency moedaCHF = Currency.getInstance("CHF");
		NumberFormat formatCHF = NumberFormat.getCurrencyInstance();
		formatCHF.setCurrency(moedaCHF);
		Currency moedaGBP = Currency.getInstance("GBP");
		NumberFormat formatGBP = NumberFormat.getCurrencyInstance();
		formatGBP.setCurrency(moedaGBP);
		Currency moedaJPY = Currency.getInstance("JPY");
		NumberFormat formatJPY = NumberFormat.getCurrencyInstance();
		formatJPY.setCurrency(moedaJPY);
		int opcao = 0;
		while (opcao <= 8) {
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção de conversão:\n"
					+ "1 - Real (R$) para Dólar (US$).\n" + "2 - Dólar (US$) para Real (R$).\n"
					+ "3 - Real (R$) para Franco (CHF).\n" + "4 - Franco (CHF) para Real (R$).\n"
					+ "5 - Real (R$) para Libra (GBP).\n" + "6 - Libra (GBP) para Real (R$).\n"
					+ "7 - Real (R$) para Iene (JPY).\n" + "8 - Iene (JPY) para Real (R$).\n" + "9 - Encerrar."));
			float valor;
			switch (opcao) {
			case 1:
				valor = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor para conversão."));
				JOptionPane.showMessageDialog(null, "Valor em Real " + formatBRL.format(valor) + "\nValor em Dólar "
						+ formatUS.format(realDolar(valor)));
				break;
			case 2:
				valor = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor para conversão."));
				JOptionPane.showMessageDialog(null, "Valor em Dólar " + formatUS.format(valor) + "\nValor em Real "
						+ formatBRL.format(dolarReal(valor)));
				break;
			case 3:
				valor = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor para conversão."));
				JOptionPane.showMessageDialog(null, "Valor em Real " + formatBRL.format(valor) + "\nValor em Franco "
						+ formatCHF.format(realFranco(valor)));
				break;
			case 4:
				valor = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor para conversão."));
				JOptionPane.showMessageDialog(null, "Valor em Franco " + formatCHF.format(valor) + "\nValor em Real "
						+ formatBRL.format(francoReal(valor)));
				break;
			case 5:
				valor = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor para conversão."));
				JOptionPane.showMessageDialog(null, "Valor em Real " + formatBRL.format(valor) + "\nValor em Libra "
						+ formatGBP.format(realLibra(valor)));
				break;
			case 6:
				valor = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor para conversão."));
				JOptionPane.showMessageDialog(null, "Valor em Libra " + formatGBP.format(valor) + "\nValor em Real "
						+ formatBRL.format(libraReal(valor)));
				break;
			case 7:
				valor = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor para conversão."));
				JOptionPane.showMessageDialog(null, "Valor em Real " + formatBRL.format(valor) + "\nValor em Iene "
						+ formatJPY.format(realIene(valor)));
				break;
			case 8:
				valor = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor para conversão."));
				JOptionPane.showMessageDialog(null, "Valor em Iene " + formatJPY.format(valor) + "\nValor em Real "
						+ formatBRL.format(ieneReal(valor)));
				break;
			default:
				System.exit(0);
			}
		}
	}

	static float realDolar(float valor) {
		return valor / 3.25f;
	}

	static float dolarReal(float valor) {
		return valor * 3.25f;
	}

	static float realFranco(float valor) {
		return valor / 3.09f;
	}

	static float francoReal(float valor) {
		return valor * 3.09f;
	}

	static float realLibra(float valor) {
		return valor / 3.85f;
	}

	static float libraReal(float valor) {
		return valor * 3.85f;
	}

	static float realIene(float valor) {
		return valor / 0.0273f;
	}

	static float ieneReal(float valor) {
		return valor * 0.0273f;
	}
}
