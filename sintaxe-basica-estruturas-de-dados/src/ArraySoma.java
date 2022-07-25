
public class ArraySoma {

	public static void main(String[] args) {
		int A[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int B[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int C[] = new int[10];
		int j = A.length - 1;
		for (int i = 0; i < A.length; i++) {
			C[i] = A[i] + B[j];
			j--;
			System.out.println("C [" + i + "]: " + C[i]);
		}
	}
}