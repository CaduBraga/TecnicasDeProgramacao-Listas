public class ContaBancaria {
	private int numeroDaConta;
	private double saldo;

	public ContaBancaria() {
		this.numeroDaConta = 0;
		this.saldo = 0.0;
	}

	public int getNumeroDaConta() {
		return numeroDaConta;
	}

	public void setNumeroDaConta(int numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}