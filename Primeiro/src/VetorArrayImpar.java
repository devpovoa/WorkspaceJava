/*Desenvolver um algoritmo que efetue a entrada de cinco elementos inteiros para um
vetor A. Ao final, apresentar a soma de todos os elementos cujo valor seja ímpar.*/

import javax.swing.JOptionPane;

public class VetorArrayImpar {
	public static void main(String[] args) {
		final int TAMANHO = 5;
		int[] A = new int[TAMANHO];
		int soma = 0;
		String num;
		try {
			for (int i = 0; i < TAMANHO; i++) {
				num = JOptionPane.showInputDialog("Digite os valores " + i + ":");
				A[i] = Integer.parseInt(num);
			}
			for (int i = 0; i < TAMANHO; i++) {
				if (A[i] % 2 != 0) {
					soma += A[i];
				}
			}
			JOptionPane.showInternalMessageDialog(null, "Soma do ímpares = " + soma);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Ocorreu um erro na leitura!.");
		}
	}
}
