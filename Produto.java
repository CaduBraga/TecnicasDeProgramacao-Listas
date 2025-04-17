public class Produto {
	
    String nome;
    double preco;
    String descricao;
    int quantidadeEstoque;

	public Produto(String nome, double preco, String descricao, int quantidadeEstoque){
		
		this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
        this.quantidadeEstoque = quantidadeEstoque;
	}
	
	 public void visualizarItens(){
		 
	        System.out.println("Nome do Produto: " + nome);
	        System.out.println("Preço: R$" + String.format("%.2f", preco));
	      //Sei que ainda não aprendemos o String.format, mas descobri como usar e decidi implementá-lo no código
	        System.out.println("Descrição: " + descricao);
	        System.out.println("Quantidade em Estoque: " + quantidadeEstoque);
	 }
}