import javax.swing.JOptionPane;

public class MatrizComProce {

	public static void main(String[] args) {
		int matriz[][] = { { 1, 5, 6 }, { 7, 4, 0 }, { 2, 8, 3 } };
		int opcao = 0;
		while (opcao <= 3) {
			opcao = Integer.parseInt(JOptionPane.showInputDialog(null,
					"Escolha uma opção:\n" + "1 - Ordenar a matriz.\n" + "2 - Gerar matriz dos pares.\n"
							+ "3 - Gerar matriz dos múltiplos de 5.\n" + "4 - Sair."));
			switch (opcao) {
			case 1:
				ordenarMatriz(matriz);
				break;
			case 2:
				gerarMatrizPares(matriz);
				break;
			case 3:
				gerarMatrizMult5(matriz);
				break;
			default:
				System.exit(0);
				break;
			}
		}
	}

	static void ordenarMatriz(int m[][]) {
		int x;
		for (int i = 0; i < m.length; i++)
			for (int j = 0; j < m.length; j++)
				for (int k = 0; k < m.length; k++)
					for (int l = 0; l < m.length; l++)
						if (m[i][j] < m[k][l]) {
							x = m[i][j];
							m[i][j] = m[k][l];
							m[k][l] = x;
						}
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++)
				System.out.printf("%4d", m[i][j]);
			System.out.println();
		}
	}

	static void gerarMatrizPares(int m[][]) {
		int pares = 0, k = 0;
		for (int i = 0; i < m.length; i++)
			for (int j = 0; j < m.length; j++)
				if (m[i][j] % 2 == 0)
					pares++;
		int mPares[] = new int[pares];
		for (int i = 0; i < m.length; i++)
			for (int j = 0; j < m.length; j++)
				if (m[i][j] % 2 == 0) {
					mPares[k] = m[i][j];
					k++;
				}
		for (int i = 0; i < mPares.length; i++) {
			System.out.printf("%6d", mPares[i]);
		}
		System.out.println("");
	}

	static void gerarMatrizMult5(int m[][]) {
		int mult5 = 0, k = 0;
		for (int i = 0; i < m.length; i++)
			for (int j = 0; j < m.length; j++)
				if (m[i][j] % 5 == 0)
					mult5++;
		int mMult5[] = new int[mult5];
		for (int i = 0; i < m.length; i++)
			for (int j = 0; j < m.length; j++)
				if (m[i][j] % 5 == 0) {
					mMult5[k] = m[i][j];
				}
		for (int i = 0; i < mMult5.length; i++) {
			System.out.printf("%6d", mMult5[i]);
		}
		System.out.println("");
	}
}
