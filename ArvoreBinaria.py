from No import No

class ArvoreBinaria:
  def __init__(self):
    self.raiz = None
    self.ligacoes = []

  def inserir(self, valor):
    novo = No(valor)
    #Verificação caso a arvore esteja vazia
    if (self.raiz is None):
      self.raiz = novo
    else:
      atual = self.raiz
      while True:
        pai = atual
        #Esquerda
        if (valor <= atual.valor):
          atual = atual.esquerda
          if atual is None:
            pai.esquerda = novo
            self.ligacoes.append(str(pai.valor) + '->' + str(novo.valor))
            return
        #Direita
        else:
          atual = atual.direita
          if (atual is None):
            pai.direita = novo
            self.ligacoes.append(str(pai.valor) + '->' + str(novo.valor))
            return
  
  def pesquisar(self, valor):
    atual = self.raiz

    while (atual.valor != valor):
      if (valor < atual.valor):
        atual = atual.esquerda
      else:
        atual = atual.direita
      if (atual is None):
        return None
    return atual
  
  def getNoFolha():
    pass

  def getGrau(self, no_atual):
    pass

  def altura(self, no=None):
    if no is None:
      no = self.raiz

    altura_esquerda = 0
    altura_direita = 0

    if(no.esquerda):
      altura_esquerda = self.altura(no.esquerda)
    if(no.direita):
      altura_direita = self.altura(no.direita)
    if(altura_direita > altura_esquerda):
      return altura_direita + 1
    return altura_esquerda + 1

  def getProfundidadeNo():
    pass
  
  def getNivel():
    pass