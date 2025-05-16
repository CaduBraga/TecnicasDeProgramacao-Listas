import java.time.LocalDate;

public class Principal {
	public static void main(String[] args) {

		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("Pedro");
		pessoa1.setIdade(15);
		System.out.println("Pessoa 1:");
		System.out.println("Nome: " + pessoa1.getNome());
		System.out.println("Idade: " + pessoa1.getIdade());

		Pessoa pessoa2 = new Pessoa();
		pessoa2.setNome("Cadu");
		pessoa2.setIdade(17);
		System.out.println("Pessoa 2:");
		System.out.println("Nome: " + pessoa2.getNome());
		System.out.println("Idade: " + pessoa2.getIdade());

		System.out.println();
		Carro carro1 = new Carro();
		carro1.setMarca("Chevrolet");
		carro1.setModelo("Onix");
		carro1.setAno(2023);
		System.out.println("Carro 1:");
		System.out.println("Marca: " + carro1.getMarca());
		System.out.println("Modelo: " + carro1.getModelo());
		System.out.println("Ano: " + carro1.getAno());

		Carro carro2 = new Carro();
		carro2.setMarca("Volkswagen");
		carro2.setModelo("Gol");
		carro2.setAno(2021);
		System.out.println("Carro 2:");
		System.out.println("Marca: " + carro2.getMarca());
		System.out.println("Modelo: " + carro2.getModelo());
		System.out.println("Ano: " + carro2.getAno());

		Carro carro3 = new Carro();
		carro3.setMarca("Fiat");
		carro3.setModelo("Uno");
		carro3.setAno(2019);
		System.out.println("Carro 3:");
		System.out.println("Marca: " + carro3.getMarca());
		System.out.println("Modelo: " + carro3.getModelo());
		System.out.println("Ano: " + carro3.getAno());

		System.out.println();
		Livro livro1 = new Livro();
		livro1.setTitulo("1984");
		livro1.setAutor("George Orwell");
		livro1.setAnoDePublicacao(1949);
		System.out.println("Livro 1:");
		System.out.println("Título: " + livro1.getTitulo());
		System.out.println("Autor: " + livro1.getAutor());
		System.out.println("Ano de publicação: " + livro1.getAnoDePublicacao());

		Livro livro2 = new Livro();
		livro2.setTitulo("O Hobbit");
		livro2.setAutor("J. R. R. Tolkien");
		livro2.setAnoDePublicacao(1937);
		System.out.println("Livro 2:");
		System.out.println("Título: " + livro2.getTitulo());
		System.out.println("Autor: " + livro2.getAutor());
		System.out.println("Ano de publicação: " + livro2.getAnoDePublicacao());

		Livro livro3 = new Livro();
		livro3.setTitulo("Extraordinário");
		livro3.setAutor("R. J. Palacio");
		livro3.setAnoDePublicacao(2012);
		System.out.println("Livro 3:");
		System.out.println("Título: " + livro3.getTitulo());
		System.out.println("Autor: " + livro3.getAutor());
		System.out.println("Ano de publicação: " + livro3.getAnoDePublicacao());

		System.out.println();
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Maria");
		aluno1.setMatricula(126533);
		aluno1.setNotaFinal(9.75);
		System.out.println("Aluno 1:");
		System.out.println("Nome: " + aluno1.getNome());
		System.out.println("Matrícula: " + aluno1.getMatricula());
		System.out.printf("Nota final: %.2f\n", aluno1.getNotaFinal());

		Aluno aluno2 = new Aluno();
		aluno2.setNome("Julia");
		aluno2.setMatricula(5884699);
		aluno2.setNotaFinal(8.10);
		System.out.println("Aluno 2:");
		System.out.println("Nome: " + aluno2.getNome());
		System.out.println("Matrícula: " + aluno2.getMatricula());
		System.out.printf("Nota final: %.2f\n", aluno2.getNotaFinal());

		Aluno aluno3 = new Aluno();
		aluno3.setNome("Roberto");
		aluno3.setMatricula(7986245);
		aluno3.setNotaFinal(6.98);
		System.out.println("Aluno 3:");
		System.out.println("Nome: " + aluno3.getNome());
		System.out.println("Matrícula: " + aluno3.getMatricula());
		System.out.printf("Nota final: %.2f\n", aluno3.getNotaFinal());

		Aluno aluno4 = new Aluno();
		aluno4.setNome("Ana");
		aluno4.setMatricula(99658);
		aluno4.setNotaFinal(7.45);
		System.out.println("Aluno 4:");
		System.out.println("Nome: " + aluno4.getNome());
		System.out.println("Matrícula: " + aluno4.getMatricula());
		System.out.printf("Nota final: %.2f\n", aluno4.getNotaFinal());

		System.out.println();
		Roda roda1 = new Roda();
		roda1.setId(12345);
		roda1.setDiametro(8);
		roda1.setRaio(roda1.getDiametro() / 2);
		roda1.setMaterial("Metal");
		System.out.println("Roda 1:");
		System.out.println("ID: " + roda1.getId());
		System.out.println("Diâmetro: " + roda1.getDiametro());
		System.out.println("Raio: " + roda1.getRaio());
		System.out.println("Material: " + roda1.getMaterial());

		Roda roda2 = new Roda();
		roda2.setId(67890);
		roda2.setDiametro(10);
		roda2.setRaio(roda2.getDiametro() / 2);
		roda2.setMaterial("Borracha");
		System.out.println("Roda 2:");
		System.out.println("ID: " + roda2.getId());
		System.out.println("Diâmetro: " + roda2.getDiametro());
		System.out.println("Raio: " + roda2.getRaio());
		System.out.println("Material: " + roda2.getMaterial());

		Roda roda3 = new Roda();
		roda3.setId(11121);
		roda3.setDiametro(12);
		roda3.setRaio(roda3.getDiametro() / 2);
		roda3.setMaterial("Plástico");
		System.out.println("Roda 3:");
		System.out.println("ID: " + roda3.getId());
		System.out.println("Diâmetro: " + roda3.getDiametro());
		System.out.println("Raio: " + roda3.getRaio());
		System.out.println("Material: " + roda3.getMaterial());

		Roda roda4 = new Roda();
		roda4.setId(54321);
		roda4.setDiametro(15);
		roda4.setRaio(roda4.getDiametro() / 2);
		roda4.setMaterial("Alumínio");
		System.out.println("Roda 4:");
		System.out.println("ID: " + roda4.getId());
		System.out.println("Diâmetro: " + roda4.getDiametro());
		System.out.println("Raio: " + roda4.getRaio());
		System.out.println("Material: " + roda4.getMaterial());

		System.out.println();
		Animal animal1 = new Animal();
		animal1.setNome("Rex");
		animal1.setRaca("Pastor Alemão");
		animal1.setIdade(5);
		System.out.println("Animal 1:");
		System.out.println("Nome: " + animal1.getNome());
		System.out.println("Raça: " + animal1.getRaca());
		System.out.println("Idade: " + animal1.getIdade());

		Animal animal2 = new Animal();
		animal2.setNome("Mia");
		animal2.setRaca("Siamês");
		animal2.setIdade(3);
		System.out.println("Animal 2:");
		System.out.println("Nome: " + animal2.getNome());
		System.out.println("Raça: " + animal2.getRaca());
		System.out.println("Idade: " + animal2.getIdade());

		Animal animal3 = new Animal();
		animal3.setNome("Thor");
		animal3.setRaca("Golden Retriever");
		animal3.setIdade(4);
		System.out.println("Animal 3:");
		System.out.println("Nome: " + animal3.getNome());
		System.out.println("Raça: " + animal3.getRaca());
		System.out.println("Idade: " + animal3.getIdade());

		Animal animal4 = new Animal();
		animal4.setNome("Nina");
		animal4.setRaca("Poodle");
		animal4.setIdade(2);
		System.out.println("Animal 4:");
		System.out.println("Nome: " + animal4.getNome());
		System.out.println("Raça: " + animal4.getRaca());
		System.out.println("Idade: " + animal4.getIdade());

		System.out.println();
		Endereco endereco1 = new Endereco();
		endereco1.setRua("Av. Paulista");
		endereco1.setNumero(1000);
		endereco1.setCidade("São Paulo");
		System.out.println("Endereço 1:");
		System.out.println("Rua: " + endereco1.getRua());
		System.out.println("Número: " + endereco1.getNumero());
		System.out.println("Cidade: " + endereco1.getCidade());

		Endereco endereco2 = new Endereco();
		endereco2.setRua("Rua das Flores");
		endereco2.setNumero(250);
		endereco2.setCidade("Curitiba");
		System.out.println("Endereço 2:");
		System.out.println("Rua: " + endereco2.getRua());
		System.out.println("Número: " + endereco2.getNumero());
		System.out.println("Cidade: " + endereco2.getCidade());

		Endereco endereco3 = new Endereco();
		endereco3.setRua("Av. Beira Mar");
		endereco3.setNumero(500);
		endereco3.setCidade("Rio de Janeiro");
		System.out.println("Endereço 3:");
		System.out.println("Rua: " + endereco3.getRua());
		System.out.println("Número: " + endereco3.getNumero());
		System.out.println("Cidade: " + endereco3.getCidade());

		Endereco endereco4 = new Endereco();
		endereco4.setRua("Rua Central");
		endereco4.setNumero(77);
		endereco4.setCidade("Porto Alegre");
		System.out.println("Endereço 4:");
		System.out.println("Rua: " + endereco4.getRua());
		System.out.println("Número: " + endereco4.getNumero());
		System.out.println("Cidade: " + endereco4.getCidade());

		System.out.println();
		ContaBancaria conta1 = new ContaBancaria();
		conta1.setNumeroDaConta(123456);
		conta1.setSaldo(2500.75);
		System.out.println("Conta 1:");
		System.out.printf("Saldo: R$%.2f\n", conta1.getSaldo());

		ContaBancaria conta2 = new ContaBancaria();
		conta2.setNumeroDaConta(789012);
		conta2.setSaldo(5000.50);
		System.out.println("Conta 2:");
		System.out.printf("Saldo: R$%.2f\n", conta2.getSaldo());

		System.out.println();
		Funcionario func1 = new Funcionario();
		func1.setNome("Carlos Silva");
		func1.setSalario(3500.00);
		func1.setCargo("Analista de Sistemas");
		System.out.println("Funcionário 1:");
		System.out.println("Nome: " + func1.getNome());
		System.out.printf("Salário: R$%.2f\n", func1.getSalario());
		System.out.println("Cargo: " + func1.getCargo());

		Funcionario func2 = new Funcionario();
		func2.setNome("Ana Souza");
		func2.setSalario(4500.00);
		func2.setCargo("Gerente de Projetos");
		System.out.println("Funcionário 2:");
		System.out.println("Nome: " + func2.getNome());
		System.out.printf("Salário: R$%.2f\n", func2.getSalario());
		System.out.println("Cargo: " + func2.getCargo());

		Funcionario func3 = new Funcionario();
		func3.setNome("Marcos Pereira");
		func3.setSalario(2800.00);
		func3.setCargo("Desenvolvedor Júnior");
		System.out.println("Funcionário 3:");
		System.out.println("Nome: " + func3.getNome());
		System.out.printf("Salário: R$%.2f\n", func3.getSalario());
		System.out.println("Cargo: " + func3.getCargo());

		Funcionario func4 = new Funcionario();
		func4.setNome("Beatriz Almeida");
		func4.setSalario(6000.00);
		func4.setCargo("Diretora de TI");
		System.out.println("Funcionário 4:");
		System.out.println("Nome: " + func4.getNome());
		System.out.printf("Salário: R$%.2f\n", func4.getSalario());
		System.out.println("Cargo: " + func4.getCargo());

		System.out.println();
		Produto produto1 = new Produto();
		produto1.setNome("Notebook");
		produto1.setPreco(4500.00);
		produto1.setDescricao("Notebook Gamer com processador i7 e 16GB RAM");
		produto1.setQuantidadeEstoque(10);
		System.out.println("Produto 1:");
		System.out.println("Nome: " + produto1.getNome());
		System.out.printf("Preço: R$%.2f\n", produto1.getPreco());
		System.out.println("Descrição: " + produto1.getDescricao());
		System.out.println("Quantidade em Estoque: " + produto1.getQuantidadeEstoque());

		Produto produto2 = new Produto();
		produto2.setNome("Smartphone");
		produto2.setPreco(3200.00);
		produto2.setDescricao("Smartphone com câmera de 108MP e bateria de longa duração");
		produto2.setQuantidadeEstoque(25);
		System.out.println("Produto 2:");
		System.out.println("Nome: " + produto2.getNome());
		System.out.printf("Preço: R$%.2f\n", produto2.getPreco());
		System.out.println("Descrição: " + produto2.getDescricao());
		System.out.println("Quantidade em Estoque: " + produto2.getQuantidadeEstoque());

		Produto produto3 = new Produto();
		produto3.setNome("Fone de Ouvido");
		produto3.setPreco(350.00);
		produto3.setDescricao("Fone de ouvido Bluetooth com cancelamento de ruído");
		produto3.setQuantidadeEstoque(50);
		System.out.println("Produto 3:");
		System.out.println("Nome: " + produto3.getNome());
		System.out.printf("Preço: R$%.2f\n", produto3.getPreco());
		System.out.println("Descrição: " + produto3.getDescricao());
		System.out.println("Quantidade em Estoque: " + produto3.getQuantidadeEstoque());

		Produto produto4 = new Produto();
		produto4.setNome("Monitor");
		produto4.setPreco(1200.00);
		produto4.setDescricao("Monitor 27 polegadas Full HD com taxa de atualização de 144Hz");
		produto4.setQuantidadeEstoque(15);
		System.out.println("Produto 4:");
		System.out.println("Nome: " + produto4.getNome());
		System.out.printf("Preço: R$%.2f\n", produto4.getPreco());
		System.out.println("Descrição: " + produto4.getDescricao());
		System.out.println("Quantidade em Estoque: " + produto4.getQuantidadeEstoque());

		System.out.println();
		Emprestimo emprestimo1 = new Emprestimo();
		emprestimo1.setValor(5000.00);
		emprestimo1.setDataDeEmprestimo(LocalDate.of(2024, 3, 1));
		emprestimo1.setNumeroDeParcelas(12);
		System.out.println("Empréstimo 1:");
		System.out.printf("Valor: R$%.2f\n", emprestimo1.getValor());
		System.out.println("Data do Empréstimo: " + emprestimo1.getDataDeEmprestimo());
		System.out.println("Número de Parcelas: " + emprestimo1.getNumeroDeParcelas());

		Emprestimo emprestimo2 = new Emprestimo();
		emprestimo2.setValor(12000.00);
		emprestimo2.setDataDeEmprestimo(LocalDate.of(2024, 2, 15));
		emprestimo2.setNumeroDeParcelas(24);
		System.out.println("Empréstimo 2:");
		System.out.printf("Valor: R$%.2f\n", emprestimo2.getValor());
		System.out.println("Data do Empréstimo: " + emprestimo2.getDataDeEmprestimo());
		System.out.println("Número de Parcelas: " + emprestimo2.getNumeroDeParcelas());

		Emprestimo emprestimo3 = new Emprestimo();
		emprestimo3.setValor(3000.00);
		emprestimo3.setDataDeEmprestimo(LocalDate.of(2024, 1, 10));
		emprestimo3.setNumeroDeParcelas(6);
		System.out.println("Empréstimo 3:");
		System.out.printf("Valor: R$%.2f\n", emprestimo3.getValor());
		System.out.println("Data do Empréstimo: " + emprestimo3.getDataDeEmprestimo());
		System.out.println("Número de Parcelas: " + emprestimo3.getNumeroDeParcelas());

		Emprestimo emprestimo4 = new Emprestimo();
		emprestimo4.setValor(20000.00);
		emprestimo4.setDataDeEmprestimo(LocalDate.of(2023, 12, 5));
		emprestimo4.setNumeroDeParcelas(36);
		System.out.println("Empréstimo 4:");
		System.out.printf("Valor: R$%.2f\n", emprestimo4.getValor());
		System.out.println("Data do Empréstimo: " + emprestimo4.getDataDeEmprestimo());
		System.out.println("Número de Parcelas: " + emprestimo4.getNumeroDeParcelas());
	}
}
