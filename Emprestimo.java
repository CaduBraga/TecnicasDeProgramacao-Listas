import java.time.LocalDate;
public class Emprestimo {

	double valor;
	LocalDate dataDeEmprestimo;
	int numeroDeParcelas;

	public Emprestimo() {

		this.valor = 0.0;
		this.dataDeEmprestimo = null; // poderia usar LocalDate.MIN também
		this.numeroDeParcelas = 0;
	}
}