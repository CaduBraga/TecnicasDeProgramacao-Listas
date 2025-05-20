package br.com.lista_list.views;

import br.com.lista_list.model.Filme;
import java.util.Scanner;

public class ViewFilme extends Filme {
    public void preencherDados(Scanner scanner) {
        System.out.print("Título: ");
        setTitulo(scanner.nextLine());
        System.out.print("Diretor: ");
        setDiretor(scanner.nextLine());
        System.out.print("Duração (minutos): ");
        setDuracao(scanner.nextInt());
        System.out.print("Preço: R$");
        setPreco(scanner.nextDouble());
        scanner.nextLine();
    }

    public void imprimirDados() {
        System.out.println("Informações do Filme:");
        System.out.println("Título: " + getTitulo());
        System.out.println("Diretor: " + getDiretor());
        System.out.println("Duração: " + getDuracao() + " minutos");
        System.out.printf("Preço: R$%.2f\n", getPreco());
    }
} 