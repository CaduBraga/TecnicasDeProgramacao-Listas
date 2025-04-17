import java.time.LocalDate;
public class ClassePrincipal {
    public static void main(String[] args) {
        
    	//Ainda não aprendemos esse outro método "de visualização", mas aqui eu tentei implementá-lo no código
    	
        Pessoa pessoa1 = new Pessoa("Pedro", 15);
        System.out.println("Pessoa 1:");
        pessoa1.visualizarPessoa();
        Pessoa pessoa2 = new Pessoa("Cadu", 17);
        System.out.println("Pessoa 2:");
        pessoa2.visualizarPessoa();
        System.out.println();
        
        Carro carro1 = new Carro("Chevrolet", "Onix", 2023);
        System.out.println("Carro 1:");
        carro1.visualizarCarro();
        Carro carro2 = new Carro("Volkswagen", "Gol", 2021);
        System.out.println("Carro 2:");
        carro2.visualizarCarro();
        Carro carro3 = new Carro("Fiat", "Uno", 2019);
        System.out.println("Carro 3:");
        carro3.visualizarCarro();
        System.out.println();
        
        Livro livro1 = new Livro("1984", "George Orwell", 1949);
        System.out.println("Livro 1:");
        livro1.visualizarLivro();      
        Livro livro2 = new Livro("O Hobbit", "J. R. R. Tolkien", 1937);
        System.out.println("Livro 2:");
        livro2.visualizarLivro();  
        Livro livro3 = new Livro("Extraordinário", "R. J. Palacio", 2012);
        System.out.println("Livro 3:");
        livro3.visualizarLivro();
        System.out.println();
        
        Aluno aluno1 = new Aluno("Maria", 126533, 9.75);
        System.out.println("Aluno 1:");
        aluno1.visualizarAluno();
        Aluno aluno2 = new Aluno("Julia", 5884699, 8.10);
        System.out.println("Aluno 2:");
        aluno2.visualizarAluno();
        Aluno aluno3 = new Aluno("Roberto", 7986245, 6.98);
        System.out.println("Aluno 3:");
        aluno3.visualizarAluno();
        Aluno aluno4 = new Aluno("Roberto", 99658, 7.45);
        System.out.println("Aluno 4:");
        aluno4.visualizarAluno();
        System.out.println();
        
        Roda roda1 = new Roda(12345, 8, "Metal");
        System.out.println("Roda 1:");
        roda1.visualizarRoda();
        Roda roda2 = new Roda(67890, 10, "Borracha");
        System.out.println("Roda 2:");
        roda2.visualizarRoda();
        Roda roda3 = new Roda(11121, 12, "Plástico");
        System.out.println("Roda 3:");
        roda3.visualizarRoda();
        Roda roda4 = new Roda(54321, 15, "Alumínio");
        System.out.println("Roda 4:");
        roda4.visualizarRoda();
        System.out.println();
        
        Animal animal1 = new Animal("Rex", "Pastor Alemão", 5);
        System.out.println("Animal 1:");
        animal1.visualizarAnimal();
        Animal animal2 = new Animal("Mia", "Siamês", 3);
        System.out.println("Animal 2:");
        animal2.visualizarAnimal();
        Animal animal3 = new Animal("Thor", "Golden Retriever", 4);
        System.out.println("Animal 3:");
        animal3.visualizarAnimal();
        Animal animal4 = new Animal("Nina", "Poodle", 2);
        System.out.println("Animal 4:");
        animal4.visualizarAnimal();
        System.out.println();
        
        Endereco endereco1 = new Endereco("Av. Paulista", 1000, "São Paulo");
        System.out.println("Endereço 1:");
        endereco1.visualizarEndereco();
        Endereco endereco2 = new Endereco("Rua das Flores", 250, "Curitiba");
        System.out.println("Endereço 2:");
        endereco2.visualizarEndereco();
        Endereco endereco3 = new Endereco("Av. Beira Mar", 500, "Rio de Janeiro");
        System.out.println("Endereço 3:");
        endereco3.visualizarEndereco();
        Endereco endereco4 = new Endereco("Rua Central", 77, "Porto Alegre");
        System.out.println("Endereço 4:");
        endereco4.visualizarEndereco();
        System.out.println();
        
        ContaBancaria conta1 = new ContaBancaria(123456, 2500.75);
        System.out.println("Conta 1:");
        conta1.visualizarConta();
        ContaBancaria conta2 = new ContaBancaria(789012, 5000.50);
        System.out.println("Conta 2:");
        conta2.visualizarConta();
        System.out.println();
        
        Funcionario func1 = new Funcionario("Carlos Silva", 3500.00, "Analista de Sistemas");
        System.out.println("Funcionário 1:");
        func1.visualizarFuncionario();
        Funcionario func2 = new Funcionario("Ana Souza", 4500.00, "Gerente de Projetos");
        System.out.println("Funcionário 2:");
        func2.visualizarFuncionario();
        Funcionario func3 = new Funcionario("Marcos Pereira", 2800.00, "Desenvolvedor Júnior");
        System.out.println("Funcionário 3:");
        func3.visualizarFuncionario();
        Funcionario func4 = new Funcionario("Beatriz Almeida", 6000.00, "Diretora de TI");
        System.out.println("Funcionário 4:");
        func4.visualizarFuncionario();
        System.out.println();
        
        Produto produto1 = new Produto("Notebook", 4500.00, "Notebook Gamer com processador i7 e 16GB RAM", 10);
        System.out.println("Produto 1:");
        produto1.visualizarItens();
        Produto produto2 = new Produto("Smartphone", 3200.00, "Smartphone com câmera de 108MP e bateria de longa duração", 25);
        System.out.println("Produto 2:");
        produto2.visualizarItens();
        Produto produto3 = new Produto("Fone de Ouvido", 350.00, "Fone de ouvido Bluetooth com cancelamento de ruído", 50);
        System.out.println("Produto 3:");
        produto3.visualizarItens();
        Produto produto4 = new Produto("Monitor", 1200.00, "Monitor 27 polegadas Full HD com taxa de atualização de 144Hz", 15);
        System.out.println("Produto 4:");
        produto4.visualizarItens();
        System.out.println();
        
        Emprestimo emprestimo1 = new Emprestimo(5000.00, LocalDate.of(2024, 3, 1), 12);
        System.out.println("Empréstimo 1:");
        emprestimo1.visualizarEmprestimo();
        Emprestimo emprestimo2 = new Emprestimo(12000.00, LocalDate.of(2024, 2, 15), 24);
        System.out.println("Empréstimo 2:");
        emprestimo2.visualizarEmprestimo();
        Emprestimo emprestimo3 = new Emprestimo(3000.00, LocalDate.of(2024, 1, 10), 6);
        System.out.println("Empréstimo 3:");
        emprestimo3.visualizarEmprestimo();
        Emprestimo emprestimo4 = new Emprestimo(20000.00, LocalDate.of(2023, 12, 5), 36);
        System.out.println("Empréstimo 4:");
        emprestimo4.visualizarEmprestimo();
    }
}