import javax.swing.JOptionPane;

public class CadastroProfissional {
	public static void main(String[] args) {
		int quant_fem = 0, quant_masc = 0, quant_fem_exp = 0, quant_masc_exp = 0, idade_masc_exp = 0, idade_fem_exp = 0,
				quant_masc_3545 = 0, menor_idade = 0, idade, escolaridade;
		float media_masc_exp = 0, media_fem_exp = 0, porc_masc_3545 = 0;
		String sexo, experiencia, resposta = "S";
		int fundamental = 0, medio = 0, graduacao = 0, posgraduacao = 0;
		while (resposta.toUpperCase().equals("S")) {
			idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do candidato."));
			do {
				experiencia = JOptionPane.showInputDialog("O candidato tem experiência - SIM ou NAO");
				experiencia = experiencia.toUpperCase();
			} while (!((experiencia.equals("SIM")) || (experiencia.equals("NAO"))));
			do {
				sexo = JOptionPane.showInputDialog("Digite o sexo do candidato - F ou M ");
				if (sexo.toUpperCase().equals("F")) {
					quant_fem += 1;
					if (experiencia.equals("SIM")) {
						quant_fem_exp += 1;
						idade_fem_exp += idade;
						if ((menor_idade == 0) || (idade < menor_idade))
							menor_idade = idade;
					}
				} else if (sexo.toUpperCase().equals("M")) {
					quant_masc += 1;
					if (experiencia.equals("SIM")) {
						quant_masc_exp += 1;
						idade_masc_exp += idade;
					}
					if (idade >= 35 && idade <= 45)
						quant_masc_3545 += 1;
				} else
					JOptionPane.showMessageDialog(null, "SEXO INVÁLIDO");
				sexo = sexo.toUpperCase();
			} while (!((sexo.equals("F")) || (sexo.equals("M"))));
			do {
				escolaridade = Integer.parseInt(JOptionPane
						.showInputDialog("Escolha a escolaridade do candidato \n" + " 1 - ensino fundamental \n"
								+ " 2 - ensino médio \n" + " 3 - graduação \n" + " 4 - pós-graduação"));
				switch (escolaridade) {
				case 1:
					fundamental = fundamental + 1;
					break;
				case 2:
					medio = medio + 1;
					break;
				case 3:
					graduacao = graduacao + 1;
					break;
				case 4:
					posgraduacao = posgraduacao + 1;
				}
			} while (escolaridade < 1 || escolaridade > 4);
			resposta = JOptionPane.showInputDialog("Digite S para cadastrar outro candidato.");
		}
		porc_masc_3545 = (float) quant_masc_3545 / quant_masc * 100;
		media_masc_exp = (float) idade_masc_exp / quant_masc_exp;
		media_fem_exp = (float) idade_fem_exp / quant_fem_exp;
		JOptionPane.showMessageDialog(null,
				"Total de candidados do sexo feminino " + quant_fem + "\nTotal de candidados do sexo masculino "
						+ quant_masc + "\nA idade média dos homens com experiência " + media_masc_exp
						+ "\nA idade média das mulheres com experiência " + media_fem_exp
						+ "\nPercentagem de homens entre 35 e 45 anos " + porc_masc_3545 + "%"
						+ "\nMenor idade de mulheres com experiência " + menor_idade
						+ "\nTotal de candidados com ensino fundamental " + fundamental
						+ "\nTotal de candidados com ensino médio " + medio + "\nTotal de candidados graduados "
						+ graduacao + "\nTotal de candidados pós graduados " + posgraduacao);
	}
}
