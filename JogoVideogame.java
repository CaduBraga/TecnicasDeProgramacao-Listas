import java.util.Scanner;

public class JogoVideogame {
	private String titulo;
	private String plataforma;
	private String classificacao;
	private double preco;

	public JogoVideogame() {
		this.titulo = "";
		this.plataforma = "";
		this.classificacao = "";
		this.preco = 0.0;
	}

	public JogoVideogame(String titulo, String plataforma, String classificacao, double preco) {
		this.titulo = titulo;
		this.plataforma = plataforma;
		this.classificacao = classificacao;
		this.preco = preco;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}

	public String getClassificacao() {
		return classificacao;
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
		System.out.print("Plataforma: ");
		this.plataforma = scanner.nextLine();
		System.out.print("Classificação etária (anos): ");
		this.classificacao = scanner.nextLine();
		System.out.print("Preço: ");
		this.preco = scanner.nextDouble();
		scanner.nextLine();
	}

	public void imprimirDados() {
		System.out.println("Informações do Jogo:");
		System.out.println("Título: " + getTitulo());
		System.out.println("Plataforma: " + getPlataforma());
		System.out.println("Classificação Etária: " + getClassificacao() + " anos");
	}
}