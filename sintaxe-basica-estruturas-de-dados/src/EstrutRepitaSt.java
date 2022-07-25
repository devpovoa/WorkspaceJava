import javax.swing.JOptionPane;

public class EstrutRepitaSt {
	public static void main(String[] args) {
		String resposta = "sim";
		while (resposta.equals("sim")) {
			resposta = JOptionPane.showInputDialog(null, "Deseja continuar?");
		}
	}
}
