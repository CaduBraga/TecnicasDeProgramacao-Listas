import java.time.LocalDate;
public class Emprestimo {

	private double valor;
	private LocalDate dataDeEmprestimo;
	private int numeroDeParcelas;

	public Emprestimo() {
		this.valor = 0.0;
		this.dataDeEmprestimo = null;
		this.numeroDeParcelas = 0;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public LocalDate getDataDeEmprestimo() {
		return dataDeEmprestimo;
	}

	public void setDataDeEmprestimo(LocalDate dataDeEmprestimo) {
		this.dataDeEmprestimo = dataDeEmprestimo;
	}

	public int getNumeroDeParcelas() {
		return numeroDeParcelas;
	}

	public void setNumeroDeParcelas(int numeroDeParcelas) {
		this.numeroDeParcelas = numeroDeParcelas;
	}
}