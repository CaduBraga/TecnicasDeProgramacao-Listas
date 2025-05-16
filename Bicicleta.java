import java.util.Scanner;

public class Bicicleta {
	private String marca;
	private String modelo;
	private double tamanho;
	private double preco;

	public Bicicleta() {
		this.marca = "";
		this.modelo = "";
		this.tamanho = 0.0;
		this.preco = 0.0;
	}

	public Bicicleta(String marca, String modelo, double tamanho, double preco) {
		this.marca = marca;
		this.modelo = modelo;
		this.tamanho = tamanho;
		this.preco = preco;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}

	public double getTamanho() {
		return tamanho;
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
		System.out.print("Modelo: ");
		this.modelo = scanner.nextLine();
		System.out.print("Tamanho do quadro: ");
		this.tamanho = scanner.nextDouble();
		System.out.print("Preço: ");
		this.preco = scanner.nextDouble();
		scanner.nextLine();
	}

	public void imprimirDados() {
		System.out.println("Informações da Bicicleta:");
		System.out.println("Marca: " + getMarca());
		System.out.println("Modelo: " + getModelo());
		System.out.println("Tamanho do quadro: " + getTamanho());
		System.out.printf("Preço: R$%.2f\n", getPreco());
	}
}