package implementacao;

public class ArvoreBinaria {
    No raiz;

    public ArvoreBinaria(int valor) {
        this.raiz = new No(valor);
    }

    public No getArvoreBinaria() {
        return this.raiz;
    }

    public void getPai(int valor) {
        No no = busca(valor);
        if (no.pai != null) {
            System.out.println("O pai do Nó " + valor + " é " + no.pai.valor);
        } else {
            System.out.println("O Nó " + valor + " é a raiz da arvore.");
        }
    }

    public void adicionaNo(No novoNo, No raiz) {
        if (novoNo.valor > raiz.valor) {
            if (raiz.direito != null) {
                adicionaNo(novoNo, raiz.direito);
            } else {
                raiz.direito = novoNo;
                raiz.direito.pai = raiz;
            }
        } else {
            if (raiz.esquerdo != null) {
                adicionaNo(novoNo, raiz.esquerdo);
            } else {
                raiz.esquerdo = novoNo;
                raiz.esquerdo.pai = raiz;
            }
        }
    }

    public No busca(int valor) {
        return busca(this.raiz, valor);
    }

    public No busca(No no, int valor) {
        if(no.valor == valor) {
            System.out.println("O Nó " + valor + " foi encontrado!");
            return no;
        } else if ((valor < no.valor) && (no.esquerdo != null)) {
            return busca(no.esquerdo, valor);
        } else if ((valor > no.valor) && (no.direito != null)) {
            return busca(no.direito, valor);
        } else {
            System.out.println("O Nó " + valor + " não foi encontrado.");
            return null;
        }

    }

    public void verificarGrau(int valor) {
        No noEncontrado = busca(valor);

        if (noEncontrado == null) {
            System.out.println("O valor não existe na arvore.");
        } else if (noEncontrado.direito == null && noEncontrado.esquerdo == null) {
            System.out.println("O grau do nó " + valor + " é zero.");
        } else if (noEncontrado.direito != null && noEncontrado.esquerdo != null) {
            System.out.println("O grau do Nó " + valor + " é dois.");
        } else {
            System.out.println("O grau do Nó " + valor + " é um.");
        }
    }

    public void verificaAltura(int valor) {
        No noEncontrado = busca(valor);
        System.out.println("A altura do Nó " + valor + " é -> " + verificaAltura(noEncontrado));
    }

    public int verificaAltura(No no) {
        if(no == null) {
            return -1;
        } else if (no.direito == null && no.esquerdo == null) {
            return 0;
        } else if(no.direito == null) {
            return verificaAltura(no.esquerdo) + 1;
        } else if (no.esquerdo == null) {
            return verificaAltura(no.direito) + 1;
        } else {
         return Math.max(verificaAltura(no.esquerdo), verificaAltura(no.direito)) + 1;
        }
    }

    public void verificarProfundidade(int valor) {
        No noEncontrado = busca(valor);
        System.out.println("A profundidade do Nó " + valor +
                " é " + verificarProfundidade(noEncontrado));
    }

    public int verificarProfundidade(No no) {
        if (no == null) {
            return -1;
        } else {
            return verificarProfundidade(no.pai) + 1;
        }
    }

    public void verificarNivel(int valor) {
        No noEncontrado = busca(valor);
        System.out.println("O nivel do Nó " + valor + " é " + verificarProfundidade(noEncontrado));
    }

/*    public int verificarNivel(No no, int valor) {
        if (no == null) {
            return -1;
        } else if (no.valor == valor) {
            return 0;
        } else {
            if(no.valor > valor) {
                return verificarNivel(no.esquerdo, valor) + 1;
            }
        }
        return verificarNivel(no.direito, valor) + 1;
    }*/

    public No subArvore(int valor) {
        return busca(valor);
    }

    public int verificarNoFolha(No no) {
        if (no == null) {
            return 0;
        } else if (no.esquerdo == null && no.direito == null) {
            return 1;
        } else {
            return 1 + verificarNoFolha(no.esquerdo) + verificarNoFolha(no.direito);
        }
    }

    // Imprimir Em-Ordem (ERD)
    public void imprimirEmOrdem(No raiz) {
        if (raiz == null) {
            return;
        }
        imprimirEmOrdem(raiz.esquerdo);
        System.out.print(raiz.valor + "\t ");
        imprimirEmOrdem(raiz.direito);
    }

    // Imprimir Pre-Ordem (RED)
    public void imprimirPreOrdem(No raiz) {
        if (raiz == null) {
            return;
        }
        System.out.print(raiz.valor + "\t ");
        imprimirPreOrdem(raiz.esquerdo);
        imprimirPreOrdem(raiz.direito);
    }

    //Imprimir em Pós-Ordem (EDR)
    public void imprimirPosOrdem(No raiz) {
        if (raiz == null) {
            return;
        }
        imprimirPosOrdem(raiz.esquerdo);
        imprimirPosOrdem(raiz.direito);
        System.out.print(raiz.valor + "\t ");
    }
}
