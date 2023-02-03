# POO - II | Lista de exercícios sobre os conceitos de interfaces e generics.

Aqui se encontram alguns exercícios para treinar os conceitos de interfaces e generics do módulo de Programação Orientada a Objetos. 
Para conferência adicionei no diretório `soluções` uma possível forma de resolver os exercícios propostos,
recomendo só utilizar como conferência e após já tiver tentado resolver o exercício por conta própria.
Também foi adicionado testes para as soluções localizados no diretório de testes com o mesmo `package` da classe a ser testada.

## Exercício 1 — Forma2D

Crie uma interface `Forma2D` que possui o método `area()` que retorna a área de uma forma geométrica. Implemente essa interface para as seguintes formas Quadrado, Retângulo e Circulo. 
Crie um método que receba uma lista de formas e retorne a soma das areas dessas formas.

## Exercício 2 — Forma3D

Crie uma interface `Forma3D` que estenda o comportamento da interface `Forma2D` do exercício anterior adicionando o método `volume()`. 
Implemente essa interface para as seguintes formas Cubo, Cilindro e Esfera. 
Crie um método que receba uma lista de formas e retorne a soma dos volumes, verificar se o método anterior soma corretamente as áreas das formas 3D também.

## Exercício 3 — Stack/Pilha

Crie uma interface `Stack` ou "Pilha" genérica que possui o comportamento de `LIFO (Last in, First out)`, último a entrar é o primeiro a sair, com os 3 métodos:
* `push` ou empilhar que recebe um elemento e adiciona na pilha;
* `pop` ou desempilhar que remove e retorna o último elemento adicionado na pilha. Caso a pilha esteja vazia sobe uma exceção;
* `peek` ou espiar, que retorna o último elemento da pilha sem removê-lo. Caso a pilha esteja vazia sobe uma exceção;
* `size` que retorna a quantidade de elementos na pilha.

Faça no seu método main exemplos do uso dos métodos citados.

## Exercício 4 — Classified

Supondo que trabalhe para uma agência de espionagem e lhe foi atribuido a responsabilidade de criar uma classe genérica chamada `Classified` para ocultar os dados que tenham acesso restrito a pessoas sem autorização. 
Essa classe recebe no seu construtor um objeto e uma senha. 
O ToString dela retorna sempre `Objeto sigiloso[*****]`, e ela possui um método get(String senha) que recebe uma senha como parâmetro, se essa senha estiver correta retorna o objeto. Caso contrário, lança uma exceção dizendo que a senha é inválida e não pode retornar o objeto e as autoridades serão notificadas desse ocorrido.

Foi-nos solicitado que fosse criado paginação para o nosso sistema assim devemos criar uma interface genérica `Pageable`, paginável, com os métodos:
* `getPage(int pageNumber)` que recebe o número da página e retorna um objeto genérico do tipo `Page`, que definiremos a seguir;
* `getTotalPages()` que retorna o número total de páginas dessa paginação;
* `getTotalElements()` que retorna a quantia total de elementos a serem paginados;
* `getElementsPerPages()` que retorna o número de elementos por página;

A classe Page é uma classe genérica que representa uma página da paginação, ela possui os seguintes métodos:
* `getPageNumber()` que retorna o número da página;
* `getElements()` que retorna os elementos contidos na página;
* `isLastPage()` que retorna um booleano indicando se essa página é a última página;

Fazer uma implementação `PageableList` da interface `Pageable` que possui um construtor que recebe como parâmetros uma lista de elementos e o número de elementos por página.
