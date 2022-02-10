
//O programa a seguir faz a leitura de dez valores em um vetor e apresenta sua média aritmética.
import javax.swing.JOptionPane;

public class OutraMediaVetor {

	public static void main(String[] args) {
		try {
			float[] vetor = new float[10];
			float media, soma = 0f;
			String num;

			for (int i = 0; i < vetor.length; i++) {
				num = JOptionPane.showInputDialog("Digite o valor " + i + ":");
				vetor[i] = Float.parseFloat(num);
				soma += vetor[i];
			}
			media = soma / vetor.length;
			JOptionPane.showInternalMessageDialog(null, "Média: " + media);
		} catch (Exception e) {
			JOptionPane.showInternalMessageDialog(null, "Ocorreu um erro durante a leitura!.");
		}
	}

}
