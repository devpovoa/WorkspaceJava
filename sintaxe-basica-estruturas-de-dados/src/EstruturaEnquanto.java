import javax.swing.JOptionPane;

//Obter 3 números fornecidos pelo usuário, calcular e exibir a média.
//Estrutura básica de laço de repetição "Enquanto(while)".
public class EstruturaEnquanto {
	public static void main(String[] args) {
		float soma, num, media;
		int cont;
		soma = 0f;
		cont = 0;
		// Laço que se repetira enquanto condição for verdadeira.
		while (cont < 3) {
			num = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe um número: "));
			soma += num;
			cont++;
		}
		media = soma / cont;
		JOptionPane.showMessageDialog(null, "Média = " + media);
	}
}
