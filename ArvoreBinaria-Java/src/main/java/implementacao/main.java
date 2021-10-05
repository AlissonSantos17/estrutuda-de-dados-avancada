package implementacao;

public class main {
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria(50);
        arvore.adicionaNo(new No(3), arvore.getArvoreBinaria());
        arvore.adicionaNo(new No(70), arvore.getArvoreBinaria());
        arvore.adicionaNo(new No(2), arvore.getArvoreBinaria());
        arvore.adicionaNo(new No(4), arvore.getArvoreBinaria());
        arvore.adicionaNo(new No(8), arvore.getArvoreBinaria());
        arvore.adicionaNo(new No(6), arvore.getArvoreBinaria());
        arvore.adicionaNo(new No(9), arvore.getArvoreBinaria());

        System.out.println("Árvore Original:");
        arvore.imprimir();
        System.out.println("\n");

        arvore.remover(8);
        System.out.println("Árvore após exclusão:");
        arvore.imprimir();

        System.out.println("Pré-Ordem:");
        arvore.imprimirPreOrdem(arvore.getArvoreBinaria());

        System.out.println("\nEm-Ordem:");
        arvore.imprimirEmOrdem(arvore.getArvoreBinaria());

        System.out.println("\nPós-Ordem:");
        arvore.imprimirPosOrdem(arvore.getArvoreBinaria());
        System.out.println("\n");

        arvore.inveterLadosSubarvores();

        System.out.println("\nÁrvore com Lados Invertidos:");
        arvore.imprimir();
    }
}
