from No import No

class ArvoreBinaria:
  def __init__(self):
    self.raiz = None
    self.ligacoes = []

  def inserir(self, valor):
    novo = No(valor)
    #Verificação caso a arvore esteja vazia
    if self.raiz is None:
      self.raiz = novo
    else:
      atual = self.raiz
      while True:
        pai = atual
        #Esquerda
        if valor <= atual.valor:
          atual = atual.esquerda
          if atual is None:
            pai.esquerda = novo
            self.ligacoes.append(str(pai.valor) + '->' + str(novo.valor))
            return
        #Direita
        else:
          atual = atual.direita
          if atual is None:
            pai.direita = novo
            self.ligacoes.append(str(pai.valor) + '->' + str(novo.valor))
            return
  
  def pesquisar(self, valor):
    atual = self.raiz
    while atual.valor != valor:
      if valor < atual.valor:
        atual = atual.esquerda
      else:
        atual = atual.direita
      if atual is None:
        return None
    return atual