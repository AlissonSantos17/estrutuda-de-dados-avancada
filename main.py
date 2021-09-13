from ArvoreBinaria import ArvoreBinaria
from No import No

arvore = ArvoreBinaria()

arvore.inserir(53)
arvore.inserir(30)
arvore.inserir(14)
arvore.inserir(39)
arvore.inserir(9)
arvore.inserir(23)
arvore.inserir(34)
arvore.inserir(49)
arvore.inserir(72)
arvore.inserir(61)
arvore.inserir(84)
arvore.inserir(79)
arvore.inserir(89)

print(arvore.raiz.esquerda.valor)
print(arvore.raiz.direita.valor)
print(arvore.ligacoes)

arvore.pesquisar(89)
if arvore.pesquisar(89) is None:
  print('Elemento não localizado.')
else:
  print('Elemento localizado.')