
public class TestaContaSemCliente {
 
	public static void main(String[] args) {
		Conta contaDaDaiana = new Conta();
		System.out.println(contaDaDaiana.getSaldo());
		
		contaDaDaiana.titular = new Cliente();
		System.out.println(contaDaDaiana.titular);
		
		contaDaDaiana.titular.nome = "Daiana Povoa";
		System.out.println(contaDaDaiana.titular.nome);
	}
}
