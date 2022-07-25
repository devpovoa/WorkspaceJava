
public class TestaSomatoria {
	public static void main(String[] args) {

		int contador = 0;
		int valor = 0;
		while (contador <= 10) {
			valor += contador;
			contador++;
		}
		System.out.println(valor);
	}
}
