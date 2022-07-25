
public class Administrador extends Funcionario implements Autenticavel {

	private FuncaoAutentica valida;

	public Administrador() {
		this.valida = new FuncaoAutentica();
	}

	@Override
	public double getBonificacao() {
		return 50;
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
