package br.com.lista_list.views;

import br.com.lista_list.model.TV;
import java.util.Scanner;

public class ViewTV extends TV {
    public void preencherDados(Scanner scanner) {
        System.out.print("Marca: ");
        setMarca(scanner.nextLine());
        System.out.print("Tamanho (polegadas): ");
        setTamanho(scanner.nextDouble());
        scanner.nextLine();
        System.out.print("Resolução (pixels): ");
        setResolucao(scanner.nextLine());
        System.out.print("Preço: R$");
        setPreco(scanner.nextDouble());
        scanner.nextLine();
    }

    public void imprimirDados() {
        System.out.println("Marca: " + getMarca());
        System.out.println("Tamanho: " + getTamanho() + " polegadas");
        System.out.println("Resolução: " + getResolucao() + " pixels");
        System.out.printf("Preço: R$%.2f\n", getPreco());
    }
} 