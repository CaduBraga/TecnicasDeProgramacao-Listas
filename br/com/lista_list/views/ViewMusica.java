package br.com.lista_list.views;

import br.com.lista_list.model.Musica;
import java.util.Scanner;

public class ViewMusica extends Musica {
    public void preencherDados(Scanner scanner) {
        System.out.print("Título: ");
        setTitulo(scanner.nextLine());
        System.out.print("Artista: ");
        setArtista(scanner.nextLine());
        System.out.print("Duração (minutos): ");
        setDuracao(scanner.nextDouble());
        System.out.print("Preço: R$");
        setPreco(scanner.nextDouble());
        scanner.nextLine();
    }

    public void imprimirDados() {
        System.out.println("Informações da Música:");
        System.out.println("Título: " + getTitulo());
        System.out.println("Artista: " + getArtista());
        System.out.printf("Duração: %.2f minutos\n", getDuracao());
        System.out.printf("Preço: R$%.2f\n", getPreco());
    }
} 