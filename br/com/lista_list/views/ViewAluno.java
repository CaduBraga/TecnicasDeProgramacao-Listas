public class ViewAluno {
    
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