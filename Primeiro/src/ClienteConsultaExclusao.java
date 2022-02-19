import java.io.*;
import javax.swing.JOptionPane;
//Classe que consulta e excluí dados da tabela cliente sequencial.
public class ClienteConsultaExclusao {
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
				int resp = JOptionPane.showConfirmDialog(null, "Deseja excluir?" + "\n" + regA1.mostraNome() + "\n"
						+ regA1.mostraEnd() + "\n" + regA1.mostraTel());
				if (resp == 0) {
					memoria.delete(inicio, fim + 1);
					grava();
					JOptionPane.showMessageDialog(null, "Atualização realizada com sucesso");
				}
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
