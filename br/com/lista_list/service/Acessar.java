package br.com.lista_list.service;

import java.util.List;
import java.util.Scanner;

import br.com.lista_list.model.*;
import br.com.lista_list.views.*;

public class Acessar {

    public static void acessarLista(Scanner scanner, List<TelefoneCelular> telefoneCelular, List<TV> televisao,
            List<Casa> casa, List<Aluno> aluno, List<Livro> livro, List<AnimalDeEstimacao> animal,
            List<Bicicleta> bicicleta,
            List<Filme> filme, List<Musica> musica, List<JogoVideogame> jogo, List<BolsaDeValores> bolsa) {

        Escolhas.escolherLista();
        int acessarOpcao = scanner.nextInt();
        scanner.nextLine();
        int indice;

        switch (acessarOpcao) {
            case 1:
                if (telefoneCelular == null || telefoneCelular.isEmpty()) {
                    System.out.println("A lista está vazia.");
                } else {
                    System.out.println("Itens disponíveis:");
                    for (int i = 0; i < telefoneCelular.size(); i++) {
                        System.out.println((i + 1) + " - " + telefoneCelular.get(i).getModelo());
                    }

                    System.out.print("Digite o número do item que deseja acessar: ");
                    indice = scanner.nextInt() - 1;
                    scanner.nextLine();

                    if (indice >= 0 && indice < telefoneCelular.size()) {
                        ((ViewTelefone) telefoneCelular.get(indice)).imprimirDados();
                    } else {
                        System.out.println("Índice inválido.");
                    }
                }
                break;
            case 2:
                if (televisao == null || televisao.isEmpty()) {
                    System.out.println("A lista está vazia.");
                } else if (televisao != null) {
                    System.out.println("Itens disponíveis:");
                    for (int i = 0; i < televisao.size(); i++) {
                        System.out.println((i + 1) + " - " + televisao.get(i).getMarca());

                        System.out.print("Digite o número do item que deseja acessar: ");
                        indice = scanner.nextInt() - 1;
                        scanner.nextLine();

                        if (indice >= 0 && indice < televisao.size()) {
                            ((ViewTV) televisao.get(indice)).imprimirDados();
                        } else {
                            System.out.println("Índice inválido.");
                        }
                    }
                }
                break;
            case 3:
                if (casa == null || casa.isEmpty()) {
                    System.out.println("A lista está vazia.");
                } else if (casa != null) {
                    System.out.println("Itens disponíveis:");
                    for (int i = 0; i < casa.size(); i++) {
                        System.out.println((i + 1) + " - " + casa.get(i).getEndereco());

                        System.out.print("Digite o número do item que deseja acessar: ");
                        indice = scanner.nextInt() - 1;
                        scanner.nextLine();

                        if (indice >= 0 && indice < casa.size()) {
                            ((ViewCasa) casa.get(indice)).imprimirDados();
                        } else {
                            System.out.println("Índice inválido.");
                        }
                    }
                }
                break;
            case 4:
                if (aluno == null || aluno.isEmpty()) {
                    System.out.println("A lista está vazia.");
                } else if (aluno != null) {
                    System.out.println("Itens disponíveis:");
                    for (int i = 0; i < aluno.size(); i++) {
                        System.out.println((i + 1) + " - " + aluno.get(i).getNome());

                        System.out.print("Digite o número do item que deseja acessar: ");
                        indice = scanner.nextInt() - 1;
                        scanner.nextLine();

                        if (indice >= 0 && indice < aluno.size()) {
                            ((ViewAluno) aluno.get(indice)).imprimirDados();
                        } else {
                            System.out.println("Índice inválido.");
                        }
                    }
                }
                break;
            case 5:
                if (livro == null || livro.isEmpty()) {
                    System.out.println("A lista está vazia.");
                } else if (livro != null) {
                    System.out.println("Itens disponíveis:");
                    for (int i = 0; i < livro.size(); i++) {
                        System.out.println((i + 1) + " - " + livro.get(i).getTitulo());

                        System.out.print("Digite o número do item que deseja acessar: ");
                        indice = scanner.nextInt() - 1;
                        scanner.nextLine();

                        if (indice >= 0 && indice < livro.size()) {
                            ((ViewLivro) livro.get(indice)).imprimirDados();
                        } else {
                            System.out.println("Índice inválido.");
                        }
                    }
                }
                break;
            case 6:
                if (animal == null || animal.isEmpty()) {
                    System.out.println("A lista está vazia.");
                } else if (animal != null) {
                    System.out.println("Itens disponíveis:");
                    for (int i = 0; i < animal.size(); i++) {
                        System.out.println((i + 1) + " - " + animal.get(i).getEspecie());

                        System.out.print("Digite o número do item que deseja acessar: ");
                        indice = scanner.nextInt() - 1;
                        scanner.nextLine();

                        if (indice >= 0 && indice < animal.size()) {
                            ((ViewAnimal) animal.get(indice)).imprimirDados();
                        } else {
                            System.out.println("Índice inválido.");
                        }
                    }
                }
                break;
            case 7:
                if (bicicleta == null || bicicleta.isEmpty()) {
                    System.out.println("A lista está vazia.");
                } else if (bicicleta != null) {
                    System.out.println("Itens disponíveis:");
                    for (int i = 0; i < bicicleta.size(); i++) {
                        System.out.println((i + 1) + " - " + bicicleta.get(i).getModelo());

                        System.out.print("Digite o número do item que deseja acessar: ");
                        indice = scanner.nextInt() - 1;
                        scanner.nextLine();

                        if (indice >= 0 && indice < bicicleta.size()) {
                            ((ViewBicicleta) bicicleta.get(indice)).imprimirDados();
                        } else {
                            System.out.println("Índice inválido.");
                        }
                    }
                }
                break;
            case 8:
                if (filme == null || filme.isEmpty()) {
                    System.out.println("A lista está vazia.");
                } else if (filme != null) {
                    System.out.println("Itens disponíveis:");
                    for (int i = 0; i < filme.size(); i++) {
                        System.out.println((i + 1) + " - " + filme.get(i).getTitulo());

                        System.out.print("Digite o número do item que deseja acessar: ");
                        indice = scanner.nextInt() - 1;
                        scanner.nextLine();

                        if (indice >= 0 && indice < filme.size()) {
                            ((ViewFilme) filme.get(indice)).imprimirDados();
                        } else {
                            System.out.println("Índice inválido.");
                        }
                    }
                }
                break;
            case 9:
                if (musica == null || musica.isEmpty()) {
                    System.out.println("A lista está vazia.");
                } else if (musica != null) {
                    System.out.println("Itens disponíveis:");
                    for (int i = 0; i < musica.size(); i++) {
                        System.out.println((i + 1) + " - " + musica.get(i).getTitulo());

                        System.out.print("Digite o número do item que deseja acessar: ");
                        indice = scanner.nextInt() - 1;
                        scanner.nextLine();

                        if (indice >= 0 && indice < musica.size()) {
                            ((ViewMusica) musica.get(indice)).imprimirDados();
                        } else {
                            System.out.println("Índice inválido.");
                        }
                    }
                }
                break;
            case 10:
                if (jogo == null || jogo.isEmpty()) {
                    System.out.println("A lista está vazia.");
                } else if (jogo != null) {
                    System.out.println("Itens disponíveis:");
                    for (int i = 0; i < jogo.size(); i++) {
                        System.out.println((i + 1) + " - " + jogo.get(i).getTitulo());

                        System.out.print("Digite o número do item que deseja acessar: ");
                        indice = scanner.nextInt() - 1;
                        scanner.nextLine();

                        if (indice >= 0 && indice < jogo.size()) {
                            ((ViewJogo) jogo.get(indice)).imprimirDados();
                        } else {
                            System.out.println("Índice inválido.");
                        }
                    }
                }
                break;
            case 11:
                if (bolsa == null || bolsa.isEmpty()) {
                    System.out.println("A lista está vazia.");
                } else if (bolsa != null) {
                    System.out.println("Itens disponíveis:");
                    for (int i = 0; i < bolsa.size(); i++) {
                        System.out.println((i + 1) + " - " + bolsa.get(i).getNome());

                        System.out.print("Digite o número do item que deseja acessar: ");
                        indice = scanner.nextInt() - 1;
                        scanner.nextLine();

                        if (indice >= 0 && indice < bolsa.size()) {
                            ((ViewBolsa) bolsa.get(indice)).imprimirDados();
                        } else {
                            System.out.println("Índice inválido.");
                        }
                    }
                }
                break;
        }
    }
}