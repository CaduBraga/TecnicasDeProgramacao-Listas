import java.util.Scanner;

public class Livro {
	private String titulo;
	private String autor;
	private int paginas;
	private double preco;

	public Livro() {
		this.titulo = "";
		this.autor = "";
		this.paginas = 0;
		this.preco = 0.0;
	}

	public Livro(String titulo, String autor, int paginas, double preco) {
		this.titulo = titulo;
		this.autor = autor;
		this.paginas = paginas;
		this.preco = preco;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getAutor() {
		return autor;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	public int getPaginas() {
		return paginas;
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
		System.out.print("Autor: ");
		this.autor = scanner.nextLine();
		System.out.print("Número de páginas: ");
		this.paginas = scanner.nextInt();
		System.out.print("Preço: R$");
		this.preco = scanner.nextDouble();
		scanner.nextLine();
	}

	public void imprimirDados() {
		System.out.println("Informações do Livro:");
		System.out.println("Título: " + getTitulo());
		System.out.println("Autor: " + getAutor());
		System.out.println("Número de páginas: " + getPaginas());
		System.out.printf("Preço: R$%.2f\n", getPreco());
	}
}