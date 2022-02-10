import javax.swing.JOptionPane;

public class AnaliseNumeros {
	public static void main(String[] args) {
		int primeiro, ultimo;
		int cont;
		int quant_positivo = 0, soma_positivo = 0;
		int quant_pares = 0, soma_pares = 0;
		int quant_impares = 0, soma_impares = 0;
		int quant_impares37 = 0, soma_impares37 = 0;
		double media_positivos;
		double media_pares;
		double media_impares;
		double media_impares37;

		primeiro = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o primeiro número: "));
		ultimo = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o último número: "));
		for (cont = primeiro; cont <= ultimo; cont++) {
			if (cont > 0) {
				quant_positivo++;
				soma_positivo += cont;

			}
			if (cont % 2 == 0) {
				quant_pares++;
				soma_pares += cont;
			}
			if (cont % 2 != 0) {
				quant_impares++;
				soma_impares += cont;
			}
			if ((cont % 2 != 0) && (cont % 3 == 0) && (cont % 7 == 0)) {
				quant_impares37++;
				soma_impares37 += cont;
			}
		}
		if (quant_positivo > 0) {
			media_positivos = soma_positivo / quant_positivo;
		} else {
			media_positivos = 0;
		}
		if (quant_pares > 0) {
			media_pares = soma_pares / quant_pares;
		} else {
			media_pares = 0;
		}
		if (quant_impares > 0) {
			media_impares = soma_impares / quant_impares;
		} else {
			media_impares = 0;
		}
		if (quant_impares37 > 0) {
			media_impares37 = soma_impares37 / quant_impares37;
		} else {
			media_impares37 = 0;
		}
		JOptionPane.showInternalMessageDialog(null, "Quantidade de números positivos: " + quant_positivo
				+ "\n Média dos positivos: " + media_positivos + "\n Quantidades dos números pares: " + quant_pares
				+ "\n Média dos números pares: " + media_pares + "\n Quantidade dos números impares: " + quant_impares
				+ "\n Média dos números impares: " + media_impares + "\n Quantidade dos números divisores de 3 e 7: "
				+ quant_impares37 + "\n Média dos números divisores de 3 e 7: " + media_impares37);
	}
}
