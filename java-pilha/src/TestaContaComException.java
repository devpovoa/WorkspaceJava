
public class TestaContaComException {

	public static void main(String[] args) {// throws MinhaExcecao {

		Conta novaC = new Conta();
		try {
			novaC.deposita();
		} catch (MinhaExcecao e) {
			System.out.println("Tratamento");
		}

	}

}
