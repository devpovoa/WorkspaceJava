
/*Construa um algoritmo que verifique se
um dado número é divisível por outro, sen­
do que ambos devem ser fornecidos pelo
usuário, usando a passagem de parâmetros
formais, com a exibição do resultado no
programa principal.*/
import javax.swing.JOptionPane;

public class NumerosDivisiveis {
	public static void main(String[] args) {
		int num1, num2;
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Verifique a divisibilidade.\n Digite o primeiro número."));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Verifique a divisibilidade.\n Digite o segundo número."));
		if (divisivel(num1, num2))
			JOptionPane.showMessageDialog(null, "Os numeros " + num1 + " e " + num2 + " são divisíveis.");
		else
			JOptionPane.showMessageDialog(null, "Os numeros " + num1 + " e " + num2 + " não são divisíveis.");
	}

	static boolean divisivel(int num1, int num2) {
		if (num1 >= num2)
			return num1 % num2 == 0;
		else
			return num2 % num1 == 0;
	}
}
