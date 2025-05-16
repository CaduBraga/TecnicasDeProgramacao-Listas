import java.util.Scanner;

public class Musica {
	private String titulo;
	private String artista;
	private double duracao;
	private double preco;

	public Musica() {
		this.titulo = "";
		this.artista = "";
		this.duracao = 0.0;
		this.preco = 0.0;
	}

	public Musica(String titulo, String artista, double duracao, double preco) {
		this.titulo = titulo;
		this.artista = artista;
		this.duracao = duracao;
		this.preco = preco;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getArtista() {
		return artista;
	}

	public void setDuracao(double duracao) {
		this.duracao = duracao;
	}

	public double getDuracao() {
		return duracao;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getPreco() {
		return preco;
	}

	public void tocarMusica() {
		System.out.println("Tocando música: " + titulo + " - " + artista);
	}

	public void desligarMusica() {
		System.out.println("Música desligada.");
	}

	public void preencherDados(Scanner scanner) {
		System.out.print("Título: ");
		this.titulo = scanner.nextLine();
		System.out.print("Artista: ");
		this.artista = scanner.nextLine();
		System.out.print("Duração (minutos): ");
		this.duracao = scanner.nextDouble();
		System.out.print("Preço: R$");
		this.preco = scanner.nextDouble();
		scanner.nextLine();
	}

	public void imprimirDados() {
		System.out.println("Informações da Música:");
		System.out.println("Título: " + getTitulo());
		System.out.println("Artista: " + getArtista());
		System.out.printf("Duração: %.2f minutos\n", getDuracao());
		System.out.printf("Preço: R$%.2f\n", getPreco());
	}
}