
//Este exemplo efetua a ordenação dos elementos considerados anteriormente, exibindo o maior e o menor deles.
import javax.swing.JOptionPane;

public class MaisVetorArray {
	public static void main(String[] args) {
		float[] temp = new float[7];
		float x;
		String num;
		try {
			for (int i = 0; i < temp.length; i++) {
				num = JOptionPane.showInputDialog(null, "Informe os valores " + i + ":");
				temp[i] = Float.parseFloat(num);
			}
			for (int i = 0; i < temp.length; i++) {
				for (int j = i + 1; j < temp.length; j++) {
					if (temp[j] < temp[i]) {
						x = temp[i];
						temp[i] = temp[j];
						temp[j] = x;
					}
				}
			}
			JOptionPane.showInternalMessageDialog(null, "Mínimo: " + temp[0]);
			JOptionPane.showInternalMessageDialog(null, "Máximo: " + temp[6]);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Ocorreu um erro na leitura!.");
		}
	}
}
