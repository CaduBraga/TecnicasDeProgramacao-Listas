public class ContaBancaria {
	int numeroDaConta;
	double saldo;

	public ContaBancaria(int numeroDaConta, double saldo) {

		this.numeroDaConta = numeroDaConta;
		this.saldo = saldo;
	}

	public void visualizarConta() {
		
		System.out.println("Número da Conta: " + numeroDaConta);
		System.out.println("Saldo: R$ " + String.format("%.2f", saldo));
		//Sei que ainda não aprendemos o String.format, mas descobri como usar e decidi implementá-lo no código
	}
}