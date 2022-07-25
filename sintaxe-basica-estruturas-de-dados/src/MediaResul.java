import javax.swing.JOptionPane;

public class MediaResul {
	public static void main(String[] args) {
		int valor1, valor2, valor3;
		float media;
		
		valor1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o primeiro valor:"));
		valor2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o segundo valor:"));
		valor3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o terceiro valor:"));
		
		media = (float) (valor1+valor2+valor3)/3;
		JOptionPane.showInternalMessageDialog(null, "Resultado: " + media);
	}

}
