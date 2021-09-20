package implementacao;

public class main {
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria(100);

        arvore.adicionaNo(new No(50), arvore.getArvoreBinaria());
        arvore.adicionaNo(new No(110), arvore.getArvoreBinaria());
        arvore.adicionaNo(new No(25), arvore.getArvoreBinaria());
        arvore.adicionaNo(new No(105), arvore.getArvoreBinaria());
        arvore.adicionaNo(new No(120), arvore.getArvoreBinaria());
        arvore.adicionaNo(new No(103), arvore.getArvoreBinaria());

        System.out.println("________________________________________________");
        System.out.println("ILUSTRAÇÃO EM ORDEM:");
        arvore.imprimirEmOrdem(arvore.getArvoreBinaria());

/*
        System.out.println("");

        System.out.println("________________________________________________");
        System.out.println("ILUSTRAÇÃO EM PRÉ-ORDEM:");
        arvore.imprimirPreOrdem(arvore.getArvoreBinaria());
*/

/*
        System.out.println("");

        System.out.println("________________________________________________");
        System.out.println("ILUSTRAÇÃO EM PÓS-ORDEM:");
        arvore.imprimirPosOrdem(arvore.getArvoreBinaria());
*/
        System.out.println("");

        System.out.println("________________________________________________");
        System.out.println("PESQUISA:");
        arvore.busca(50);

        System.out.println("");

        System.out.println("________________________________________________");
        System.out.println("VERIFICAR GRAU DO NÓ:");
        arvore.verificarGrau(50);

        System.out.println("");

        System.out.println("________________________________________________");
        System.out.println("VERIFICAR ALTURA DO NÓ:");
        arvore.verificaAltura(50);

        System.out.println("");

        System.out.println("________________________________________________");
        System.out.println("VERIFICAR PROFUNDIDADE DO NÓ:");
        arvore.verificarProfundidade(50);

        System.out.println("");

        System.out.println("________________________________________________");
        System.out.println("VERIFICAR NÍVEL DO NÓ:");
        arvore.verificarNivel(50);

        System.out.println("");

        System.out.println("________________________________________________");
        System.out.println("SUBARVORES DO NÓ:");
        arvore.subArvore(50);

        System.out.println("");
        System.out.println("___________________________________________________________");
        System.out.println("");

        System.out.println("________________________________________________");
        System.out.println("PESQUISA:");
        arvore.busca(110);

        System.out.println("");

        System.out.println("________________________________________________");
        System.out.println("VERIFICAR GRAU DO NÓ:");
        arvore.verificarGrau(110);

        System.out.println("");

        System.out.println("________________________________________________");
        System.out.println("VERIFICAR ALTURA DO NÓ:");
        arvore.verificaAltura(110);

        System.out.println("");

        System.out.println("________________________________________________");
        System.out.println("VERIFICAR PROFUNDIDADE DO NÓ:");
        arvore.verificarProfundidade(110);

        System.out.println("");

        System.out.println("________________________________________________");
        System.out.println("VERIFICAR NÍVEL DO NÓ:");
        arvore.verificarNivel(110);

        System.out.println("");

        System.out.println("________________________________________________");
        System.out.println("SUBARVORES DO NÓ:");
        arvore.subArvore(110);

        System.out.println("");
        System.out.println("___________________________________________________________");
        System.out.println("");

        System.out.println("________________________________________________");
        System.out.println("PESQUISA:");
        arvore.busca(25);

        System.out.println("");

        System.out.println("________________________________________________");
        System.out.println("VERIFICAR GRAU DO NÓ:");
        arvore.verificarGrau(25);

        System.out.println("");

        System.out.println("________________________________________________");
        System.out.println("VERIFICAR ALTURA DO NÓ:");
        arvore.verificaAltura(25);

        System.out.println("");

        System.out.println("________________________________________________");
        System.out.println("VERIFICAR PROFUNDIDADE DO NÓ:");
        arvore.verificarProfundidade(25);

        System.out.println("");

        System.out.println("________________________________________________");
        System.out.println("VERIFICAR NÍVEL DO NÓ:");
        arvore.verificarNivel(25);

        System.out.println("");

        System.out.println("________________________________________________");
        System.out.println("SUBARVORES DO NÓ:");
        arvore.subArvore(25);

        System.out.println("");
        System.out.println("___________________________________________________________");
        System.out.println("");

        System.out.println("________________________________________________");
        System.out.println("PESQUISA:");
        arvore.busca(105);

        System.out.println("");

        System.out.println("________________________________________________");
        System.out.println("VERIFICAR GRAU DO NÓ:");
        arvore.verificarGrau(105);

        System.out.println("");

        System.out.println("________________________________________________");
        System.out.println("VERIFICAR ALTURA DO NÓ:");
        arvore.verificaAltura(105);

        System.out.println("");

        System.out.println("________________________________________________");
        System.out.println("VERIFICAR PROFUNDIDADE DO NÓ:");
        arvore.verificarProfundidade(105);

        System.out.println("");

        System.out.println("________________________________________________");
        System.out.println("VERIFICAR NÍVEL DO NÓ:");
        arvore.verificarNivel(105);

        System.out.println("");

        System.out.println("________________________________________________");
        System.out.println("SUBARVORES DO NÓ:");
        arvore.subArvore(105);

        System.out.println("");
        System.out.println("___________________________________________________________");
        System.out.println("");

        System.out.println("________________________________________________");
        System.out.println("PESQUISA:");
        arvore.busca(120);

        System.out.println("");

        System.out.println("________________________________________________");
        System.out.println("VERIFICAR GRAU DO NÓ:");
        arvore.verificarGrau(120);

        System.out.println("");

        System.out.println("________________________________________________");
        System.out.println("VERIFICAR ALTURA DO NÓ:");
        arvore.verificaAltura(120);

        System.out.println("");

        System.out.println("________________________________________________");
        System.out.println("VERIFICAR PROFUNDIDADE DO NÓ:");
        arvore.verificarProfundidade(120);

        System.out.println("");

        System.out.println("________________________________________________");
        System.out.println("VERIFICAR NÍVEL DO NÓ:");
        arvore.verificarNivel(120);

        System.out.println("");

        System.out.println("________________________________________________");
        System.out.println("SUBARVORES DO NÓ:");
        arvore.subArvore(120);

        System.out.println("");
        System.out.println("___________________________________________________________");
        System.out.println("");

        System.out.println("________________________________________________");
        System.out.println("PESQUISA:");
        arvore.busca(103);

        System.out.println("");

        System.out.println("________________________________________________");
        System.out.println("VERIFICAR GRAU DO NÓ:");
        arvore.verificarGrau(103);

        System.out.println("");

        System.out.println("________________________________________________");
        System.out.println("VERIFICAR ALTURA DO NÓ:");
        arvore.verificaAltura(103);

        System.out.println("");

        System.out.println("________________________________________________");
        System.out.println("VERIFICAR PROFUNDIDADE DO NÓ:");
        arvore.verificarProfundidade(103);

        System.out.println("");

        System.out.println("________________________________________________");
        System.out.println("VERIFICAR NÍVEL DO NÓ:");
        arvore.verificarNivel(103);

        System.out.println("");

        System.out.println("________________________________________________");
        System.out.println("SUBARVORES DO NÓ:");
        arvore.subArvore(103);
    }
}
