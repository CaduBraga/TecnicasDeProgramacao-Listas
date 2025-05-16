import java.util.Scanner;

public class Aluno {
	private String nome;
	private int idade;
	private String matricula;
	private int anoIngresso;

	public Aluno() {
		this.nome = "";
		this.idade = 0;
		this.matricula = "";
		this.anoIngresso = 0;
	}

	public Aluno(String nome, int idade, String matricula, int anoIngresso) {
		this.nome = nome;
		this.idade = idade;
		this.matricula = matricula;
		this.anoIngresso = anoIngresso;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getIdade() {
		return idade;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setAnoIngresso(int anoIngresso) {
		this.anoIngresso = anoIngresso;
	}

	public int getAnoIngresso() {
		return anoIngresso;
	}

	public void preencherDados(Scanner scanner) {
		System.out.print("Nome: ");
		this.nome = scanner.nextLine();
		System.out.print("Idade (anos): ");
		this.idade = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Matrícula: ");
		this.matricula = scanner.nextLine();
		System.out.print("Ano de ingresso: ");
		this.anoIngresso = scanner.nextInt();
		scanner.nextLine();
	}

	public void imprimirDados() {
		System.out.println("Informações do Aluno:");
		System.out.println("Nome: " + getNome());
		System.out.println("Idade: " + getIdade() + " anos");
		System.out.println("Matrícula: " + getMatricula());
		System.out.println("Ano de Ingresso: " + getAnoIngresso());
	}
}