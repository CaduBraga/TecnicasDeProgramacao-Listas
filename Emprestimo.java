import java.time.LocalDate;
public class Emprestimo {

	double valor;
	LocalDate dataDeEmprestimo;
	int numeroDeParcelas;

	public Emprestimo(double valor, LocalDate dataDeEmprestimo, int numeroDeParcelas) {

		this.valor = valor;
		this.dataDeEmprestimo = dataDeEmprestimo;
		this.numeroDeParcelas = numeroDeParcelas;
	}

	public void visualizarEmprestimo() {
		
		System.out.println("Valor: R$" + String.format("%.2f", valor));
		//Sei que ainda não aprendemos o String.format, mas descobri como usar e decidi implementá-lo no código
		System.out.println("Data do Empréstimo: " + dataDeEmprestimo);
		System.out.println("Número de Parcelas: " + numeroDeParcelas);
	}
}