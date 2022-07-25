
public class ControleBonificacao {

	private double calculo;

	public void registra(Funcionario f) {
		double bonifica = f.getBonificacao();
		this.calculo += bonifica;
	}

	public double getSoma() {
		return this.calculo;
	}
}
