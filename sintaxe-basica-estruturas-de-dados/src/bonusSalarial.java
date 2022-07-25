import javax.swing.JOptionPane;

//Este programa cálcula o salário e informa o bônus que será aplicado de acordo com o tempo na empresa.
public class bonusSalarial {
	public static void main(String[] args) {
		float salario, bonus;
		int tempo;

		salario = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe seu salário"));
		tempo = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe seu tempo na empresa"));

		if (tempo >= 5) {
			bonus = salario * 0.20f + salario;
		} else {
			bonus = salario * 0.10f + salario;
		}
		JOptionPane.showMessageDialog(null, "Seu salário atual será de : " + bonus);
	}
}
