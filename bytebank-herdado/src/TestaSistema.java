
public class TestaSistema {

	public static void main(String[] args) {
		Autenticavel novoGe = new Gerente();
		novoGe.setSenha(2222);

		Autenticavel novoAd = new Administrador();
		novoAd.setSenha(3333);
		
		Autenticavel novoCl = new Cliente();
		novoCl.setSenha(2222);

		SistemaInterno si = new SistemaInterno();
		si.autentica(novoGe);
		si.autentica(novoAd);
		si.autentica(novoCl);
	}

}
