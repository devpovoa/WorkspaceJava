/**
 * 
 * @author devpovoa
 *
 */
public class TesteFuncionario {

	public static void main(String[] args) {
		
		java.util.Scanner input = new java.util.Scanner(System.in);

		Gerente novoFuncionario = new Gerente();
		
		System.out.print("Por gentileza, informe seu nome:");
		String nome = input.nextLine();
		
		System.out.printf("%s, por favor, informe seu CPF:", nome);
		String cpf = input.nextLine();

		novoFuncionario.setNome(nome);
		novoFuncionario.setSalario(1212.00);
		novoFuncionario.setCpf(cpf);

		System.out.printf("Olá %s, portador do CPF de número %s. %n", novoFuncionario.getNome(),
				novoFuncionario.getCpf());
		System.out.println("De acordo com nossa regra de negócio, "
				+ "todo funcionário tem direito a 10% de bonificação sobre o salário.");
		System.out.printf("Sua gratificação é de $%.2f.", novoFuncionario.getBonificacao());
		
		input.close();
	}
}
