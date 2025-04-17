public class Endereco {

	String rua;
	int numero;
	String cidade;

	public Endereco(String rua, int numero, String cidade) {

		this.rua = rua;
		this.numero = numero;
		this.cidade = cidade;
	}

	public void visualizarEndereco(){
		
		System.out.println("Rua: " + rua);
		System.out.println("Número: " + numero);
		System.out.println("Cidade: " + cidade);
	}
}