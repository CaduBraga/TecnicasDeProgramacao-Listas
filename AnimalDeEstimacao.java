import java.util.Scanner;

public class AnimalDeEstimacao {
	private String especie;
	private String raca;
	private int idade;
	private double peso;

	public AnimalDeEstimacao() {
		this.especie = "";
		this.raca = "";
		this.idade = 0;
		this.peso = 0.0;
	}

	public AnimalDeEstimacao(String especie, String raca, int idade, double peso) {
		this.especie = especie;
		this.raca = raca;
		this.idade = idade;
		this.peso = peso;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getEspecie() {
		return especie;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getRaca() {
		return raca;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getIdade() {
		return idade;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getPeso() {
		return peso;
	}

	public void preencherDados(Scanner scanner) {
		System.out.print("Espécie: ");
		this.especie = scanner.nextLine();
		System.out.print("Raça: ");
		this.raca = scanner.nextLine();
		System.out.print("Idade (anos): ");
		this.idade = scanner.nextInt();
		System.out.print("Peso (kg): ");
		this.peso = scanner.nextDouble();
		scanner.nextLine();
	}

	public void imprimirDados() {
		System.out.println("Informações do Animal de estimação:");
		System.out.println("Espécie: " + getEspecie());
		System.out.println("Raça: " + getRaca());
		System.out.println("Idade: " + getIdade() + " anos");
		System.out.printf("Peso: %.2fkg\n", getPeso());
	}
}