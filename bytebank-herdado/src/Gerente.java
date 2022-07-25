
public class Gerente extends Funcionario implements Autenticavel {

	private FuncaoAutentica valida;
	
	public Gerente() {
		this.valida = new FuncaoAutentica();
	}

	public double getBonificacao() {
		return super.getSalario();
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
