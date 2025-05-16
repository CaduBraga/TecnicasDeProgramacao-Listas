import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		TelefoneCelular celular1 = new TelefoneCelular();
		System.out.println("Preencha os dados do primeiro celular:");
		celular1.preencherDados(scanner);
		TelefoneCelular celular2 = new TelefoneCelular();
		System.out.println("Preencha os dados do segundo celular:");
		celular2.preencherDados(scanner);
		TelefoneCelular celular3 = new TelefoneCelular("Apple", "iPhone 13", 4500.00, 256);
		TelefoneCelular celular4 = new TelefoneCelular();
		celular4.setMarca("Samsung");
		celular4.setModelo("Galaxy S21");
		celular4.setPreco(3499.90);
		celular4.setMemoria(128);

		TV tv1 = new TV();
		System.out.println("Preencha os dados da primeira TV:");
		tv1.preencherDados(scanner);
		TV tv2 = new TV();
		System.out.println("Preencha os dados da segunda TV:");
		tv2.preencherDados(scanner);
		TV tv3 = new TV("Samsung", 55, "4K", 3200.00);
		TV tv4 = new TV();
		tv4.setMarca("LG");
		tv4.setTamanho(55.0);
		tv4.setResolucao("4K");
		tv4.setPreco(2899.90);

		Casa casa1 = new Casa();
		System.out.println("Preencha os dados da primeira casa:");
		casa1.preencherDados(scanner);
		Casa casa2 = new Casa();
		System.out.println("Preencha os dados da segunda casa:");
		casa2.preencherDados(scanner);
		Casa casa3 = new Casa("Rua Amarela, 123", 150.0, 3, 350000.00);
		Casa casa4 = new Casa();
		casa4.setEndereco("Rua das Margaridas, 321");
		casa4.setArea(120.5);
		casa4.setQuartos(5);
		casa4.setPreco(450000.00);

		Aluno aluno1 = new Aluno();
		System.out.println("Preencha os dados do primeiro aluno:");
		aluno1.preencherDados(scanner);
		Aluno aluno2 = new Aluno();
		System.out.println("Preencha os dados do segundo aluno:");
		aluno2.preencherDados(scanner);
		Aluno aluno3 = new Aluno("João Silva", 20, "A12345", 2022);
		Aluno aluno4 = new Aluno();
		aluno4.setNome("Lucas Pedri");
		aluno4.setIdade(17);
		aluno4.setMatricula("20251398");
		aluno4.setAnoIngresso(2023);

		Livro livro1 = new Livro();
		System.out.println("Preencha os dados do primeiro livro:");
		livro1.preencherDados(scanner);
		Livro livro2 = new Livro();
		System.out.println("Preencha os dados do segundo livro:");
		livro2.preencherDados(scanner);
		Livro livro3 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1200, 99.90);
		Livro livro4 = new Livro();
		livro4.setTitulo("1984");
		livro4.setAutor("George Orwell");
		livro4.setPaginas(328);
		livro4.setPreco(49.90);

		AnimalDeEstimacao animal1 = new AnimalDeEstimacao();
		System.out.println("Preencha os dados do primeiro animal de estimação:");
		animal1.preencherDados(scanner);
		AnimalDeEstimacao animal2 = new AnimalDeEstimacao();
		System.out.println("Preencha os dados do segundo animal de estimação:");
		animal2.preencherDados(scanner);
		AnimalDeEstimacao animal3 = new AnimalDeEstimacao("Cachorro", "Golden Retriever", 3, 25.5);
		AnimalDeEstimacao animal4 = new AnimalDeEstimacao();
		animal4.setEspecie("Gato");
		animal4.setRaca("Siamês");
		animal4.setIdade(7);
		animal4.setPeso(31.8);

		Bicicleta bicicleta1 = new Bicicleta();
		System.out.println("Preencha os dados da primeira bicicleta:");
		bicicleta1.preencherDados(scanner);
		Bicicleta bicicleta2 = new Bicicleta();
		System.out.println("Preencha os dados da segunda bicicleta:");
		bicicleta2.preencherDados(scanner);
		Bicicleta bicicleta3 = new Bicicleta("Caloi", "Elite Carbon", 17.5, 8500.00);
		Bicicleta bicicleta4 = new Bicicleta();
		bicicleta4.setMarca("Caloi");
		bicicleta4.setModelo("Explorer Sport");
		bicicleta4.setTamanho(17.5);
		bicicleta4.setPreco(2999.90);

		Filme filme1 = new Filme();
		System.out.println("Preencha os dados do primeiro filme:");
		filme1.preencherDados(scanner);
		Filme filme2 = new Filme();
		System.out.println("Preencha os dados do segundo filme:");
		filme2.preencherDados(scanner);
		Filme filme3 = new Filme("O Poderoso Chefão", "Francis Ford Coppola", 175, 19.99);
		Filme filme4 = new Filme();
		filme4.setTitulo("Interestelar");
		filme4.setDiretor("Christopher Nolan");
		filme4.setDuracao(169);
		filme4.setPreco(19.90);

		Musica musica1 = new Musica();
		System.out.println("Preencha os dados da primeira música:");
		musica1.preencherDados(scanner);
		Musica musica2 = new Musica();
		System.out.println("Preencha os dados da segunda música:");
		musica2.preencherDados(scanner);
		Musica musica3 = new Musica("Bohemian Rhapsody", "Queen", 5.55, 3.99);
		Musica musica4 = new Musica();
		musica4.setTitulo("50 reais");
		musica4.setArtista("Marília Mendonça");
		musica4.setDuracao(3.58);
		musica4.setPreco(5.99);

		JogoVideogame jogo1 = new JogoVideogame();
		System.out.println("Preencha os dados do primeiro jogo:");
		jogo1.preencherDados(scanner);
		JogoVideogame jogo2 = new JogoVideogame();
		System.out.println("Preencha os dados do segundo jogo:");
		jogo2.preencherDados(scanner);
		JogoVideogame jogo3 = new JogoVideogame("The Last of Us", "PlayStation 4", "18+", 199.99);
		JogoVideogame jogo4 = new JogoVideogame();
		jogo4.setTitulo("The Last of Us Part II");
		jogo4.setPlataforma("PlayStation 5");
		jogo4.setClassificacao("18+");
		jogo4.setPreco(249.90);

		BolsaDeValores bolsa1 = new BolsaDeValores();
		System.out.println("Preencha os dados da primeira empresa:");
		bolsa1.preencherDados(scanner);
		BolsaDeValores bolsa2 = new BolsaDeValores();
		System.out.println("Preencha os dados da segunda empresa:");
		bolsa2.preencherDados(scanner);
		BolsaDeValores bolsa3 = new BolsaDeValores("Petrobras", 32.50, 100000, 1.2);
		BolsaDeValores bolsa4 = new BolsaDeValores();
		bolsa4.setNome("WEG");
		bolsa4.setPreco(150.45);
		bolsa4.setVolume(15000.0);
		bolsa4.setVariacao(2.35);

		System.out.println("\n\nInformações dos objetos:");

		System.out.println("\nInformações dos Celulares:\n");
		System.out.println("Informações do primeiro celular:");
		celular1.imprimirDados();
		System.out.println("Informações do segundo celular:");
		celular2.imprimirDados();
		System.out.println("Informações do terceiro celular:");
		celular3.imprimirDados();
		System.out.println("Informações do quarto celular:");
		celular4.imprimirDados();

		System.out.println("\nInformações das TVs:\n");
		System.out.println("Informações da primeira TV:");
		tv1.imprimirDados();
		System.out.println("Informações da segunda TV:");
		tv2.imprimirDados();
		System.out.println("Informações da terceira TV:");
		tv3.imprimirDados();
		System.out.println("Informações da quarta TV:");
		tv4.imprimirDados();

		System.out.println("\nInformações das Casas:\n");
		System.out.println("Informações da primeira casa:");
		casa1.imprimirDados();
		System.out.println("Informações da segunda casa:");
		casa2.imprimirDados();
		System.out.println("Informações da terceira casa:");
		casa3.imprimirDados();
		System.out.println("Informações da quarta casa:");
		casa4.imprimirDados();

		System.out.println("\nInformações dos Alunos:\n");
		System.out.println("Informações do primeiro aluno:");
		aluno1.imprimirDados();
		System.out.println("Informações do segundo aluno:");
		aluno2.imprimirDados();
		System.out.println("Informações do terceiro aluno:");
		aluno3.imprimirDados();
		System.out.println("Informações do quarto aluno:");
		aluno4.imprimirDados();

		System.out.println("\nInformações dos Livros:\n");
		System.out.println("Informações do primeiro livro:");
		livro1.imprimirDados();
		System.out.println("Informações do segundo livro:");
		livro2.imprimirDados();
		System.out.println("Informações do terceiro livro:");
		livro3.imprimirDados();
		System.out.println("Informações do quarto livro:");
		livro4.imprimirDados();

		System.out.println("\nInformações dos Animais de Estimação:\n");
		System.out.println("Informações do primeiro animal:");
		animal1.imprimirDados();
		System.out.println("Informações do segundo animal:");
		animal2.imprimirDados();
		System.out.println("Informações do terceiro animal:");
		animal3.imprimirDados();
		System.out.println("Informações do quarto animal:");
		animal4.imprimirDados();

		System.out.println("\nInformações das Bicicletas:\n");
		System.out.println("Informações da primeira bicicleta:");
		bicicleta1.imprimirDados();
		System.out.println("Informações da segunda bicicleta:");
		bicicleta2.imprimirDados();
		System.out.println("Informações da terceira bicicleta:");
		bicicleta3.imprimirDados();
		System.out.println("Informações da quarta bicicleta:");
		bicicleta4.imprimirDados();

		System.out.println("\nInformações dos Filmes:\n");
		System.out.println("Informações do primeiro filme:");
		filme1.imprimirDados();
		System.out.println("Informações do segundo filme:");
		filme2.imprimirDados();
		System.out.println("Informações do terceiro filme:");
		filme3.imprimirDados();
		System.out.println("Informações do quarto filme:");
		filme4.imprimirDados();

		System.out.println("\nInformações das Músicas:\n");
		System.out.println("Informações da primeira música:");
		musica1.imprimirDados();
		System.out.println("Informações da segunda música:");
		musica2.imprimirDados();
		System.out.println("Informações da terceira música:");
		musica3.imprimirDados();
		System.out.println("Informações da quarta música:");
		musica4.imprimirDados();

		System.out.println("\nInformações dos Jogos:\n");
		System.out.println("Informações do primeiro jogo:");
		jogo1.imprimirDados();
		System.out.println("Informações do segundo jogo:");
		jogo2.imprimirDados();
		System.out.println("Informações do terceiro jogo:");
		jogo3.imprimirDados();
		System.out.println("Informações do quarto jogo:");
		jogo4.imprimirDados();

		System.out.println("\nInformações das Empresas na Bolsa de Valores:\n");
		System.out.println("Informações da primeira empresa:");
		bolsa1.imprimirDados();
		System.out.println("Informações da segunda empresa:");
		bolsa2.imprimirDados();
		System.out.println("Informações da terceira empresa:");
		bolsa3.imprimirDados();
		System.out.println("Informações da quarta empresa:");
		bolsa4.imprimirDados();

		scanner.close();
	}
}