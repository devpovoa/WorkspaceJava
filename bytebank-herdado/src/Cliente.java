
public class Cliente implements Autenticavel {

	private FuncaoAutentica valida;

	public Cliente() {
		this.valida = new FuncaoAutentica();
	}

	@Override
	public void setSenha(int senha) {
		this.valida.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.valida.autentica(senha);
	}
}
