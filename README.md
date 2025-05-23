# Sistema de Gerenciamento de Listas

Este é um sistema desenvolvido em Java como parte das atividades práticas da unidade curricular de Técnicas de Programação, ministrada pelo professor Bruno da Silva Andrade, no curso de Desenvolvimento de Sistemas do CentroWeg, da turma MIDS 77. O projeto tem como objetivo exercitar o uso de ArrayList em Java, permitindo operações básicas como inserção, acesso e remoção de itens em diferentes tipos de listas.

## Funcionalidades

- Inserir itens em diferentes listas
- Acessar itens de uma lista específica
- Remover itens de uma lista
- Gerenciar 11 tipos diferentes de listas:
  1. Telefone Celular
  2. Televisão
  3. Casa
  4. Aluno
  5. Livro
  6. Animal
  7. Bicicleta
  8. Filme
  9. Música
  10. Jogo
  11. Bolsa

## Estrutura do Projeto

```
br/com/lista_list/
├── .gitignore                # Arquivos ignorados pelo Git
├── README.md                 # Documentação do projeto
├── Main.java                 # Classe principal que executa o sistema
├── model/                    # Classes de modelo (criação da classe com atributos e método construtor)
│ ├── Aluno.java
│ ├── AnimalDeEstimacao.java
│ ├── Bicicleta.java
│ ├── BolsaDeValores.java
│ ├── Casa.java
│ ├── Filme.java
│ ├── JogoVideogame.java
│ ├── Livro.java
│ ├── Listas.java
│ ├── Musica.java
│ ├── TelefoneCelular.java
│ └── TV.java
├── service/                 # Lógica de programação e os códigos funcionando
│ ├── Acessar.java
│ ├── Encerrar.java
│ ├── Inserir.java
│ └── Remover.java
└── views/                   # Entrada e saída de dados (interface do usuário)
├── Escolhas.java
├── ViewAluno.java
├── ViewAnimal.java
├── ViewBicicleta.java
├── ViewBolsa.java
├── ViewCasa.java
├── ViewFilme.java
├── ViewJogo.java
├── ViewLivro.java
├── ViewMusica.java
├── ViewTelefone.java
└── ViewTV.java
```

## Como Executar

### Via Linha de Comando

1. Certifique-se de ter o Java instalado em sua máquina
2. Compile o projeto:
   ```bash
   javac br/com/lista_list/Principal.java
   ```
3. Execute o programa:
   ```bash
   java br.com.lista_list.Principal
   ```

### Via IDE

1. Abra sua IDE preferida (Eclipse, IntelliJ IDEA, VS Code, etc.)
2. Importe o projeto como um projeto Java existente
3. Localize a classe `Principal.java` no explorador de arquivos da IDE
4. Execute a classe `Principal` através da opção "Run" da sua IDE

## Uso

Ao iniciar o programa, você verá um menu com as seguintes opções:

1. Inserir itens numa lista
2. Acessar uma lista
3. Remover itens de uma lista
4. Encerrar o programa

Selecione a opção desejada digitando o número correspondente e siga as instruções na tela.

## Requisitos

- Java 8 ou superior
- Sistema operacional compatível com Java
