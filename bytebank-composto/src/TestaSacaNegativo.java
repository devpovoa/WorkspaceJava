
public class TestaSacaNegativo {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(100);
		System.out.println(conta.sacar(101));
		System.out.println(conta.getSaldo());
		
		
		//proibido.
		//conta.saldo = conta.saldo - 101;
		//System.out.println(conta.saldo);
		
		System.out.println(conta.getSaldo());
	}
}
