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
├── .gitignore                   # Configuração de arquivos ignorados pelo Git
├── README.md                    # Documentação do projeto
├── Principal.java               # Classe principal do programa
├── model/
│   ├── Listas.java              # Classe que contém as listas
│   ├── TelefoneCelular.java     # Modelo para telefones celulares
│   ├── TV.java                  # Modelo para televisões
│   ├── Casa.java                # Modelo para casas
│   ├── Aluno.java               # Modelo para alunos
│   ├── Livro.java               # Modelo para livros
│   ├── AnimalDeEstimacao.java   # Modelo para animais de estimação
│   ├── Bicicleta.java           # Modelo para bicicletas
│   ├── Filme.java               # Modelo para filmes
│   ├── Musica.java              # Modelo para músicas
│   ├── JogoVideogame.java       # Modelo para jogos de videogame
│   └── BolsaDeValores.java      # Modelo para bolsa de valores
├── service/
│   ├── Acessar.java             # Serviço para acessar listas
│   ├── Encerrar.java            # Serviço para encerrar o programa
│   ├── Inserir.java             # Serviço para inserir itens
│   └── Remover.java             # Serviço para remover itens
└── views/
    └── Menu.java                # Interface do menu principal
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