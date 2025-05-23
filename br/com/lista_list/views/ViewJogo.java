package br.com.lista_list.views;

import br.com.lista_list.model.JogoVideogame;
import java.util.Scanner;

public class ViewJogo extends JogoVideogame {
    public void preencherDados(Scanner scanner) {
        System.out.print("Título: ");
        setTitulo(scanner.nextLine());
        System.out.print("Plataforma: ");
        setPlataforma(scanner.nextLine());
        System.out.print("Classificação etária (anos): ");
        setClassificacao(scanner.nextLine());
        System.out.print("Preço: ");
        setPreco(scanner.nextDouble());
        scanner.nextLine();
    }

    public void imprimirDados() {
        System.out.println("Informações do Jogo:");
        System.out.println("Título: " + getTitulo());
        System.out.println("Plataforma: " + getPlataforma());
        System.out.println("Classificação Etária: " + getClassificacao() + " anos");
        System.out.printf("Preço: R$%.2f\n", getPreco());
    }
} 