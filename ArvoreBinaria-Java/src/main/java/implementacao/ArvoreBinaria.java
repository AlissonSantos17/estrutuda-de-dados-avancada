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

    public void remover(int valor) {
        remover(raiz, valor);
    }

    public No remover(No no, int valor) {
        if (no != null) {
            if (valor < no.valor) {
                no.esquerdo = remover(no.esquerdo, valor);
            } else if (valor > no.valor) {
                no.direito = remover(no.direito, valor);
            } else if (no.esquerdo != null && no.direito != null) {
                System.out.println("O Nó " + no.valor + " foi removido.");
                no.valor = getMenor(no.direito).valor;
                no.direito = removeMenor(no.direito);
            } else if (no.esquerdo == null) {
                no = no.direito;
            } else if (no.direito == null) {
                no = no.esquerdo;
            }

            if (valor != this.raiz.valor) {
                return no;
            } else {
                System.out.println("A raiz foi excluída.");
                this.raiz.valor = 0;
                return no = null;
            }
        } else {
            System.out.println("O Nó não existe na árvore.");
            return null;
        }
    }

    public No getMenor(No no) {
        if (no != null) {
            while(no.esquerdo != null) {
                no = no.esquerdo;
            }
        }
        return no;
    }

    public No removeMenor(No no) {
        if (no == null) {
            System.out.println("Erro, o Nó é nulo.");
        } else if (no.esquerdo != null) {
            no.esquerdo = removeMenor(no.esquerdo);
            return no;
        } else {
            return no.direito;
        }

        return null;
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

    public void inveterLadosSubarvores() {
        raiz = inveterLadosSubarvores(this.raiz);
    }

    public No inveterLadosSubarvores(No no) {
        if (no == null) {
            return no;
        }

        No esquerda = inveterLadosSubarvores(no.esquerdo);
        No direita = inveterLadosSubarvores(no.direito);

        no.esquerdo = direita;
        no.direito = esquerda;

        return no;
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

    public void imprimir() {

        Impressao<No> p = new Impressao<>(n -> n.valor + "", n -> n.esquerdo, n -> n.direito);
        p.setSquareBranches(false);
        p.printTree(raiz);

    }
}
