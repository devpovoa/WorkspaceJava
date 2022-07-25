class Conta {

	private Cliente titular;
	private int agencia;
	private int numeroDaConta;
	private double saldo;
	private static int total = 0;

	public Conta(int agencia, int numeroDaConta) {
		Conta.total++;
		
		if (agencia <= 0) {
			System.out.println("Valor menor ou igual a zero não é permitido");
			return;
		}
		this.agencia = agencia;

		if (numeroDaConta <= 0) {
			System.out.println("Valor menor ou igual a zero não é permitido");
			return;
		}
		this.numeroDaConta = numeroDaConta;

	}

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

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumeroDaConta() {
		return this.numeroDaConta;
	}

	//public void setNumeroDaConta(int numeroDaConta) {}

	public int getAgencia() {
		return this.agencia;
	}

	//public void setAgencia(int agencia) {}

	public Cliente getTitular() {
		return this.titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
}