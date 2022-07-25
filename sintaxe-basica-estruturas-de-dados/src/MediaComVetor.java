import javax.swing.JOptionPane;

public class MediaComVetor {

	public static void main(String[] args) {
		double valores[] = new double[10];
		double soma = 0, media;

		for (int i = 0; i < valores.length; i++) {
			valores[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite os valores " + i + ":"));
			soma += valores[i];
		}
		media = soma / valores.length;
		JOptionPane.showInternalMessageDialog(null, "O Valor da Média é: " + media);
	}
}
