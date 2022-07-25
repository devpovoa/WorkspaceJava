import javax.swing.JOptionPane;

//Realizar a soma dos números digitados até que o usuário encerre o programa.
//Estrutura básica de laço de repetição "Repita(do-while)".
public class EstruturaRepita {
	public static void main(String[] args) {
		float num, soma = 0f;
// O primeiro bloco se repetirá e logo após haverá um verificação da condição do
// laço.
		do {
			num = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe um número ou zero para sair: "));
			soma += num;
			JOptionPane.showMessageDialog(null, "A soma é: " + soma);
		} while (num != 0);
	}
}
