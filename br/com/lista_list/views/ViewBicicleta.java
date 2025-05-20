package br.com.lista_list.views;

import br.com.lista_list.model.Bicicleta;
import java.util.Scanner;

public class ViewBicicleta extends Bicicleta {
    public void preencherDados(Scanner scanner) {
        System.out.print("Marca: ");
        setMarca(scanner.nextLine());
        System.out.print("Modelo: ");
        setModelo(scanner.nextLine());
        System.out.print("Tamanho do quadro: ");
        setTamanho(scanner.nextDouble());
        System.out.print("Preço: ");
        setPreco(scanner.nextDouble());
        scanner.nextLine();
    }

    public void imprimirDados() {
        System.out.println("Informações da Bicicleta:");
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Tamanho do quadro: " + getTamanho());
        System.out.printf("Preço: R$%.2f\n", getPreco());
    }
} 