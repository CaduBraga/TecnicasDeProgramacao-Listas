package br.com.lista_list.model;

import java.util.Scanner;

public class TV {
	private static String marca;
	private static double tamanho;
	private static String resolucao;
	private static double preco;

	public TV() {
		TV.marca = "";
		TV.tamanho = 0.0;
		TV.resolucao = "";
		TV.preco = 0.0;
	}

	public TV(String marca, double tamanho, String resolucao, double preco) {
		TV.marca = marca;
		TV.tamanho = tamanho;
		TV.resolucao = resolucao;
		TV.preco = preco;
	}

	public void setMarca(String marca) {
		TV.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	public void setTamanho(double tamanho) {
		TV.tamanho = tamanho;
	}

	public double getTamanho() {
		return tamanho;
	}

	public void setResolucao(String resolucao) {
		TV.resolucao = resolucao;
	}

	public String getResolucao() {
		return resolucao;
	}

	public void setPreco(double preco) {
		TV.preco = preco;
	}

	public double getPreco() {
		return preco;
	}

	public void preencherDados(Scanner scanner) {
		System.out.print("Marca: ");
		TV.marca = scanner.nextLine();
		System.out.print("Tamanho (polegadas): ");
		TV.tamanho = scanner.nextDouble();
		scanner.nextLine();
		System.out.print("Resolução (pixels): ");
		TV.resolucao = scanner.nextLine();
		System.out.print("Preço: R$");
		TV.preco = scanner.nextDouble();
		scanner.nextLine();
	}

	public void imprimirDados() {
		System.out.println("Marca: " + getMarca());
		System.out.println("Tamanho: " + getTamanho() + " polegadas");
		System.out.println("Resolução: " + getResolucao() + " pixels");
		System.out.printf("Preço: R$%.2f\n", getPreco());
	}
}