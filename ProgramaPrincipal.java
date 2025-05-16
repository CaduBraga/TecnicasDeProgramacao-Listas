import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Computador> lista = new ArrayList<>();

        System.out.println("===== Bem-vindo ao Gerenciador de Computadores =====");

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Cadastrar um novo computador");
            System.out.println("2 - Deletar um computador");
            System.out.println("3 - Visualizar computadores cadastrados");
            System.out.println("4 - Encerrar o programa");

            System.out.print("Sua opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("\nDigite os dados do computador:");
                    Computador computador = new Computador();
                    computador.cadastrar(scanner);
                    lista.add(computador);
                    System.out.println("\nCadastro realizado com sucesso!");
                    break;

                case 2:
                    if (lista.isEmpty()) {
                        System.out.println("\nNão existe nenhum computador cadastrado no momento.");
                        
                    } else {
                        System.out.println("\nComputadores:");
                        int contador = 1;

                        for (Computador c : lista) {
                            System.out.println(contador + " - " + c.getNome());
                            contador++;
                        }

                        System.out.print("\nDigite o número do computador a ser deletado: ");
                        int numeroComputador = scanner.nextInt();
                        scanner.nextLine();

                        if (numeroComputador >= 1 && numeroComputador <= lista.size()) {
                            System.out.print("Tem certeza que deseja deletar esse computador? (sim/nao): ");
                            String confirmacao = scanner.nextLine();

                            if (confirmacao.equalsIgnoreCase("sim")) {
                                lista.remove(numeroComputador - 1);
                                System.out.println("\nComputador deletado com sucesso!");
                            } else {
                                System.out.println("\nOperação cancelada.");
                            }
                        } else {
                            System.out.println("\nNúmero inválido! Nenhum computador foi deletado.");
                        }
                    }
                    break;

                case 3:
                    if (lista.isEmpty()) {
                        System.out.println("\nNenhum computador cadastrado no momento.");

                    } else {
                        System.out.println("\nLista de computadores cadastrados:");
                        int contador = 1;

                        for (Computador c : lista) {
                            System.out.println(contador + "º computador:");
                            c.imprimir();
                            contador++;
                        }
                    }
                    break;

                case 4:
                    System.out.println("\nPrograma encerrado!");
                    System.out.println("Você cadastrou um total de " + lista.size() + " computador(es).");

                    scanner.close();
                    return;

                default:
                    System.out.println("Entrada inválida. Escolha uma das opções a seguir (1, 2, 3 ou 4).");
            }
        }
    }
}