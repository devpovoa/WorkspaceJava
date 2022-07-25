
public class TestaBanco {

	public static void main(String[] args) {
		//cria objeto cliente = Thiago.
		Cliente thiago = new Cliente();
		thiago.nome = "Thiago Povoa";
		thiago.cpf = "123.123.123-12";
		thiago.profissao = "Programador";
		
		//cria ojeto conta = Thiago.
		Conta contaDoThiago = new Conta();
		contaDoThiago.deposita(100);
		
		//composição ou associação de objetos.
		contaDoThiago.titular = thiago;
		
		System.out.println(contaDoThiago.titular.nome);
		System.out.println(thiago.nome);
	}
}
