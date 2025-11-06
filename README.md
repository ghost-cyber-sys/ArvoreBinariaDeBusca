# ArvoreBinariaDeBusca

🌳 ArvoreBinariaDeBusca (Binary Search Tree - BST)
📝 Descrição
Este projeto consiste na implementação de uma Árvore Binária de Busca (BST) em Java.

A BST é uma estrutura de dados de árvore que mantém seus elementos em ordem. Ela permite a busca, inserção e remoção de forma eficiente. Esta implementação específica inclui funcionalidades para inserir elementos, realizar o percurso Em Ordem (que resulta nos elementos ordenados), calcular a altura da árvore e identificar os nós folha.

O método principal (main) demonstra a construção da BST utilizando uma sequência de dígitos de um Registro Acadêmico (RA: 2403396) e exibe as características resultantes da árvore.

🛠️ Funcionalidades Implementadas
inserir(int valor): Adiciona um novo nó na posição correta da BST. (Trata valores duplicados inserindo-os à direita).

percursoEmOrdem(): Exibe os valores da árvore em ordem crescente.

altura(): Calcula e retorna a altura máxima da árvore (o caminho mais longo da raiz à folha mais distante).

obterFolhas(): Retorna uma string contendo todos os valores dos nós folha (nós sem filhos).

O código está contido no arquivo ArvoreBinariaDeBusca.java. Assume-se a existência de uma classe auxiliar No (não fornecida, mas implicitamente usada) com os atributos valor, esquerda e direita.

ArvoreBinariaDeBusca.java: Contém a classe principal com a lógica da BST (inserção, percursos, altura, folhas).

🚀 Como Executar
Pré-requisitos
Java Development Kit (JDK) instalado.

Passos
Crie o arquivo auxiliar No.java (Necessário para a compilação).

Exemplo Simples de No.java:

public class No {
    int valor;
    No esquerda;
    No direita;

    javac ArvoreBinariaDeBusca.java No.java
    java ArvoreBinariaDeBusca

    Certamente! Com base no seu código Java para uma Árvore Binária de Busca (BST), aqui está um README.md completo e bem estruturado.

🌳 ArvoreBinariaDeBusca (Binary Search Tree - BST)
📝 Descrição
Este projeto consiste na implementação de uma Árvore Binária de Busca (BST) em Java.

A BST é uma estrutura de dados de árvore que mantém seus elementos em ordem. Ela permite a busca, inserção e remoção de forma eficiente. Esta implementação específica inclui funcionalidades para inserir elementos, realizar o percurso Em Ordem (que resulta nos elementos ordenados), calcular a altura da árvore e identificar os nós folha.

O método principal (main) demonstra a construção da BST utilizando uma sequência de dígitos de um Registro Acadêmico (RA: 2403396) e exibe as características resultantes da árvore.

🛠️ Funcionalidades Implementadas
inserir(int valor): Adiciona um novo nó na posição correta da BST. (Trata valores duplicados inserindo-os à direita).

percursoEmOrdem(): Exibe os valores da árvore em ordem crescente.

altura(): Calcula e retorna a altura máxima da árvore (o caminho mais longo da raiz à folha mais distante).

obterFolhas(): Retorna uma string contendo todos os valores dos nós folha (nós sem filhos).

📂 Estrutura do Código
O código está contido no arquivo ArvoreBinariaDeBusca.java. Assume-se a existência de uma classe auxiliar No (não fornecida, mas implicitamente usada) com os atributos valor, esquerda e direita.

ArvoreBinariaDeBusca.java: Contém a classe principal com a lógica da BST (inserção, percursos, altura, folhas).

🚀 Como Executar
Pré-requisitos
Java Development Kit (JDK) instalado.

Passos
Crie o arquivo auxiliar No.java (Necessário para a compilação).

Exemplo Simples de No.java:

Java

public class No {
    int valor;
    No esquerda;
    No direita;
public No(int valor) {
    this.valor = valor;
    this.esquerda = null;
    this.direita = null;
}
}

Compile o código:

Bash

javac ArvoreBinariaDeBusca.java No.java
Execute o programa:

Bash

java ArvoreBinariaDeBusca
🖥️ Exemplo de Saída
A saída do console demonstrará a construção da árvore com a sequência 2, 4, 0, 3, 3, 9, 6 e exibirá as seguintes características:

--- Construção da BST (RA: 2403396) ---
Sequência de Inserção: 2 4 0 3 3 9 6 
-----------------------------------------

--- Características da Árvore Resultante ---
Raiz: 2
Folhas (Nós sem filhos): 3 6
Altura da Árvore: 3
Percurso Em Ordem (Ordenado): 0 2 3 3 4 6 9 
-----------------------------------------
