import javax.swing.JOptionPane;

public class Mediana {

	public static void main(String[] args) {
		int numInicial, numFinal;

		numInicial = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o primeiro número:"));
		numFinal = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o segundo número:"));

		while (numInicial < numFinal) {
			numInicial++;
			numFinal--;
		}
		if (numInicial == numFinal) {
			JOptionPane.showInternalMessageDialog(null, "A mediana seŕa: " + numInicial);
		} else {
			JOptionPane.showInternalMessageDialog(null, "A mediana seŕa: " + (float) (numInicial + numFinal) / 2);
		}
	}

}
