import javax.swing.JOptionPane;

/*Este exemplo calcula a média das temperaturas, verificadas durante a semana, a partir
das médias diárias obtidas.*/
public class VetorTemperatura {

	public static void main(String[] args) {
		final int DIASDASEMANA = 7;
		float[] temp = new float[DIASDASEMANA];
		float soma = 0f, media;
		String num;

		try {
			for (int i = 0; i < DIASDASEMANA; i++) {
				num = JOptionPane.showInputDialog(null, "Informe a Temperatura do " + i + ":");
				temp[i] = Float.parseFloat(num);
				soma += temp[i];
			}
			media = (int) soma / DIASDASEMANA;
			JOptionPane.showInternalMessageDialog(null, "A Temperatura média da semana foi de: " + media);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Ocorreu um erro na leitura!.");
		}
	}
}
