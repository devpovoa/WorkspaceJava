
public class OutroVetorArray {

	public static void main(String[] args) {
		int num[] = new int[6];
		int soma;
		soma = 0;

		/*
		 * for (int cont = 0; cont < 6; cont++) { soma += num[cont];
		 * System.out.println(num[cont]); }
		 */
		for (int i = 0; i < num.length; i++) {
			soma += num[i];
			System.out.println(num[i]);

		}
	}
}
