import java.util.Scanner;

public class Filme {
	private String titulo;
	private String diretor;
	private int duracao;
	private double preco;

	public Filme() {
		this.titulo = "";
		this.diretor = "";
		this.duracao = 0;
		this.preco = 0.0;
	}

	public Filme(String titulo, String diretor, int duracao, double preco) {
		this.titulo = titulo;
		this.diretor = diretor;
		this.duracao = duracao;
		this.preco = preco;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	public String getDiretor() {
		return diretor;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getPreco() {
		return preco;
	}

	public void preencherDados(Scanner scanner) {
		System.out.print("Título: ");
		this.titulo = scanner.nextLine();
		System.out.print("Diretor: ");
		this.diretor = scanner.nextLine();
		System.out.print("Duração (minutos): ");
		this.duracao = scanner.nextInt();
		System.out.print("Preço: R$");
		this.preco = scanner.nextDouble();
		scanner.nextLine();
	}

	public void imprimirDados() {
		System.out.println("Informações do Filme:");
		System.out.println("Título: " + getTitulo());
		System.out.println("Diretor: " + getDiretor());
		System.out.println("Duração: " + getDuracao() + " minutos");
		System.out.printf("Preço: R$%.2f\n", getPreco());
	}
}