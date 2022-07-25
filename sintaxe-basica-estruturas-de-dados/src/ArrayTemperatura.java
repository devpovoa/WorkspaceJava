
//Algoritmo com as temperaturas acima da média.
import javax.swing.JOptionPane;

public class ArrayTemperatura {

	public static void main(String[] args) {
		float temp[] = new float[7];
		float media = 0f;
		int quant = 0;
		String num;
		try {
			for (int i = 0; i < temp.length; i++) {
				num = JOptionPane.showInputDialog(null, "Digite o valor " + i + ";");
				temp[i] = Float.parseFloat(num);
			}
			for (int i = 0; i < temp.length; i++)
			media += temp[i];
			media /= temp.length;
			System.out.print("Temperatutas acima da média ");
			System.out.printf("%s%.1f%s\n", "(", media, "):");

			for (int i = 0; i < temp.length; i++) {
				if (temp[i] > media) {
					System.out.printf("%s%d%s%.1f\n", "temp[", i, "]= ", temp[i]);
					quant++;
				}
			}
			System.out.printf("%s%d", "Quantidade: ", quant);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Ocorrência de erro na leitura!.");
		}
	}
}
