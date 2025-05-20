package br.com.lista_list.views;

import br.com.lista_list.model.TelefoneCelular;
import java.util.Scanner;

public class ViewTelefone extends TelefoneCelular {
    public void preencherDados(Scanner scanner) {
        System.out.print("Marca: ");
        setMarca(scanner.nextLine());
        System.out.print("Modelo: ");
        setModelo(scanner.nextLine());
        System.out.print("Preço: R$");
        setPreco(scanner.nextDouble());
        System.out.print("Memória (GB): ");
        setMemoria(scanner.nextInt());
        scanner.nextLine();
    }

    public void imprimirDados() {
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.printf("Preço: R$%.2f\n", getPreco());
        System.out.println("Memória: " + getMemoria() + "GB");
    }
} 