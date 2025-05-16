import java.util.Scanner;

public class TelefoneCelular {
	private String marca;
	private String modelo;
	private double preco;
	private int memoria;

	public TelefoneCelular() {
		this.marca = "";
		this.modelo = "";
		this.preco = 0.0;
		this.memoria = 0;
	}

	public TelefoneCelular(String marca, String modelo, double preco, int memoria) {
		this.marca = marca;
		this.modelo = modelo;
		this.preco = preco;
		this.memoria = memoria;
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

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getPreco() {
		return preco;
	}

	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}

	public int getMemoria() {
		return memoria;
	}

	public void preencherDados(Scanner scanner) {
		System.out.print("Marca: ");
		this.marca = scanner.nextLine();
		System.out.print("Modelo: ");
		this.modelo = scanner.nextLine();
		System.out.print("Preço: R$");
		this.preco = scanner.nextDouble();
		System.out.print("Memória (GB): ");
		this.memoria = scanner.nextInt();
		scanner.nextLine();
	}

	public void imprimirDados() {
		System.out.println("Marca: " + getMarca());
		System.out.println("Modelo: " + getModelo());
		System.out.printf("Preço: R$%.2f\n", getPreco());
		System.out.println("Memória: " + getMemoria() + "GB");
	}
}