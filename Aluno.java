public class Aluno {

	String nome;
	int matricula;
	double notaFinal;

	public Aluno(String nome, int matricula, double notaFinal) {

		this.nome = nome;
		this.matricula = matricula;
		this.notaFinal = notaFinal;
	}
	
	public void visualizarAluno() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nota Final: " + String.format("%.2f", notaFinal));
      //Sei que ainda não aprendemos o String.format, mas descobri como usar e decidi implementá-lo no código
    }
}