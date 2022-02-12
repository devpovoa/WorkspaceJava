import java.util.Iterator;

import javax.swing.JOptionPane;

public class MediaAlunosMatriz {

	public static void main(String[] args) {
		final int NPROVAS = 3;
		final int NALUNOS = 10;
		float[][] notaProva = new float[NALUNOS][NPROVAS];
		float[] medAlunos = new float[NALUNOS];
		float[] medProvas = new float[NPROVAS];
		float soma = 0f;
		String num;
		try {
			for (int i = 0; i < NALUNOS; i++) {
				soma = 0f;
				for (int j = 0; j < NPROVAS; j++) {
					num = JOptionPane.showInputDialog(null, "Entre nota Aluno-" + i + " Prova-" + j);
					notaProva[i][j] = Float.parseFloat(num);
					soma += notaProva[i][j];
				}
				medAlunos[i] = soma / NPROVAS;
			}
			for (int j = 0; j < NPROVAS; j++) {
				soma = 0f;
				for (int i = 0; i < NALUNOS; i++) {
					soma += notaProva[i][j];
				}
				medProvas[j] = soma / NALUNOS;
			}
			for (int i = 0; i < NALUNOS; i++) {
				JOptionPane.showInternalMessageDialog(null, "Média do Aluno-- " + i + ":" + medAlunos[i]);
			}
			for (int i = 0; i < NPROVAS; i++) {
				JOptionPane.showInternalMessageDialog(null, "Média da Prova-- " + i + ":" + medProvas[i]);
			}
		} catch (Exception e) {
			JOptionPane.showInternalMessageDialog(null, "Ocorrência de erro na letitura!.");
		}
	}
}
