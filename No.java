public class No {
    // O valor armazenado neste nó.
    int valor;

    // Referência para o filho à esquerda (menores).
    No esquerda;

    // Referência para o filho à direita (maiores ou iguais).
    No direita;

    /**
     * Construtor para criar um novo nó.
     * @param valor O valor a ser armazenado no nó.
     */
    public No(int valor) {
        this.valor = valor;
        this.esquerda = null;
        this.direita = null;
    }
}