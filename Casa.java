import java.util.Scanner;

public class Casa {
	private String endereco;
	private double area;
	private int quartos;
	private double preco;

	public Casa() {
		this.endereco = "";
		this.area = 0.0;
		this.quartos = 0;
		this.preco = 0.0;
	}

	public Casa(String endereco, double area, int quartos, double preco) {
		this.endereco = endereco;
		this.area = area;
		this.quartos = quartos;
		this.preco = preco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getArea() {
		return area;
	}

	public void setQuartos(int quartos) {
		this.quartos = quartos;
	}

	public int getQuartos() {
		return quartos;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getPreco() {
		return preco;
	}

	public void preencherDados(Scanner scanner) {
		System.out.print("Endereço: ");
		this.endereco = scanner.nextLine();
		System.out.print("Área (m²): ");
		this.area = scanner.nextDouble();
		System.out.print("Número de quartos: ");
		this.quartos = scanner.nextInt();
		System.out.print("Preço: R$");
		this.preco = scanner.nextDouble();
		scanner.nextLine();
	}

	public void imprimirDados() {
		System.out.println("Informações da Casa:");
		System.out.println("Endereço: " + getEndereco());
		System.out.println("Área: " + getArea() + " m²");
		System.out.println("Número de quartos: " + getQuartos());
		System.out.printf("Preço: R$%.2f\n", getPreco());
	}
}