
public class TestaValores {

	public static void main(String[] args) {
		Conta conta = new Conta(3028, 247412);

		System.out.println(conta.getAgencia());
		System.out.println(conta.getNumeroDaConta());
		
		Conta conta1 = new Conta(3028, 247413);

		System.out.println(conta1.getAgencia());
		System.out.println(conta1.getNumeroDaConta());
		
		Conta conta2 = new Conta(3028, 247414);

		System.out.println(conta2.getAgencia());
		System.out.println(conta2.getNumeroDaConta());
		
		System.out.println(Conta.getTotal());

	}
}
