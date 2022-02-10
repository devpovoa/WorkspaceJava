import javax.swing.JOptionPane;
import java.text.NumberFormat;

public class FolhaDePagamento {

	public static void main(String[] args) {
		String nome_func, cont;
		double salario, sal_liquido, irpf, inss, plano_saude, soma_sal_bruto = 0, soma_irpf = 0;
		do {
			inss = 0;
			plano_saude = 0.045;
			irpf = 0;
			nome_func = JOptionPane.showInputDialog("Informe o nome do funcionário.");
			salario = Float.parseFloat(JOptionPane.showInputDialog("Informe o salário."));
			if (salario <= 1903.98)
				irpf = 0;
			else if (salario >= 1903.99 && salario <= 2826.65)
				irpf = salario * 0.075 - 142.8;
			else if (salario >= 2826.66 && salario <= 3751.05)
				irpf = salario * 0.15 - 354.8;
			else if (salario >= 3751.06 && salario <= 4664.68)
				irpf = salario * 0.225 - 636.13;
			else
				irpf = salario * 0.275 - 869.36;
			if (salario <= 1556.94)
				inss = salario * 0.08;
			else if (salario >= 1556.95 && salario <= 2594.92)
				inss = salario * 0.09;
			else if (salario >= 2594.93 && salario <= 5189.82)
				inss = salario * 0.11;
			plano_saude = salario * plano_saude;
			sal_liquido = salario - (irpf + inss + plano_saude);
			soma_sal_bruto += salario;
			soma_irpf += irpf;
			System.out.println(
					"Funcionário " + nome_func + "\n-Redimentos " + NumberFormat.getCurrencyInstance().format(salario)
							+ "\n-Desconto inss " + NumberFormat.getCurrencyInstance().format(inss)
							+ "\n-Desconto irpf " + NumberFormat.getCurrencyInstance().format(irpf)
							+ "\n-Desconto plano saúde " + NumberFormat.getCurrencyInstance().format(plano_saude)
							+ "\n Líquido a receber " + NumberFormat.getCurrencyInstance().format(sal_liquido));
			cont = JOptionPane.showInputDialog("Deseja continuar? S/N ");
		} while (cont.equalsIgnoreCase("s"));
		System.out.println("Total da folha de pagamento " + NumberFormat.getCurrencyInstance().format(soma_sal_bruto)
				+ "\nTotal do IRPF devido " + NumberFormat.getCurrencyInstance().format(soma_irpf));
	}
}
