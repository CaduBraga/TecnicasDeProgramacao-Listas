package br.com.lista_list.views;

import br.com.lista_list.model.BolsaDeValores;
import java.util.Scanner;

public class ViewBolsa extends BolsaDeValores {
    public void preencherDados(Scanner scanner) {
        System.out.print("Nome da Empresa: ");
        setNome(scanner.nextLine());
        System.out.print("Preço da ação: R$");
        setPreco(scanner.nextDouble());
        System.out.print("Volume de Negociações: ");
        setVolume(scanner.nextDouble());
        System.out.print("Variação Diária (%): ");
        setVariacao(scanner.nextDouble());
        scanner.nextLine();
    }

    public void imprimirDados() {
        System.out.println("Informações da Bolsa de Valores:");
        System.out.println("Nome da Empresa: " + getNome());
        System.out.printf("Preço da ação: R$%.2f\n", getPreco());
        System.out.println("Volume de Negociações: " + getVolume());
        System.out.println("Variação Diária: " + getVariacao() + "%");
    }
} 