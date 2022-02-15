
//Estrutura de Função com parametros e retorno.
import javax.swing.JOptionPane;

public class EstruturaFuncao {
	public static void main(String[] args) {
		int num;
		int fat;

		num = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o número?"));
		fat = fatorial(num);
		JOptionPane.showMessageDialog(null, "O fatorial de " + num + " é " + fat);
	}

	static int fatorial(int num) {
		int f = 1;
		for (int i = 1; i <= num; i++)
			f *= i;
		return f;
	}
}
