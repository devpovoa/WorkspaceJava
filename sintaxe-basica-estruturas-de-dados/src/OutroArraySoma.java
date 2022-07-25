/*Elabore um algoritmo que crie dois vetores
A e B de 10 elementos e, a partir deles, crie
um vetor C, composto pela união dos ele­
mentos de A e B. dispostos em ordem cres­
cente, exibindo o resultado.*/
public class OutroArraySoma {

	public static void main(String[] args) {
		int A[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
		int B[] = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19 };
		int C[] = new int[A.length + B.length];
		for (int i = 0; i < A.length; i++)
			C[i] = A[i];
		int j = 0;
		for (int i = A.length; i < A.length + B.length; i++) {
			C[i] = B[j];
			j++;
		}
		int x;
		for (int i = 0; i < C.length; i++) {
			for (j = i + 1; j < C.length; j++) {
				if (C[j] < C[i]) {
					x = C[i];
					C[i] = C[j];
					C[j] = x;
				}
			}
		}
		for (int i = 0; i < C.length; i++)
			System.out.println("C [" + i + "]: " + C[i]);
	}
}