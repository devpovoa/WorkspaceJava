
public class TesteReferencia {

	public static void main(String[] args) {

		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		System.out.println("saldo da primeira conta: " + primeiraConta.saldo);

		Conta segundaConta = primeiraConta;
		System.out.println("saldo da segunda conta: " + segundaConta.saldo);

		segundaConta.saldo += 200;
		System.out.println("saldo da segunda conta atualizado: " + segundaConta.saldo);
		System.out.println("saldo da primeira conta atualizado " + primeiraConta.saldo);

		if (primeiraConta == segundaConta) {
			System.out.println("É a mesma conta, ambas usam o mesmo objeto.");
		} else {
			System.out.println("Não são iguais, nem possuem o mesmo objeto.");
		}
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}
}
