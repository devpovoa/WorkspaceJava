/**
 * 
 * @author devpovoa
 *
 */
public class TestaGerente {

	public static void main(String[] args) {

		java.util.Scanner input = new java.util.Scanner(System.in);

		Gerente novoGerente = new Gerente();

		System.out.print("Por gentileza, informe seu nome:");
		String nome = input.nextLine();

		System.out.printf("%s, por favor, informe seu CPF:", nome);
		String cpf = input.nextLine();

		System.out.print("Informe sua senha de acesso: \n");
		int autenticaSenha = input.nextInt();
		novoGerente.setSenha(autenticaSenha);

		boolean verifica = novoGerente.autentica(autenticaSenha);

		novoGerente.setNome(nome);
		novoGerente.setSalario(6000.00);
		novoGerente.setCpf(cpf);

		System.out.printf("Olá %s, portador do CPF de número %s. %n", novoGerente.getNome(), novoGerente.getCpf());
		System.out.println("De acordo com nossa regra de negócio, "
				+ "todo Gerente tem direito ao salário bruto com a bonificação.");
		System.out.printf("Seu salário é de $%.2f.%n", novoGerente.getBonificacao());
		System.out.println(verifica);

		input.close();
	}
}
