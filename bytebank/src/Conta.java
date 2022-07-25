class Conta {
	int agencia;
	int numeroDaConta;
	String titular;
	double saldo;

	void deposita(double valor) {
		this.saldo += valor;
	}

	public boolean sacar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			sacar(valor);
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}

	}
}