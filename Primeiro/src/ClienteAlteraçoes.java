import java.io.*;
import javax.swing.JOptionPane;
//Classe que consulta e altera os dados da tabela cliente sequencial.
public class ClienteAlteraçoes {
	static StringBuffer memoria = new StringBuffer();
	static String arquivo = EscolherArquivo.caminho();

	public static void main(String[] args) {
		try {
			String arquivo = EscolherArquivo.caminho();
			BufferedReader arqentrada;
			arqentrada = new BufferedReader(new FileReader(arquivo));
			String nome = JOptionPane.showInputDialog(null, "Digite o nome");
			nome = nome.toUpperCase();
			String linha;
			String end = "";
			String tel = "";
			while ((linha = arqentrada.readLine()) != null) {
				memoria.append(linha + "\r\n");
			}
			int inicio = -1;
			inicio = memoria.indexOf(nome);
			if (inicio != -1) {
				int ultimo = memoria.indexOf("\t", inicio);
				nome = ler(inicio, ultimo);
				int primeiro = ultimo + 1;
				ultimo = memoria.indexOf("\t", primeiro);
				end = ler(primeiro, ultimo);
				primeiro = ultimo + 1;
				int fim = memoria.indexOf("\n", primeiro);
				tel = ler(primeiro, fim);
				RegAgenda regA1 = new RegAgenda(nome, end, tel);
				JOptionPane.showMessageDialog(null,
						"Endereço: " + regA1.mostraEnd() + "\n" + "Telefone: " + regA1.mostraTel());
				end = JOptionPane.showInputDialog(null, "Entre com o novo endereço");
				end = end.toUpperCase();
				regA1.alteraEnd(end);
				tel = JOptionPane.showInputDialog(null, "Entre com o novo telefone");
				regA1.alteraTel(tel);
				memoria.replace(inicio, fim + 1,
						regA1.mostraNome() + "\t" + regA1.mostraEnd() + "\t" + regA1.mostraTel() + "\r\n");
				grava();
				JOptionPane.showMessageDialog(null, "Atualização realizada com sucesso");

			} else {
				JOptionPane.showMessageDialog(null, "Não Cadastrado");
			}
			arqentrada.close();

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro de leitura");
		}
	}

	public static String ler(int primeiro, int ultimo) {
		String dados = "";
		dados = memoria.substring(primeiro, ultimo);
		return dados;
	}

	public static void grava() {
		try {
			BufferedWriter saida;
			saida = new BufferedWriter(new FileWriter(arquivo));
			saida.write(memoria.toString());
			saida.flush();
			saida.close();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro de gravação");
		}
	}
}
