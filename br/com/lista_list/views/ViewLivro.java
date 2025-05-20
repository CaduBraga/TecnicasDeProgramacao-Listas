package br.com.lista_list.views;

import br.com.lista_list.model.Livro;
import java.util.Scanner;

public class ViewLivro extends Livro {
    public void preencherDados(Scanner scanner) {
        System.out.print("Título: ");
        setTitulo(scanner.nextLine());
        System.out.print("Autor: ");
        setAutor(scanner.nextLine());
        System.out.print("Número de páginas: ");
        setPaginas(scanner.nextInt());
        System.out.print("Preço: R$");
        setPreco(scanner.nextDouble());
        scanner.nextLine();
    }

    public void imprimirDados() {
        System.out.println("Informações do Livro:");
        System.out.println("Título: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Número de páginas: " + getPaginas());
        System.out.printf("Preço: R$%.2f\n", getPreco());
    }
} 