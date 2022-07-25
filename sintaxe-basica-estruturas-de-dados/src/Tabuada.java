import javax.swing.JOptionPane;

public class Tabuada {

	public static void main(String[] args) {
		int num, res, opcao;

		num = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual tabuada deseja?"));
		opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Até quanto?"));
		for (int cont = 0; cont <= opcao; cont++) {
			res = num * cont;
			System.out.println(num + " x " + cont + " = " + res);
		}
	}
}
