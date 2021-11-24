# AC-05-Estrutura-De-Dados-E-Algoritmos



Luís Gustavo - RA 1904415  
Willian Matheus Montalbo - RA 1904587  
Vinicius Veloso - RA 1905107  



---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------










Tarefa 17: exercícios dos slides de 81 a 84

2. Qual é a saída (desenho do heap) da seguinte sequência de métodos do TAD fila de prioridade: insert(5, A), insert(4, B), insert(7, I), insert(1, D), removeMin( ), insert(3, J), insert(6, L), removeMin( ), removeMin( ), insert(8, G), removeMin( ), insert(2, H), removeMin(), removeMin()?

- [x] 3. Um aeroporto quer simular o tráfego aéreo com eventos como decolagens e pousos. Os eventos têm um time-stamp com a hora em que o evento acontece. O simulador deve realizar eficientemente as duas operações fundamentais a seguir:

   • inserir um evento com um dado time-stamp (ou seja, inserir um evento futuro);

   • extrair o evento com menor time-stamp (ou seja, determinar o próximo evento a processar); 

     Que estrutura de dados você usaria para suportar essas operações? Justifique sua resposta.

   R: Utilizando a fila de prioridade é possível colocar o “timeStamp” como uma chave e extrair o menor valor através da função “removeMin”, obtendo o evento solicitado.

- [x] 4. Onde pode estar armazenado o elemento com a maior chave em um heap?

   R: No último nodo.

- [x] 5. Seja T uma árvore binária completa em que **v** armazena a entrada (**p**(**v**),0), onde **p**(**v**) é o número do nível de **v**. A árvore T é um heap? Justifique sua resposta.

   R: Não, porque pode acontecer um erro com o local onde o “p(v)” é armazenado, ja que o local é utilizado para armazenar a chave do “heap”e se já houver algum elemento neste nível, o sistema vai gerar um erro de chaves.

6. Explique por que não se considera o caso do filho direito de **r** ser interno e o filho esquerdo ser externo quando se descreve o processo do down-heap bubbling.

7. Existe um heap **T** armazenando sete elementos diferentes de forma que um caminhamento prefixado de **T** apresente os elementos de **T** em ordem crescente ou decrescente? E se for um caminhamento interfixado? E pós -fixado? Se sim, apresente um exemplo; caso contrário, justifique.

8. Considere **H** um heap que armazena 15 elementos usando uma representação de arranjo de uma árvore binária completa. Qual é a sequência de índices da lista de arranjo que são visitados no caminhamento prefixado de H? E qual é a sequência em um caminhamento interfixado? E em um caminhamento pós-fixado?

9. Bill afirma que um caminhamento prefixado em um heap listará as chaves em ordem não-decrescente. Apresente um exemplo de um heap que prove que ele está errado.

10. Hillary afirma que um caminhamento pós-fixado em um heap listará as chaves em ordem não-crescente. Apresente um exemplo de um heap que prove que ela está errada.

11. Apresente todos os passos do algoritmo para remover a chave 16 do heap abaixo:

12. [x] Mostre como implementar o TAD pilha usando apenas uma fila de prioridade e uma variável inteira adicional. 

13. [x] Mostre como implementar o TAD fila (padrão) usando apenas uma fila de prioridade e uma variável inteira adicional.

Tarefa 18: exercícios dos slides 84 a 85

- [x] 1. Qual dos esquemas de tratamento de colisão de tabela hash consegue tolerar um fator de carga superior a 1 e qual não consegue?

     R: Consegue – Hashing Suplo
Não consegue – Endereçamento aberto

     
- [x] 2. Qual seria um bom código hash para um número de identificação de veículo que é uma cadeia de caracteres representando números e letras no formato “9X9XX99X9XX999999,” onde um “9” representa um dígito e um “X” representa uma letra?

    R: O código hash “324564517”, pois conseguiria fazer a identificação do veiculo com o formato apresentado.

3. Desenhe a tabela hash com 11 elementos, que resulta a partir do uso da função de hash, h(i) = (3i + 5) mod 11, para colocar as chaves 12, 44, 13, 88, 23, 94, 11, 39, 20, 16 e 5, assumindo que as colisões serão tratadas por encadeamento.
    R: 

5. Qual será o resultado do exercício 3 se assumirmos que as colisões serão tratadas por teste linear?
    R:

7. Mostre o resultado do exercício 3 assumindo que as colisões são tratadas por teste quadrático, até o ponto em que o método falha.
8. Qual é o resultado do exercício 3 assumindo que as colisões são tratadas por hashing duplo usando uma função hash secundária h’(k)=7 (k mod 7)?
9. Forneça uma descrição em pseudocódigo da inserção em uma tabela hash que usa teste quadrático para resolver colisões, assumindo que se usa o truque de substituir elementos deletados com um objeto indicando “item desativado”.
10. Pesquise sobre o TAD Dicionário e descreva a principal diferença desse TAD com o TAD Mapa.
      
      R:  A principal diferença entre os dois é que TAD Mapa possui chaves únicas e TAD Dicionário possui vários valores em uma chave.

Tarefa 19: exercícios do slide 16

Tarefa 20: exercícios do slide 29

 - [x] 2. Inserindo-se as entradas (1,A), (2,B), (3,C), (4,D) e (5,E), nessa ordem, em uma árvore de pesquisa binária inicialmente vazia, qual será sua aparência?
  

 
 3. Define-se uma árvore binária de pesquisa em que as chaves iguais à chave do nodo podem estar ou à esquerda ou à direita da subárvore deste nodo. Suponha que se altere a definição na qual restringimos chaves iguais na subárvore à direita. Qual seria a subárvore de uma árvore binária de pesquisa que contenha somente chaves iguais, como visto neste caso?
 4. Insira, em uma árvore binária de pesquisa vazia, itens com as chaves 30, 40, 24, 58, 48, 26, 11, 13 (nesta ordem). Desenhe a árvore após cada inserção.
	
 - [x] 5. Quantas árvores binárias de pesquisas diferentes podem armazenar as chaves {1,2,3}?

     R:6 Árvores
	
 6. O professor Amongus afirma que a ordem na qual um conjunto fixo de itens é inserido em uma árvore binária de pesquisa não interessa — sempre resulta na mesma árvore. Apresente um pequeno exemplo que prove que ele está errado.

Ex1: 3 – 1 – 6 – 5
Ex2: 5 – 6 – 1 – 3 



Tarefa 21: exercícios dos slides 39 e 40

- [x] 2. Inserindo-se as entradas (1,A), (2,B), (3,C), (4,D) e (5,E), nessa ordem, em uma árvore AVL inicialmente vazia, qual será sua aparência?




3. O professor Amongus afirma que a ordem na qual um conjunto fixo de itens é inserido em uma árvore AVL não interessa — sempre resulta na mesma árvore. Apresente um pequeno exemplo que prove que ele está errado.

4. Desenhe a árvore AVL resultante da inserção de um elemento com chave 52 na árvore AVL abaixo.




5. Desenhe a árvore AVL resultante da remoção de um elemento com chave 62 na árvore AVL após a inserção da chave 52 na árvore AVL abaixo.


