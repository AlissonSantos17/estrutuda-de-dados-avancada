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
        return 'Nó não encontrado.'
    return atual

  def grau(self, no_atual):
    if(no_atual.esquerda is None and no_atual.direita is None):
      return 0
    elif(no_atual.esquerda != None and no_atual.direita != None):
      return 2
    else:
      return 1

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

  def profundidade():
    return 'IMPLEMENTAR'
  
  def nivel(self, valor):
    return self.grau(valor)

  def noFolha(self, valor):
    if valor is None:
      return 0
    if(valor.esquerda is None and valor.direita is None):
      return 1
    return self.noFolha(valor.esquerda) + self.noFolha(valor.direita)

  def iniciarMetodos(self):
    print()
    print(f'Nó -> {entradaNo}')
    print(f'LIGAÇÕES = {arvore.ligacoes}')
    print(f" NÓS FOLHAS 🍃 = {arvore.noFolha(self.raiz)}")
    print(f" GRAU ° = {arvore.grau(self.raiz)}")
    print(f" ALTURA 📏 = {arvore.altura()}")
    print(f" PROFUNDIDADE 📏 = ")
    print(f" NÍVEL 🆙 = {arvore.nivel(self.raiz) + 1}")
    print(f" SUBARVORES ​🌳​​ -> 🌳​​​ = ")

if __name__ == '__main__':  
  arvore = ArvoreBinaria()

  qtdNo = int(input('Quantidade de Nó: '))
  no = []

  for i in range(qtdNo):
    entradaNo = int(input('Digite um número: '))
    arvore.inserir(entradaNo)

    arvore.iniciarMetodos()