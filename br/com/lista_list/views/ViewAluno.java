package br.com.lista_list.views;

import java.util.Scanner;

import br.com.lista_list.model.Aluno;

public class ViewAluno extends Aluno{
    
    public void preencherDados(Scanner scanner) {
        System.out.print("Nome: ");
        setNome(scanner.nextLine());
        System.out.print("Idade (anos): ");
        setIdade(scanner.nextInt());
        System.out.print("Matrícula: ");
        setMatricula(scanner.nextLine());
        System.out.print("Ano de ingresso: ");
        setAnoIngresso(scanner.nextInt());
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