package br.com.lista_list.views;

import br.com.lista_list.model.AnimalDeEstimacao;
import java.util.Scanner;

public class ViewAnimal extends AnimalDeEstimacao {
    public void preencherDados(Scanner scanner) {
        System.out.print("Espécie: ");
        setEspecie(scanner.nextLine());
        System.out.print("Raça: ");
        setRaca(scanner.nextLine());
        System.out.print("Idade (anos): ");
        setIdade(scanner.nextInt());
        System.out.print("Peso (kg): ");
        setPeso(scanner.nextDouble());
        scanner.nextLine();
    }

    public void imprimirDados() {
        System.out.println("Informações do Animal de Estimação:");
        System.out.println("Espécie: " + getEspecie());
        System.out.println("Raça: " + getRaca());
        System.out.println("Idade: " + getIdade() + " anos");
        System.out.printf("Peso: %.2fkg\n", getPeso());
    }
} 