import java.io.*;
import javax.swing.JOptionPane;

public class ClienteCadastro {

	public static void main(String[] args) {
		try {
			String arquivo = EscolherArquivo.caminho();
			BufferedWriter saida;
			saida = new BufferedWriter(new FileWriter(arquivo, true));
			String nome = JOptionPane.showInputDialog(null, "Digite o nome");
			nome = nome.toUpperCase();
			String end = JOptionPane.showInputDialog(null, "Digite o endereço");
			end = end.toUpperCase();
			String tel = JOptionPane.showInputDialog(null, "Digite o telefone");
			RegAgenda regAg1 = new RegAgenda(nome, end, tel);
			saida.write(regAg1.mostraNome() + "\t");
			saida.write(regAg1.mostraEnd() + "\t");
			saida.write(regAg1.mostraTel() + "\r\n");
			saida.flush();
			saida.close();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro de acesso ao arquivo");
		}

	}

}
