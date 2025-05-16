import java.util.Scanner;

public class Computador {
    private String nome;
    private double preco;
    private int quantidade;

    public Computador() {
    }

    public Computador(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void cadastrar(Scanner scanner) {
        System.out.print("Nome: ");
        this.nome = scanner.nextLine();

        System.out.print("Preço: ");
        this.preco = scanner.nextDouble();

        System.out.print("Quantidade: ");
        this.quantidade = scanner.nextInt();
        scanner.nextLine();
    }

    public void imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println();
    }
}