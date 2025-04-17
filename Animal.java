public class Animal {

	String nome;
	String raca;
	int idade;

	public Animal(String nome, String raca, int idade) {

		this.nome = nome;
		this.raca = raca;
		this.idade = idade;
	}

	public void visualizarAnimal() {

		System.out.println("Nome: " + nome);
		System.out.println("Raça: " + raca);
		System.out.println("Idade: " + idade + " anos");
	}
}