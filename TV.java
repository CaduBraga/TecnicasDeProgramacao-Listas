import java.util.Scanner;

public class TV {
	private String marca;
	private double tamanho;
	private String resolucao;
	private double preco;

	public TV() {
		this.marca = "";
		this.tamanho = 0.0;
		this.resolucao = "";
		this.preco = 0.0;
	}

	public TV(String marca, double tamanho, String resolucao, double preco) {
		this.marca = marca;
		this.tamanho = tamanho;
		this.resolucao = resolucao;
		this.preco = preco;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}

	public double getTamanho() {
		return tamanho;
	}

	public void setResolucao(String resolucao) {
		this.resolucao = resolucao;
	}

	public String getResolucao() {
		return resolucao;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getPreco() {
		return preco;
	}

	public void preencherDados(Scanner scanner) {
		System.out.print("Marca: ");
		this.marca = scanner.nextLine();
		System.out.print("Tamanho (polegadas): ");
		this.tamanho = scanner.nextDouble();
		scanner.nextLine();
		System.out.print("Resolução (pixels): ");
		this.resolucao = scanner.nextLine();
		System.out.print("Preço: R$");
		this.preco = scanner.nextDouble();
		scanner.nextLine();
	}

	public void imprimirDados() {
		System.out.println("Marca: " + getMarca());
		System.out.println("Tamanho: " + getTamanho() + " polegadas");
		System.out.println("Resolução: " + getResolucao() + " pixels");
		System.out.printf("Preço: R$%.2f\n", getPreco());
	}
}