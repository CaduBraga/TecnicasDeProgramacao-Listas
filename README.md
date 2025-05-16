# ✏ Atividades da aula

A partir dos modelos abaixo, crie **classes** em java com seus métodos mais elementares

- **construtores (sem parâmetro e todos os parâmetros)**
- **getters e setters**
- **preencher**
- **imprimir**
- Utilize também o Scanner para entrar com dados nos projetos.

### Ex0. Telefone celular

marca - string; modelo - string; preço - double; memória - double;

```java
public class TelefoneCelular {
    // Atributos
    private String marca;
    private String modelo;
    private double preco;
    private int memoria;
}

//... continue seu codigo
```

```json
Celular{
  "marca": "Samsung",
  "modelo": "Galaxy S21",
  "preco": 4599.99,
  "memoria": 256
}
```

### Ex1. TV

marca - string; tamanho - double; resolução - string; preço - double;

```json
TV{
  "marca": "LG",
  "tamanho": 55,
  "resolucao": "4K",
  "preco": 3799.99
}
```

### Ex2. Casa

endereço - string; área - double; número de quartos - int; preço - double;

```json
Casa{
  "endereco": "Rua das Flores, 123",
  "area": 200,
  "numeroQuartos": 3,
  "preco": 950000
}
```

### Ex3. Aluno

nome:String - idade:int - matricula:String - anoIngresso:int

```json
Aluno{
  "nome": "João Vitor",
  "idade": 20,
  "matricula": 2024-12,
  "anoIngresso": 2024
}
```

- Caso você necessite, assita a solução:
    
    https://www.youtube.com/watch?v=hHHUysFJfdM&list=PLqlIQgAFrQ164-r2ErHvYTlt7LNQ_j3Xx&index=16
    

### Ex4. Livro

título - string; autor - string; número de páginas - int; preço - double;

```json
Livro {
  "titulo": "Como programar em C++",
  "autor": "Jose da silva",
  "numeroPaginas": 30,
  "preco": 95
}
```

### Ex5. Animal de estimação

espécie - string; raça - string; idade - int; peso - double;

```json
Animal{
  "especie": "Cachorro",
  "raca": "Golden Retriever",
  "idade": 3,
  "peso": 30
}
```

### Ex6. Bicicleta

marca - string; modelo - string; tamanho do quadro - double; preço - double;

```json
Bicicleta{
  "marca": "Trek",
  "modelo": "Domane SL 6",
  "tamanhoQuadro": 56,
  "preco": 6499.99
}
```

### Ex7. Filme

título - string; diretor - string; duração - int; preço - double;

```json
Filme{
  "titulo": "Bohemian Rhapsody",
  "artista": "Queen",
  "duracao": 354,
  "preco": 1.29
}
```

### Ex8. Música

título - string; artista - string; duração - int; preço - double; 

```json
Musica{
  "titulo": "Amigo",
  "artista": "Milton Nascimento",
  "duracao": 3.5,
  "preco": 12.00
}
```

- Neste exercício, além dos métodos tradicionais que combinamos faça também os métodos `tocarMusica()` e `desligarMusica()`;
- Como ainda estamos treinando podemos fazer métodos ‘mockados’, ou seja métodos fake. Um método mock é aquele método que serve apenas para testes, portanto pode ser feito apenas com um System.out.print();
- Exemplo:
    
    ```java
    public class Musica {
        private String titulo;
    		private String artista;
    		private double duracao;
    		private double preco;
    
        // Método mockado para obter ligar a musica
        public void tocarMusica() {
            System.out.println("A musica "+ this.titulo + " está tocando!");
        }
    
    		 //Faça os demais métodos e depois não esqueça de chamá-los na main
    ```
    

### Ex9. Jogo de vídeo game

título - string; plataforma - string; classificação etária - string; preço - double;

```json
Game{
  "titulo": "The Legend of Zelda: Breath of the Wild",
  "plataforma": "Nintendo Switch",
  "classificacaoEtaria": "10+",
  "preco": 59.99
}
```

### Ex10. Bolsa de valores

nome da empresa - string; preço da ação - double; volume de negociações - double; variação diária - double.

```json
Ativo{
  "nomeEmpresa": "Apple Inc.",
  "precoAcao": 121.99,
  "volumeNegociacoes": 25573500,
  "variacaoDiaria": 1.87
}
```
