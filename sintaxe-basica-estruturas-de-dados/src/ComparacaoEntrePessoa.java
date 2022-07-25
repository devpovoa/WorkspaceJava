import javax.swing.JOptionPane;

public class ComparacaoEntrePessoa {
	public static void main(String[] args) {
		int altura_Pedro = 150;
		int altura_Lucas = 110;
		int tempo = 0;

		while (altura_Pedro != altura_Lucas) {
			altura_Pedro += 2;
			altura_Lucas += 3;
			tempo++;
		}
		JOptionPane.showInternalMessageDialog(null, "Pedro e Lucas terão a mesma altura em: " + tempo + " anos." + "\n"
				+ "Lucas seŕa maior que Pedro no ano seguinte.");
	}
}
