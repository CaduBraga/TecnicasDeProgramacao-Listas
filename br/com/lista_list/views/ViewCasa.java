package br.com.lista_list.views;

import br.com.lista_list.model.Casa;
import java.util.Scanner;

public class ViewCasa extends Casa {
    public void preencherDados(Scanner scanner) {
        System.out.print("Endereço: ");
        setEndereco(scanner.nextLine());
        System.out.print("Área (m²): ");
        setArea(scanner.nextDouble());
        System.out.print("Número de quartos: ");
        setQuartos(scanner.nextInt());
        System.out.print("Preço: R$");
        setPreco(scanner.nextDouble());
        scanner.nextLine();
    }

    public void imprimirDados() {
        System.out.println("Informações da Casa:");
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Área: " + getArea() + " m²");
        System.out.println("Número de quartos: " + getQuartos());
        System.out.printf("Preço: R$%.2f\n", getPreco());
    }
} 