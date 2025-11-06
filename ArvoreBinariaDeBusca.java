// Conteúdo do arquivo ArvoreBinariaDeBusca.java
public class ArvoreBinariaDeBusca {
    No raiz;

    // --- PONTO DE ENTRADA CORRIGIDO (Método main) ---
    public static void main(String[] args){
        // Sequência de Inserção: Dígitos do RA 2403396
        int[] sequenciaInsercao = {2, 4, 0, 3, 3, 9, 6};

        // Instancia a classe para acessar os métodos de inserção e análise
        ArvoreBinariaDeBusca bst = new ArvoreBinariaDeBusca();

        System.out.println("--- Construção da BST (RA: 2403396) ---");
        System.out.print("Sequência de Inserção: ");
        for (int i : sequenciaInsercao) {
            System.out.print(i + " ");
            bst.inserir(i);
        }
        System.out.println("\n-----------------------------------------");

        // Exibe as Características da Árvore Resultante[cite: 19].
        System.out.println("\n--- Características da Árvore Resultante ---");

        // Raiz [cite: 20]
        System.out.println("Raiz: " + (bst.raiz != null ? bst.raiz.valor : "Árvore Vazia"));

        // Folhas (Nós sem filhos) [cite: 22]
        System.out.println("Folhas (Nós sem filhos): " + bst.obterFolhas());

        // Altura da Árvore [cite: 23]
        System.out.println("Altura da Árvore: " + bst.altura());

        // Percurso Em Ordem (Ordenado) [cite: 24, 27]
        System.out.print("Percurso Em Ordem (Ordenado): ");
        bst.percursoEmOrdem();

        System.out.println("-----------------------------------------");
    }
    // --- FIM DA CORREÇÃO ---

    public ArvoreBinariaDeBusca() {
        this.raiz = null;
    }

    public void inserir(int valor) {
        this.raiz = inserirRecursivo(this.raiz, valor);
    }

    private No inserirRecursivo(No atual, int valor) {
        if (atual == null) {
            return new No(valor);
        }

        if (valor < atual.valor) { // Se o novo número for menor que o nó atual, vá para a esquerda[cite: 15].
            atual.esquerda = inserirRecursivo(atual.esquerda, valor);
        } else { // Se o novo número for maior que o nó atual, vá para a direita[cite: 16]. (Inclui o caso de valores iguais)
            atual.direita = inserirRecursivo(atual.direita, valor);
        }

        return atual;
    }

    public void percursoEmOrdem() {
        percursoEmOrdemRecursivo(this.raiz);
        System.out.println();
    }

    private void percursoEmOrdemRecursivo(No no) {
        if (no != null) {
            percursoEmOrdemRecursivo(no.esquerda);
            System.out.print(no.valor + " ");
            percursoEmOrdemRecursivo(no.direita);
        }
    }

    public int altura() {
        return calcularAltura(this.raiz);
    }

    private int calcularAltura(No no) {
        if (no == null) {
            return -1;
        }
        return Math.max(calcularAltura(no.esquerda), calcularAltura(no.direita)) + 1;
    }

    public String obterFolhas() {
        StringBuilder folhas = new StringBuilder();
        coletarFolhasRecursivo(this.raiz, folhas);
        return folhas.toString().trim();
    }

    private void coletarFolhasRecursivo(No no, StringBuilder folhas) {
        if (no != null) {
            if (no.esquerda == null && no.direita == null) { // Folhas são nós sem filhos[cite: 22].
                folhas.append(no.valor).append(" ");
            }
            coletarFolhasRecursivo(no.esquerda, folhas);
            coletarFolhasRecursivo(no.direita, folhas);
        }
    }
}