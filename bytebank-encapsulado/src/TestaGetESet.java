
public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta(3028, 247412);
		
		Cliente cliente = new Cliente();
		conta.setTitular(cliente);
		
		cliente.setNome("Thiago Povoa");
		System.out.println(conta.getTitular().getNome());
		
		cliente.setCpf("123.123.123-12");
		System.out.println(conta.getTitular().getCpf());
		
		cliente.setProfissao("Programador");
		System.out.println(conta.getTitular().getProfissao());
		
		System.out.println(conta.getTitular());
		System.out.println(cliente);
		
		//conta.setNumeroDaConta(247412);
		System.out.println("Conta " + conta.getNumeroDaConta());
		
		//conta.setAgencia(3028);
		System.out.println("Agência " + conta.getAgencia());
		
		conta.deposita(1000);
		System.out.println("saldo " + conta.getSaldo());
		
		conta.sacar(500);
		System.out.println("saldo atual " + conta.getSaldo());
		
	}
}
