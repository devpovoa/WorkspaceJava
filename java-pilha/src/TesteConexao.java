
public class TesteConexao {
	public static void main(String[] args) {
		
		try(Conexao conecta = new Conexao()){
			conecta.leDados();
		} catch(IllegalStateException e) {
			System.out.println("Erro na conexão");
		}
		
		/*
		Conexao networking = null;
		try {
			networking = new Conexao();
			networking.leDados();
		} catch (IllegalStateException e) {
			System.out.println("Erro na conexão");
		} finally {
			System.out.println("Fechou");
			if (networking != null) {
				networking.close();;
			}
		}
		*/
	}
}
