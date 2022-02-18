
/*Faça um algoritmo que possibilite o arredon­
damento de um número real para um núme­
ro inteiro, seguindo o arredondamento pa­
drão, utilizando a passagem por referência.*/
import javax.swing.JOptionPane;

public class ArendondaNumero {

	public static void main(String[] args) {
		float numFloat = Float.parseFloat(JOptionPane.showInputDialog("Digite o número para arredondar."));
		JOptionPane.showMessageDialog(null, "Número arredondado " + arredInt(numFloat));
	}

	static int arredInt(float num) {
		float decimal;
		int inteiro = (int) num;
		decimal = (float) num - inteiro;
		if (decimal < 0.5) {
			return inteiro;
		} else {
			return inteiro + 1;
		}
	}
}
