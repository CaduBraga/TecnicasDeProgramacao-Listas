public class Livro {

	String titulo;
	String autor;
	int anoDePublicacao;

	public Livro(String titulo, String autor, int anoDePublicacao){

		this.titulo = titulo;
		this.autor = autor;
		this.anoDePublicacao = anoDePublicacao;
	}
	
    public void visualizarLivro() {
    	
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de Publicação: " + anoDePublicacao);
    }
}