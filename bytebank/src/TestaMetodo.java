
public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDeThiago = new Conta();
		contaDeThiago.saldo = 100;
		contaDeThiago.deposita(50);
		
		System.out.println("Seu novo saldo agora é: " + contaDeThiago.saldo);
		
		contaDeThiago.sacar(30);
		System.out.println("Seu novo saldo agora é: " + contaDeThiago.saldo);
		
		boolean conseguirRetirar = contaDeThiago.sacar(120);
		System.out.println("Seu novo saldo agora é: " + contaDeThiago.saldo);
		System.out.println(conseguirRetirar);
		
		Conta contaOrigem = new Conta();
		contaOrigem.deposita(1000);
		System.out.println("Conta Origem tem saldo no valor de: " + contaOrigem.saldo);
		
		boolean sucessoTransferencia = contaOrigem.transfere(3000, contaDeThiago); 
		
		if (sucessoTransferencia) {
			System.out.println("transferencia feita com sucesso!");
		} else {
			System.out.println("falta de saldo.");
		}
		
		System.out.println("Novo saldo da conta Origem é: " + contaOrigem.saldo);
		System.out.println("Novo saldo da conta de Thiago é: " + contaDeThiago.saldo);
		
		
	}
}
